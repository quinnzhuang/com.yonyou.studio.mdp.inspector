﻿//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 01:45:13 PM CST 
//


package com.yonyou.studio.mdp.inspector.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}guideList"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isHorizontal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="unit" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guideList"
})
@XmlRootElement(name = "ruler")
public class Ruler {

    @XmlElement(required = true)
    protected GuideList guideList;
    @XmlAttribute(name = "isHorizontal", required = true)
    protected boolean isHorizontal;
    @XmlAttribute(name = "unit", required = true)
    protected BigInteger unit;

    /**
     * Gets the value of the guideList property.
     * 
     * @return
     *     possible object is
     *     {@link GuideList }
     *     
     */
    public GuideList getGuideList() {
        return guideList;
    }

    /**
     * Sets the value of the guideList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuideList }
     *     
     */
    public void setGuideList(GuideList value) {
        this.guideList = value;
    }

    /**
     * Gets the value of the isHorizontal property.
     * 
     */
    public boolean isIsHorizontal() {
        return isHorizontal;
    }

    /**
     * Sets the value of the isHorizontal property.
     * 
     */
    public void setIsHorizontal(boolean value) {
        this.isHorizontal = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnit(BigInteger value) {
        this.unit = value;
    }

}
