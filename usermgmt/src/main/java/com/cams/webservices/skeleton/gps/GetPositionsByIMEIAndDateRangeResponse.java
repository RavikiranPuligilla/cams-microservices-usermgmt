
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
 *         &lt;element name="GetPositionsByIMEIAndDateRangeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPositionsByIMEIAndDateRangeResult"
})
@XmlRootElement(name = "GetPositionsByIMEIAndDateRangeResponse")
public class GetPositionsByIMEIAndDateRangeResponse {

    @XmlElement(name = "GetPositionsByIMEIAndDateRangeResult")
    protected String getPositionsByIMEIAndDateRangeResult;

    /**
     * Gets the value of the getPositionsByIMEIAndDateRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPositionsByIMEIAndDateRangeResult() {
        return getPositionsByIMEIAndDateRangeResult;
    }

    /**
     * Sets the value of the getPositionsByIMEIAndDateRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPositionsByIMEIAndDateRangeResult(String value) {
        this.getPositionsByIMEIAndDateRangeResult = value;
    }

}
