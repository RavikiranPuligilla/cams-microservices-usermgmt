
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
 *         &lt;element name="modelYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subdivisionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumerFriendlyModelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterRules" type="{urn:configcompare4g.kp.chrome.com}FilterRules"/>
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
    "modelYear",
    "subdivisionId",
    "consumerFriendlyModelName",
    "filterRules"
})
@XmlRootElement(name = "StylesByConsumerModelNameAndSubdivisionRequest")
public class StylesByConsumerModelNameAndSubdivisionRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    protected int modelYear;
    protected int subdivisionId;
    @XmlElement(required = true)
    protected String consumerFriendlyModelName;
    @XmlElement(required = true)
    protected FilterRules filterRules;

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
     * Gets the value of the modelYear property.
     * 
     */
    public int getModelYear() {
        return modelYear;
    }

    /**
     * Sets the value of the modelYear property.
     * 
     */
    public void setModelYear(int value) {
        this.modelYear = value;
    }

    /**
     * Gets the value of the subdivisionId property.
     * 
     */
    public int getSubdivisionId() {
        return subdivisionId;
    }

    /**
     * Sets the value of the subdivisionId property.
     * 
     */
    public void setSubdivisionId(int value) {
        this.subdivisionId = value;
    }

    /**
     * Gets the value of the consumerFriendlyModelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFriendlyModelName() {
        return consumerFriendlyModelName;
    }

    /**
     * Sets the value of the consumerFriendlyModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFriendlyModelName(String value) {
        this.consumerFriendlyModelName = value;
    }

    /**
     * Gets the value of the filterRules property.
     * 
     * @return
     *     possible object is
     *     {@link FilterRules }
     *     
     */
    public FilterRules getFilterRules() {
        return filterRules;
    }

    /**
     * Sets the value of the filterRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterRules }
     *     
     */
    public void setFilterRules(FilterRules value) {
        this.filterRules = value;
    }

}
