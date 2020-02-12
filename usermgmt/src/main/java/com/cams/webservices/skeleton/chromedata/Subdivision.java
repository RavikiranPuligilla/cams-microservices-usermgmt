
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subdivision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subdivision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subdivisionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subdivisionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subdivision", propOrder = {
    "subdivisionId",
    "subdivisionName"
})
public class Subdivision {

    protected int subdivisionId;
    @XmlElement(required = true)
    protected String subdivisionName;

    /**
     * Gets the value of the subdivisionId property.
     * 
     */
    public int getSubdivisionId() {
        return subdivisionId;
    }

    /**
     * Sets the value of the subdivisionId property.
     * 
     */
    public void setSubdivisionId(int value) {
        this.subdivisionId = value;
    }

    /**
     * Gets the value of the subdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivisionName() {
        return subdivisionName;
    }

    /**
     * Sets the value of the subdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivisionName(String value) {
        this.subdivisionName = value;
    }

}
