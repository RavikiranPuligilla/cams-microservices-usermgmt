
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
 *         &lt;element name="GetAlertInstanceByItemIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getAlertInstanceByItemIDResult"
})
@XmlRootElement(name = "GetAlertInstanceByItemIDResponse")
public class GetAlertInstanceByItemIDResponse {

    @XmlElement(name = "GetAlertInstanceByItemIDResult")
    protected String getAlertInstanceByItemIDResult;

    /**
     * Gets the value of the getAlertInstanceByItemIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAlertInstanceByItemIDResult() {
        return getAlertInstanceByItemIDResult;
    }

    /**
     * Sets the value of the getAlertInstanceByItemIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAlertInstanceByItemIDResult(String value) {
        this.getAlertInstanceByItemIDResult = value;
    }

}
