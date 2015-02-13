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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}operationlist"/>
 *         &lt;element ref="{}opImpllist"/>
 *       &lt;/sequence>
 *       &lt;attribute name="componentID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="createIndustry" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="createTime" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="creator" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="displayName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="fullClassName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="help" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="implClsName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="industryChanged" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isAuthorization" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isBusiActivity" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isBusiOperation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isSource" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="modifier" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="modifyIndustry" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="modifyTime" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="remote" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="resid" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="singleton" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transprop" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="versionType" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="visibility" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operationlist",
    "opImpllist"
})
@XmlRootElement(name = "opinterface")
public class Opinterface {

    @XmlElement(required = true)
    protected Operationlist operationlist;
    @XmlElement(required = true)
    protected OpImpllist opImpllist;
    @XmlAttribute(name = "componentID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String componentID;
    @XmlAttribute(name = "createIndustry", required = true)
    protected BigInteger createIndustry;
    @XmlAttribute(name = "createTime", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String createTime;
    @XmlAttribute(name = "creator", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String creator;
    @XmlAttribute(name = "description", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String description;
    @XmlAttribute(name = "displayName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String displayName;
    @XmlAttribute(name = "fullClassName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fullClassName;
    @XmlAttribute(name = "height", required = true)
    protected BigInteger height;
    @XmlAttribute(name = "help", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String help;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "implClsName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String implClsName;
    @XmlAttribute(name = "industryChanged", required = true)
    protected boolean industryChanged;
    @XmlAttribute(name = "isAuthorization", required = true)
    protected boolean isAuthorization;
    @XmlAttribute(name = "isBusiActivity", required = true)
    protected boolean isBusiActivity;
    @XmlAttribute(name = "isBusiOperation", required = true)
    protected boolean isBusiOperation;
    @XmlAttribute(name = "isSource", required = true)
    protected boolean isSource;
    @XmlAttribute(name = "modifier", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String modifier;
    @XmlAttribute(name = "modifyIndustry", required = true)
    protected BigInteger modifyIndustry;
    @XmlAttribute(name = "modifyTime", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String modifyTime;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "remote", required = true)
    protected boolean remote;
    @XmlAttribute(name = "resid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String resid;
    @XmlAttribute(name = "singleton", required = true)
    protected boolean singleton;
    @XmlAttribute(name = "transprop", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String transprop;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "versionType", required = true)
    protected BigInteger versionType;
    @XmlAttribute(name = "visibility", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String visibility;
    @XmlAttribute(name = "width", required = true)
    protected BigInteger width;
    @XmlAttribute(name = "x", required = true)
    protected BigInteger x;
    @XmlAttribute(name = "y", required = true)
    protected BigInteger y;

    /**
     * Gets the value of the operationlist property.
     * 
     * @return
     *     possible object is
     *     {@link Operationlist }
     *     
     */
    public Operationlist getOperationlist() {
        return operationlist;
    }

    /**
     * Sets the value of the operationlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operationlist }
     *     
     */
    public void setOperationlist(Operationlist value) {
        this.operationlist = value;
    }

    /**
     * Gets the value of the opImpllist property.
     * 
     * @return
     *     possible object is
     *     {@link OpImpllist }
     *     
     */
    public OpImpllist getOpImpllist() {
        return opImpllist;
    }

    /**
     * Sets the value of the opImpllist property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpImpllist }
     *     
     */
    public void setOpImpllist(OpImpllist value) {
        this.opImpllist = value;
    }

    /**
     * Gets the value of the componentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentID() {
        return componentID;
    }

    /**
     * Sets the value of the componentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentID(String value) {
        this.componentID = value;
    }

    /**
     * Gets the value of the createIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreateIndustry() {
        return createIndustry;
    }

    /**
     * Sets the value of the createIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreateIndustry(BigInteger value) {
        this.createIndustry = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the fullClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullClassName() {
        return fullClassName;
    }

    /**
     * Sets the value of the fullClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullClassName(String value) {
        this.fullClassName = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * Gets the value of the help property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelp() {
        return help;
    }

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelp(String value) {
        this.help = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the implClsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplClsName() {
        return implClsName;
    }

    /**
     * Sets the value of the implClsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplClsName(String value) {
        this.implClsName = value;
    }

    /**
     * Gets the value of the industryChanged property.
     * 
     */
    public boolean isIndustryChanged() {
        return industryChanged;
    }

    /**
     * Sets the value of the industryChanged property.
     * 
     */
    public void setIndustryChanged(boolean value) {
        this.industryChanged = value;
    }

    /**
     * Gets the value of the isAuthorization property.
     * 
     */
    public boolean isIsAuthorization() {
        return isAuthorization;
    }

    /**
     * Sets the value of the isAuthorization property.
     * 
     */
    public void setIsAuthorization(boolean value) {
        this.isAuthorization = value;
    }

    /**
     * Gets the value of the isBusiActivity property.
     * 
     */
    public boolean isIsBusiActivity() {
        return isBusiActivity;
    }

    /**
     * Sets the value of the isBusiActivity property.
     * 
     */
    public void setIsBusiActivity(boolean value) {
        this.isBusiActivity = value;
    }

    /**
     * Gets the value of the isBusiOperation property.
     * 
     */
    public boolean isIsBusiOperation() {
        return isBusiOperation;
    }

    /**
     * Sets the value of the isBusiOperation property.
     * 
     */
    public void setIsBusiOperation(boolean value) {
        this.isBusiOperation = value;
    }

    /**
     * Gets the value of the isSource property.
     * 
     */
    public boolean isIsSource() {
        return isSource;
    }

    /**
     * Sets the value of the isSource property.
     * 
     */
    public void setIsSource(boolean value) {
        this.isSource = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier(String value) {
        this.modifier = value;
    }

    /**
     * Gets the value of the modifyIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModifyIndustry() {
        return modifyIndustry;
    }

    /**
     * Sets the value of the modifyIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModifyIndustry(BigInteger value) {
        this.modifyIndustry = value;
    }

    /**
     * Gets the value of the modifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * Sets the value of the modifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyTime(String value) {
        this.modifyTime = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the remote property.
     * 
     */
    public boolean isRemote() {
        return remote;
    }

    /**
     * Sets the value of the remote property.
     * 
     */
    public void setRemote(boolean value) {
        this.remote = value;
    }

    /**
     * Gets the value of the resid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResid() {
        return resid;
    }

    /**
     * Sets the value of the resid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResid(String value) {
        this.resid = value;
    }

    /**
     * Gets the value of the singleton property.
     * 
     */
    public boolean isSingleton() {
        return singleton;
    }

    /**
     * Sets the value of the singleton property.
     * 
     */
    public void setSingleton(boolean value) {
        this.singleton = value;
    }

    /**
     * Gets the value of the transprop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransprop() {
        return transprop;
    }

    /**
     * Sets the value of the transprop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransprop(String value) {
        this.transprop = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionType() {
        return versionType;
    }

    /**
     * Sets the value of the versionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersionType(BigInteger value) {
        this.versionType = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setX(BigInteger value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setY(BigInteger value) {
        this.y = value;
    }

}
