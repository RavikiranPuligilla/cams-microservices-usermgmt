
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="styleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="orderAvailability" type="{urn:configcompare4g.kp.chrome.com}OrderAvailability"/>
 *         &lt;element name="returnParameters" type="{urn:configcompare4g.kp.chrome.com}ModelReturnParameters"/>
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
    "styleIds",
    "orderAvailability",
    "returnParameters"
})
@XmlRootElement(name = "ModelConfigurationByStyleIdsRequest")
public class ModelConfigurationByStyleIdsRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(type = Integer.class)
    protected List<Integer> styleIds;
    @XmlElement(required = true)
    protected OrderAvailability orderAvailability;
    @XmlElement(required = true, nillable = true)
    protected ModelReturnParameters returnParameters;

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
     * Gets the value of the styleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getStyleIds() {
        if (styleIds == null) {
            styleIds = new ArrayList<Integer>();
        }
        return this.styleIds;
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
     * Gets the value of the returnParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ModelReturnParameters }
     *     
     */
    public ModelReturnParameters getReturnParameters() {
        return returnParameters;
    }

    /**
     * Sets the value of the returnParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelReturnParameters }
     *     
     */
    public void setReturnParameters(ModelReturnParameters value) {
        this.returnParameters = value;
    }

}
