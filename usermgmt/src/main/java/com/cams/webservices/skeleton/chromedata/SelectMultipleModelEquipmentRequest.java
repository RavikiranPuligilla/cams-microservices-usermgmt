
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
 *         &lt;element name="modelConfigurationState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "optionCodes",
    "returnParameters"
})
@XmlRootElement(name = "SelectMultipleModelEquipmentRequest")
public class SelectMultipleModelEquipmentRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected String modelConfigurationState;
    @XmlElement(required = true)
    protected List<String> optionCodes;
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
     * Gets the value of the optionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOptionCodes() {
        if (optionCodes == null) {
            optionCodes = new ArrayList<String>();
        }
        return this.optionCodes;
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
