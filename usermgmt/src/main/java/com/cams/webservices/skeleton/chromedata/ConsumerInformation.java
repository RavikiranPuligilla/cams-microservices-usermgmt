
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crashTestRating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rebate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recall" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="warranty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerInformation", propOrder = {
    "crashTestRating",
    "rebate",
    "recall",
    "warranty"
})
public class ConsumerInformation {

    @XmlElement(required = true, nillable = true)
    protected String crashTestRating;
    @XmlElement(required = true, nillable = true)
    protected String rebate;
    @XmlElement(required = true, nillable = true)
    protected String recall;
    @XmlElement(required = true, nillable = true)
    protected String warranty;

    /**
     * Gets the value of the crashTestRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrashTestRating() {
        return crashTestRating;
    }

    /**
     * Sets the value of the crashTestRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrashTestRating(String value) {
        this.crashTestRating = value;
    }

    /**
     * Gets the value of the rebate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebate() {
        return rebate;
    }

    /**
     * Sets the value of the rebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebate(String value) {
        this.rebate = value;
    }

    /**
     * Gets the value of the recall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecall() {
        return recall;
    }

    /**
     * Sets the value of the recall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecall(String value) {
        this.recall = value;
    }

    /**
     * Gets the value of the warranty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarranty() {
        return warranty;
    }

    /**
     * Sets the value of the warranty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarranty(String value) {
        this.warranty = value;
    }

}
