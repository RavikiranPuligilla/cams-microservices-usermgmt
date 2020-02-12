
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
 *         &lt;element name="styleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderAvailability" type="{urn:configcompare4g.kp.chrome.com}OrderAvailability"/>
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
    "styleId",
    "orderAvailability"
})
@XmlRootElement(name = "OrderableOptionCodesRequest")
public class OrderableOptionCodesRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    protected int styleId;
    @XmlElement(required = true)
    protected OrderAvailability orderAvailability;

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

}
