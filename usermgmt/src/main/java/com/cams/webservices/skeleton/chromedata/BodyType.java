
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bodyTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bodyTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyType", propOrder = {
    "bodyTypeId",
    "bodyTypeName",
    "primary"
})
public class BodyType {

    protected int bodyTypeId;
    @XmlElement(required = true, nillable = true)
    protected String bodyTypeName;
    protected boolean primary;

    /**
     * Gets the value of the bodyTypeId property.
     * 
     */
    public int getBodyTypeId() {
        return bodyTypeId;
    }

    /**
     * Sets the value of the bodyTypeId property.
     * 
     */
    public void setBodyTypeId(int value) {
        this.bodyTypeId = value;
    }

    /**
     * Gets the value of the bodyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyTypeName() {
        return bodyTypeName;
    }

    /**
     * Sets the value of the bodyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyTypeName(String value) {
        this.bodyTypeName = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
    }

}
