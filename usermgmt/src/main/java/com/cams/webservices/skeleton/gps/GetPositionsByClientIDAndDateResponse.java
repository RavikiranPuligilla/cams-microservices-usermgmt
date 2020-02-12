
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
 *         &lt;element name="GetPositionsByClientIDAndDateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPositionsByClientIDAndDateResult"
})
@XmlRootElement(name = "GetPositionsByClientIDAndDateResponse")
public class GetPositionsByClientIDAndDateResponse {

    @XmlElement(name = "GetPositionsByClientIDAndDateResult")
    protected String getPositionsByClientIDAndDateResult;

    /**
     * Gets the value of the getPositionsByClientIDAndDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPositionsByClientIDAndDateResult() {
        return getPositionsByClientIDAndDateResult;
    }

    /**
     * Sets the value of the getPositionsByClientIDAndDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPositionsByClientIDAndDateResult(String value) {
        this.getPositionsByClientIDAndDateResult = value;
    }

}
