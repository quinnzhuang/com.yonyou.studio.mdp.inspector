package com.yonyou.studio.mdp.inspector.Utils;

public class StringUtils {
	
	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}
	
	public static boolean isEmpty(String[] strs) {
		return strs == null || strs.length == 0;
	}
	
	public static boolean contains(String source, String inner) {
		if (isEmpty(source))
			return false;
		if (isEmpty(inner))
			return true;
		return source.indexOf(inner) > -1;
	}
	
	public static int contains(String[] strs, String inner) {
		if (strs == null || strs.length == 0) 
			return -1;
		for (int i = 0; i < strs.length; i++) {
			if (contains(strs[i], inner))
				return i;
		}
		return -1;
	}

}
