
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
 *         &lt;element name="GetMDTMessagesByIMEIResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getMDTMessagesByIMEIResult"
})
@XmlRootElement(name = "GetMDTMessagesByIMEIResponse")
public class GetMDTMessagesByIMEIResponse {

    @XmlElement(name = "GetMDTMessagesByIMEIResult")
    protected String getMDTMessagesByIMEIResult;

    /**
     * Gets the value of the getMDTMessagesByIMEIResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetMDTMessagesByIMEIResult() {
        return getMDTMessagesByIMEIResult;
    }

    /**
     * Sets the value of the getMDTMessagesByIMEIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetMDTMessagesByIMEIResult(String value) {
        this.getMDTMessagesByIMEIResult = value;
    }

}
