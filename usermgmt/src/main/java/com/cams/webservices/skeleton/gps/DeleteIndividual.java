
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
 *         &lt;element name="individualID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "individualID"
})
@XmlRootElement(name = "DeleteIndividual")
public class DeleteIndividual {

    protected String securityToken;
    protected String individualID;

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
     * Gets the value of the individualID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualID() {
        return individualID;
    }

    /**
     * Sets the value of the individualID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualID(String value) {
        this.individualID = value;
    }

}
