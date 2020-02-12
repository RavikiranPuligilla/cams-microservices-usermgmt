
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnhancedPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhancedPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="masked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="priceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="priceLevel" type="{urn:configcompare4g.kp.chrome.com}EnhancedPriceLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedPrice", propOrder = {
    "price",
    "masked",
    "priceState",
    "priceLevel"
})
public class EnhancedPrice {

    protected double price;
    protected boolean masked;
    @XmlElement(required = true)
    protected PriceState priceState;
    @XmlElement(required = true)
    protected EnhancedPriceLevel priceLevel;

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the masked property.
     * 
     */
    public boolean isMasked() {
        return masked;
    }

    /**
     * Sets the value of the masked property.
     * 
     */
    public void setMasked(boolean value) {
        this.masked = value;
    }

    /**
     * Gets the value of the priceState property.
     * 
     * @return
     *     possible object is
     *     {@link PriceState }
     *     
     */
    public PriceState getPriceState() {
        return priceState;
    }

    /**
     * Sets the value of the priceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceState }
     *     
     */
    public void setPriceState(PriceState value) {
        this.priceState = value;
    }

    /**
     * Gets the value of the priceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedPriceLevel }
     *     
     */
    public EnhancedPriceLevel getPriceLevel() {
        return priceLevel;
    }

    /**
     * Sets the value of the priceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedPriceLevel }
     *     
     */
    public void setPriceLevel(EnhancedPriceLevel value) {
        this.priceLevel = value;
    }

}
