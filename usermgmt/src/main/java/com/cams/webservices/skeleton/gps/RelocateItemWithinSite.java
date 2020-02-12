
package com.cams.webservices.skeleton.gps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="securityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeHistory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "securityToken",
    "imei",
    "destinationClient",
    "destinationGroup",
    "includeHistory"
})
@XmlRootElement(name = "RelocateItemWithinSite")
public class RelocateItemWithinSite {

    protected String securityToken;
    protected String imei;
    protected String destinationClient;
    protected String destinationGroup;
    protected String includeHistory;

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the destinationClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationClient() {
        return destinationClient;
    }

    /**
     * Sets the value of the destinationClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationClient(String value) {
        this.destinationClient = value;
    }

    /**
     * Gets the value of the destinationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationGroup() {
        return destinationGroup;
    }

    /**
     * Sets the value of the destinationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationGroup(String value) {
        this.destinationGroup = value;
    }

    /**
     * Gets the value of the includeHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeHistory() {
        return includeHistory;
    }

    /**
     * Sets the value of the includeHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeHistory(String value) {
        this.includeHistory = value;
    }

}
