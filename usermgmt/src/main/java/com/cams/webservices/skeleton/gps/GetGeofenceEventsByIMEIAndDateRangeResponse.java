
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
 *         &lt;element name="GetGeofenceEventsByIMEIAndDateRangeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getGeofenceEventsByIMEIAndDateRangeResult"
})
@XmlRootElement(name = "GetGeofenceEventsByIMEIAndDateRangeResponse")
public class GetGeofenceEventsByIMEIAndDateRangeResponse {

    @XmlElement(name = "GetGeofenceEventsByIMEIAndDateRangeResult")
    protected String getGeofenceEventsByIMEIAndDateRangeResult;

    /**
     * Gets the value of the getGeofenceEventsByIMEIAndDateRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetGeofenceEventsByIMEIAndDateRangeResult() {
        return getGeofenceEventsByIMEIAndDateRangeResult;
    }

    /**
     * Sets the value of the getGeofenceEventsByIMEIAndDateRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetGeofenceEventsByIMEIAndDateRangeResult(String value) {
        this.getGeofenceEventsByIMEIAndDateRangeResult = value;
    }

}
