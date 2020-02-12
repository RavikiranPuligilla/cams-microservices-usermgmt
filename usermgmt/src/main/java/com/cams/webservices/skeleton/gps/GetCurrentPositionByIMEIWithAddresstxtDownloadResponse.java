
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
 *         &lt;element name="GetCurrentPositionByIMEIWithAddresstxtDownloadResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getCurrentPositionByIMEIWithAddresstxtDownloadResult"
})
@XmlRootElement(name = "GetCurrentPositionByIMEIWithAddresstxtDownloadResponse")
public class GetCurrentPositionByIMEIWithAddresstxtDownloadResponse {

    @XmlElement(name = "GetCurrentPositionByIMEIWithAddresstxtDownloadResult")
    protected String getCurrentPositionByIMEIWithAddresstxtDownloadResult;

    /**
     * Gets the value of the getCurrentPositionByIMEIWithAddresstxtDownloadResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCurrentPositionByIMEIWithAddresstxtDownloadResult() {
        return getCurrentPositionByIMEIWithAddresstxtDownloadResult;
    }

    /**
     * Sets the value of the getCurrentPositionByIMEIWithAddresstxtDownloadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCurrentPositionByIMEIWithAddresstxtDownloadResult(String value) {
        this.getCurrentPositionByIMEIWithAddresstxtDownloadResult = value;
    }

}
