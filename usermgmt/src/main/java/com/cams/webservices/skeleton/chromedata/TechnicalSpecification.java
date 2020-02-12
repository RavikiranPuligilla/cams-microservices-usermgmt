
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="headerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="titleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measurementUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="upgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalSpecification", propOrder = {
    "groupId",
    "groupName",
    "headerId",
    "headerName",
    "titleId",
    "titleName",
    "value",
    "measurementUnit",
    "upgrade",
    "sequence"
})
public class TechnicalSpecification {

    protected int groupId;
    @XmlElement(required = true, nillable = true)
    protected String groupName;
    protected int headerId;
    @XmlElement(required = true, nillable = true)
    protected String headerName;
    protected int titleId;
    @XmlElement(required = true)
    protected String titleName;
    @XmlElement(required = true, nillable = true)
    protected String value;
    @XmlElement(required = true, nillable = true)
    protected String measurementUnit;
    protected boolean upgrade;
    protected int sequence;

    /**
     * Gets the value of the groupId property.
     * 
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(int value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     */
    public int getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     */
    public void setHeaderId(int value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the headerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderName() {
        return headerName;
    }

    /**
     * Sets the value of the headerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderName(String value) {
        this.headerName = value;
    }

    /**
     * Gets the value of the titleId property.
     * 
     */
    public int getTitleId() {
        return titleId;
    }

    /**
     * Sets the value of the titleId property.
     * 
     */
    public void setTitleId(int value) {
        this.titleId = value;
    }

    /**
     * Gets the value of the titleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * Sets the value of the titleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleName(String value) {
        this.titleName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Sets the value of the measurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementUnit(String value) {
        this.measurementUnit = value;
    }

    /**
     * Gets the value of the upgrade property.
     * 
     */
    public boolean isUpgrade() {
        return upgrade;
    }

    /**
     * Sets the value of the upgrade property.
     * 
     */
    public void setUpgrade(boolean value) {
        this.upgrade = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

}
