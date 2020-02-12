
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
 *         &lt;element name="modelConfigurationState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromeOptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "modelConfigurationState",
    "chromeOptionCode",
    "returnParameters"
})
@XmlRootElement(name = "ToggleModelEquipmentRequest")
public class ToggleModelEquipmentRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected String modelConfigurationState;
    @XmlElement(required = true)
    protected String chromeOptionCode;
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
     * Gets the value of the modelConfigurationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelConfigurationState() {
        return modelConfigurationState;
    }

    /**
     * Sets the value of the modelConfigurationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelConfigurationState(String value) {
        this.modelConfigurationState = value;
    }

    /**
     * Gets the value of the chromeOptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromeOptionCode() {
        return chromeOptionCode;
    }

    /**
     * Sets the value of the chromeOptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromeOptionCode(String value) {
        this.chromeOptionCode = value;
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
