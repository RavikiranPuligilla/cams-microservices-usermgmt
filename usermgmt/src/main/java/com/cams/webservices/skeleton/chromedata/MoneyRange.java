
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maximumPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyRange", propOrder = {
    "minimumPrice",
    "maximumPrice"
})
public class MoneyRange {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double minimumPrice;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double maximumPrice;

    /**
     * Gets the value of the minimumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Sets the value of the minimumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumPrice(Double value) {
        this.minimumPrice = value;
    }

    /**
     * Gets the value of the maximumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumPrice() {
        return maximumPrice;
    }

    /**
     * Sets the value of the maximumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumPrice(Double value) {
        this.maximumPrice = value;
    }

}
