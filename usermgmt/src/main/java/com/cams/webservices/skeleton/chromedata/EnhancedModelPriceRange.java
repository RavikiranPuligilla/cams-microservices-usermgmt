
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnhancedModelPriceRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhancedModelPriceRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minPrice" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice"/>
 *         &lt;element name="minPriceIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxPrice" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice"/>
 *         &lt;element name="maxPriceIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedModelPriceRange", propOrder = {
    "minPrice",
    "minPriceIncluded",
    "maxPrice",
    "maxPriceIncluded"
})
public class EnhancedModelPriceRange {

    @XmlElement(required = true)
    protected EnhancedPrice minPrice;
    protected boolean minPriceIncluded;
    @XmlElement(required = true)
    protected EnhancedPrice maxPrice;
    protected boolean maxPriceIncluded;

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedPrice }
     *     
     */
    public EnhancedPrice getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedPrice }
     *     
     */
    public void setMinPrice(EnhancedPrice value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the minPriceIncluded property.
     * 
     */
    public boolean isMinPriceIncluded() {
        return minPriceIncluded;
    }

    /**
     * Sets the value of the minPriceIncluded property.
     * 
     */
    public void setMinPriceIncluded(boolean value) {
        this.minPriceIncluded = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedPrice }
     *     
     */
    public EnhancedPrice getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedPrice }
     *     
     */
    public void setMaxPrice(EnhancedPrice value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the maxPriceIncluded property.
     * 
     */
    public boolean isMaxPriceIncluded() {
        return maxPriceIncluded;
    }

    /**
     * Sets the value of the maxPriceIncluded property.
     * 
     */
    public void setMaxPriceIncluded(boolean value) {
        this.maxPriceIncluded = value;
    }

}
