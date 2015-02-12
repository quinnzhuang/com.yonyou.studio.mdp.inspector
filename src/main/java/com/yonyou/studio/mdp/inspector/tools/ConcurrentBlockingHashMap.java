package com.yonyou.studio.mdp.inspector.tools;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentBlockingHashMap<K, V> extends ConcurrentHashMap<K, V> {

	private static final long serialVersionUID = 2665812411800767558L;

	private static class LockCondition {

		private final Lock lock;

		private final Condition condition;

		public LockCondition() {
			lock = new ReentrantLock();
			condition = lock.newCondition();
		}

		public void lock() {
			lock.lock();
		}

		public void unlock() {
			lock.unlock();
		}

		public long awaitNanos(long nanosTimeout) throws InterruptedException {
			return condition.awaitNanos(nanosTimeout);
		}

		public void singalAll() {
			condition.signalAll();
		}

	}

	private final ConcurrentHashMap<K, LockCondition> placeHolderMap = new ConcurrentHashMap<>(
			512);

	public V computeIfAbsent(K key, Callable<V> f, long timeout, TimeUnit unit)
			throws InterruptedException {
		long nanos = unit.toNanos(timeout);
		while (nanos > 0) {
			if (containsKey(key)) {
//				System.out.println("no lock");
				return get(key);
			}
			LockCondition lockCondition = placeHolderMap.putIfAbsent(key,
					new LockCondition());
			if (lockCondition == null) {
//				System.out.println("compute");
				compute(key, f);
			} else {
//				System.out.println("await");
				nanos = await(key, nanos);
			}
		}
		return null;
	}

	private long await(K key, long nanos) throws InterruptedException {
		placeHolderMap.get(key).lock();
		try {
			if (!containsKey(key)) {
				nanos = placeHolderMap.get(key).awaitNanos(nanos);
			}
		} catch (Exception e) {
			throw new InterruptedException(e.getMessage());
		} finally {
			placeHolderMap.get(key).unlock();
		}
		return nanos;
	}

	private void compute(K key, Callable<V> f) throws InterruptedException {
		try {
			put(key, f.call());
		} catch (Exception e) {
			throw new InterruptedException(e.getMessage());
		}
		placeHolderMap.get(key).lock();
		try {
			placeHolderMap.get(key).singalAll();
		} catch (Exception e) {
			throw new InterruptedException(e.getMessage());
		} finally {
			placeHolderMap.get(key).unlock();
		}
	}

}
