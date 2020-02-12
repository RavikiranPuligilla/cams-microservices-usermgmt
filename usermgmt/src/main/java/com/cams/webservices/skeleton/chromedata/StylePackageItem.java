
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StylePackageItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StylePackageItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="optionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="availability" type="{urn:configcompare4g.kp.chrome.com}StylePackageItemAvailability"/>
 *         &lt;element name="displaySequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StylePackageItem", propOrder = {
    "optionCode",
    "description",
    "availability",
    "displaySequence"
})
public class StylePackageItem {

    @XmlElement(required = true, nillable = true)
    protected String optionCode;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected StylePackageItemAvailability availability;
    protected int displaySequence;

    /**
     * Gets the value of the optionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * Sets the value of the optionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCode(String value) {
        this.optionCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link StylePackageItemAvailability }
     *     
     */
    public StylePackageItemAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link StylePackageItemAvailability }
     *     
     */
    public void setAvailability(StylePackageItemAvailability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     */
    public int getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     */
    public void setDisplaySequence(int value) {
        this.displaySequence = value;
    }

}
