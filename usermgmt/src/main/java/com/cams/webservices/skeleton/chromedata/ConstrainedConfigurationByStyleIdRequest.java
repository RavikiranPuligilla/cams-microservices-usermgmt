
package com.cams.webservices.skeleton.chromedata;

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
 *         &lt;element name="accountInfo" type="{urn:configcompare4g.kp.chrome.com}AccountInfo"/>
 *         &lt;element name="orderAvailability" type="{urn:configcompare4g.kp.chrome.com}OrderAvailability"/>
 *         &lt;element name="styleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="constraint" type="{urn:configcompare4g.kp.chrome.com}ConfigurationConstraint"/>
 *         &lt;element name="returnParameters" type="{urn:configcompare4g.kp.chrome.com}ReturnParameters"/>
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
    "accountInfo",
    "orderAvailability",
    "styleId",
    "constraint",
    "returnParameters"
})
@XmlRootElement(name = "ConstrainedConfigurationByStyleIdRequest")
public class ConstrainedConfigurationByStyleIdRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected OrderAvailability orderAvailability;
    protected int styleId;
    @XmlElement(required = true)
    protected ConfigurationConstraint constraint;
    @XmlElement(required = true, nillable = true)
    protected ReturnParameters returnParameters;

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfo }
     *     
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfo }
     *     
     */
    public void setAccountInfo(AccountInfo value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the orderAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAvailability }
     *     
     */
    public OrderAvailability getOrderAvailability() {
        return orderAvailability;
    }

    /**
     * Sets the value of the orderAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAvailability }
     *     
     */
    public void setOrderAvailability(OrderAvailability value) {
        this.orderAvailability = value;
    }

    /**
     * Gets the value of the styleId property.
     * 
     */
    public int getStyleId() {
        return styleId;
    }

    /**
     * Sets the value of the styleId property.
     * 
     */
    public void setStyleId(int value) {
        this.styleId = value;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationConstraint }
     *     
     */
    public ConfigurationConstraint getConstraint() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationConstraint }
     *     
     */
    public void setConstraint(ConfigurationConstraint value) {
        this.constraint = value;
    }

    /**
     * Gets the value of the returnParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnParameters }
     *     
     */
    public ReturnParameters getReturnParameters() {
        return returnParameters;
    }

    /**
     * Sets the value of the returnParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnParameters }
     *     
     */
    public void setReturnParameters(ReturnParameters value) {
        this.returnParameters = value;
    }

}
