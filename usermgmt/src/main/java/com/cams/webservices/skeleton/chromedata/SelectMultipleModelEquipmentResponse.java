
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unrecognizedOptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="incompatibleOptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuration" type="{urn:configcompare4g.kp.chrome.com}ModelConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unrecognizedOptionCodes",
    "incompatibleOptionCodes",
    "configuration"
})
@XmlRootElement(name = "SelectMultipleModelEquipmentResponse")
public class SelectMultipleModelEquipmentResponse {

    protected List<String> unrecognizedOptionCodes;
    protected List<String> incompatibleOptionCodes;
    @XmlElement(required = true)
    protected ModelConfiguration configuration;

    /**
     * Gets the value of the unrecognizedOptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrecognizedOptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrecognizedOptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnrecognizedOptionCodes() {
        if (unrecognizedOptionCodes == null) {
            unrecognizedOptionCodes = new ArrayList<String>();
        }
        return this.unrecognizedOptionCodes;
    }

    /**
     * Gets the value of the incompatibleOptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incompatibleOptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncompatibleOptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncompatibleOptionCodes() {
        if (incompatibleOptionCodes == null) {
            incompatibleOptionCodes = new ArrayList<String>();
        }
        return this.incompatibleOptionCodes;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link ModelConfiguration }
     *     
     */
    public ModelConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelConfiguration }
     *     
     */
    public void setConfiguration(ModelConfiguration value) {
        this.configuration = value;
    }

}
