﻿//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 01:45:13 PM CST 
//


package com.yonyou.studio.mdp.inspector.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}dependConnection" maxOccurs="unbounded"/>
 *         &lt;element ref="{}busiitfconnection" maxOccurs="unbounded"/>
 *         &lt;element ref="{}AggregationRelation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dependConnection",
    "busiitfconnection",
    "aggregationRelation"
})
@XmlRootElement(name = "connectlist")
public class Connectlist {

    @XmlElement(required = true)
    protected List<DependConnection> dependConnection;
    @XmlElement(required = true)
    protected List<Busiitfconnection> busiitfconnection;
    @XmlElement(name = "AggregationRelation", required = true)
    protected List<AggregationRelation> aggregationRelation;

    /**
     * Gets the value of the dependConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DependConnection }
     * 
     * 
     */
    public List<DependConnection> getDependConnection() {
        if (dependConnection == null) {
            dependConnection = new ArrayList<DependConnection>();
        }
        return this.dependConnection;
    }

    /**
     * Gets the value of the busiitfconnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busiitfconnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusiitfconnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Busiitfconnection }
     * 
     * 
     */
    public List<Busiitfconnection> getBusiitfconnection() {
        if (busiitfconnection == null) {
            busiitfconnection = new ArrayList<Busiitfconnection>();
        }
        return this.busiitfconnection;
    }

    /**
     * Gets the value of the aggregationRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregationRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregationRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregationRelation }
     * 
     * 
     */
    public List<AggregationRelation> getAggregationRelation() {
        if (aggregationRelation == null) {
            aggregationRelation = new ArrayList<AggregationRelation>();
        }
        return this.aggregationRelation;
    }

}
