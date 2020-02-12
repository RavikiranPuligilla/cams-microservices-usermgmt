
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelPriceRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelPriceRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minPriceIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minPriceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxPriceIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxPriceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelPriceRange", propOrder = {
    "minPrice",
    "minPriceIncluded",
    "minPriceState",
    "maxPrice",
    "maxPriceIncluded",
    "maxPriceState"
})
public class ModelPriceRange {

    protected double minPrice;
    protected boolean minPriceIncluded;
    @XmlElement(required = true)
    protected PriceState minPriceState;
    protected double maxPrice;
    protected boolean maxPriceIncluded;
    @XmlElement(required = true)
    protected PriceState maxPriceState;

    /**
     * Gets the value of the minPrice property.
     * 
     */
    public double getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     */
    public void setMinPrice(double value) {
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
     * Gets the value of the minPriceState property.
     * 
     * @return
     *     possible object is
     *     {@link PriceState }
     *     
     */
    public PriceState getMinPriceState() {
        return minPriceState;
    }

    /**
     * Sets the value of the minPriceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceState }
     *     
     */
    public void setMinPriceState(PriceState value) {
        this.minPriceState = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     */
    public double getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     */
    public void setMaxPrice(double value) {
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

    /**
     * Gets the value of the maxPriceState property.
     * 
     * @return
     *     possible object is
     *     {@link PriceState }
     *     
     */
    public PriceState getMaxPriceState() {
        return maxPriceState;
    }

    /**
     * Sets the value of the maxPriceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceState }
     *     
     */
    public void setMaxPriceState(PriceState value) {
        this.maxPriceState = value;
    }

}
