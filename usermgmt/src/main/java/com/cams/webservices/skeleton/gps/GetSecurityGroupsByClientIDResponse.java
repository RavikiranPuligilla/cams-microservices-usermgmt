
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
 *         &lt;element name="GetSecurityGroupsByClientIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSecurityGroupsByClientIDResult"
})
@XmlRootElement(name = "GetSecurityGroupsByClientIDResponse")
public class GetSecurityGroupsByClientIDResponse {

    @XmlElement(name = "GetSecurityGroupsByClientIDResult")
    protected String getSecurityGroupsByClientIDResult;

    /**
     * Gets the value of the getSecurityGroupsByClientIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetSecurityGroupsByClientIDResult() {
        return getSecurityGroupsByClientIDResult;
    }

    /**
     * Sets the value of the getSecurityGroupsByClientIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetSecurityGroupsByClientIDResult(String value) {
        this.getSecurityGroupsByClientIDResult = value;
    }

}
