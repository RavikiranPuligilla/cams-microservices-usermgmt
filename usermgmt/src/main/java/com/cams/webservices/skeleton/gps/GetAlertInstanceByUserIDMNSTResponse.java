
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
 *         &lt;element name="GetAlertInstanceByUserID_MNSTResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getAlertInstanceByUserIDMNSTResult"
})
@XmlRootElement(name = "GetAlertInstanceByUserID_MNSTResponse")
public class GetAlertInstanceByUserIDMNSTResponse {

    @XmlElement(name = "GetAlertInstanceByUserID_MNSTResult")
    protected String getAlertInstanceByUserIDMNSTResult;

    /**
     * Gets the value of the getAlertInstanceByUserIDMNSTResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAlertInstanceByUserIDMNSTResult() {
        return getAlertInstanceByUserIDMNSTResult;
    }

    /**
     * Sets the value of the getAlertInstanceByUserIDMNSTResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAlertInstanceByUserIDMNSTResult(String value) {
        this.getAlertInstanceByUserIDMNSTResult = value;
    }

}
