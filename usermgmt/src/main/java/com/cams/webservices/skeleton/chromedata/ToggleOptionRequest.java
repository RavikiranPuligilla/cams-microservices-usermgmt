
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
 *         &lt;element name="configurationState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromeOptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnParameters" type="{urn:configcompare4g.kp.chrome.com}ReturnParameters"/>
 *         &lt;element name="returnDeltaConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "configurationState",
    "chromeOptionCode",
    "returnParameters",
    "returnDeltaConfiguration"
})
@XmlRootElement(name = "ToggleOptionRequest")
public class ToggleOptionRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected String configurationState;
    @XmlElement(required = true)
    protected String chromeOptionCode;
    @XmlElement(required = true, nillable = true)
    protected ReturnParameters returnParameters;
    protected boolean returnDeltaConfiguration;

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
     * Gets the value of the configurationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationState() {
        return configurationState;
    }

    /**
     * Sets the value of the configurationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationState(String value) {
        this.configurationState = value;
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

    /**
     * Gets the value of the returnDeltaConfiguration property.
     * 
     */
    public boolean isReturnDeltaConfiguration() {
        return returnDeltaConfiguration;
    }

    /**
     * Sets the value of the returnDeltaConfiguration property.
     * 
     */
    public void setReturnDeltaConfiguration(boolean value) {
        this.returnDeltaConfiguration = value;
    }

}
