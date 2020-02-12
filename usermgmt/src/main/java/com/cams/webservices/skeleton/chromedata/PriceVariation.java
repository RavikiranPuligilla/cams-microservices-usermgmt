
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceVariation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceVariation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="priceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="enhancedPrices" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceVariation", propOrder = {
    "active",
    "reason",
    "msrp",
    "invoice",
    "priceState",
    "enhancedPrices"
})
public class PriceVariation {

    protected boolean active;
    @XmlElement(required = true)
    protected String reason;
    protected double msrp;
    protected double invoice;
    @XmlElement(required = true)
    protected PriceState priceState;
    protected List<EnhancedPrice> enhancedPrices;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the msrp property.
     * 
     */
    public double getMsrp() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     */
    public void setMsrp(double value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     */
    public double getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     */
    public void setInvoice(double value) {
        this.invoice = value;
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
     * Gets the value of the enhancedPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedPrice }
     * 
     * 
     */
    public List<EnhancedPrice> getEnhancedPrices() {
        if (enhancedPrices == null) {
            enhancedPrices = new ArrayList<EnhancedPrice>();
        }
        return this.enhancedPrices;
    }

}
