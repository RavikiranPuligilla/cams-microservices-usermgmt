
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="priceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="styleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelPrice", propOrder = {
    "value",
    "priceState",
    "styleId"
})
public class ModelPrice {

    protected double value;
    @XmlElement(required = true)
    protected PriceState priceState;
    protected int styleId;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
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
     * Gets the value of the styleId property.
     * 
     */
    public int getStyleId() {
        return styleId;
    }

    /**
     * Sets the value of the styleId property.
     * 
     */
    public void setStyleId(int value) {
        this.styleId = value;
    }

}
