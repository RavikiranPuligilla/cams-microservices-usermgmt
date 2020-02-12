
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
 *         &lt;element name="configurationState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customEquipment" type="{urn:configcompare4g.kp.chrome.com}CustomEquipment" maxOccurs="unbounded"/>
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
    "configurationState",
    "customEquipment",
    "returnParameters"
})
@XmlRootElement(name = "ConfigurationWithCustomEquipmentRequest")
public class ConfigurationWithCustomEquipmentRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected String configurationState;
    @XmlElement(required = true)
    protected List<CustomEquipment> customEquipment;
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
     * Gets the value of the customEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomEquipment }
     * 
     * 
     */
    public List<CustomEquipment> getCustomEquipment() {
        if (customEquipment == null) {
            customEquipment = new ArrayList<CustomEquipment>();
        }
        return this.customEquipment;
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
