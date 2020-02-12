
package com.cams.webservices.skeleton.gps;

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
 *         &lt;element name="SecurityKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListenerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "securityKey",
    "listenerName",
    "imei",
    "rawMessage",
    "messageXML"
})
@XmlRootElement(name = "MessageLogSaveUnprocessed")
public class MessageLogSaveUnprocessed {

    @XmlElement(name = "SecurityKey")
    protected String securityKey;
    @XmlElement(name = "ListenerName")
    protected String listenerName;
    @XmlElement(name = "IMEI")
    protected String imei;
    @XmlElement(name = "RawMessage")
    protected String rawMessage;
    @XmlElement(name = "MessageXML")
    protected String messageXML;

    /**
     * Gets the value of the securityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityKey() {
        return securityKey;
    }

    /**
     * Sets the value of the securityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityKey(String value) {
        this.securityKey = value;
    }

    /**
     * Gets the value of the listenerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListenerName() {
        return listenerName;
    }

    /**
     * Sets the value of the listenerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListenerName(String value) {
        this.listenerName = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
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
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the rawMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawMessage() {
        return rawMessage;
    }

    /**
     * Sets the value of the rawMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawMessage(String value) {
        this.rawMessage = value;
    }

    /**
     * Gets the value of the messageXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageXML() {
        return messageXML;
    }

    /**
     * Sets the value of the messageXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageXML(String value) {
        this.messageXML = value;
    }

}
