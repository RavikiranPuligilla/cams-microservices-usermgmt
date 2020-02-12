
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
 *         &lt;element name="sourceConfigurationState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetConfigurationStates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "sourceConfigurationState",
    "targetConfigurationStates"
})
@XmlRootElement(name = "AutoEquipRequest")
public class AutoEquipRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected String sourceConfigurationState;
    @XmlElement(required = true)
    protected List<String> targetConfigurationStates;

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
     * Gets the value of the sourceConfigurationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceConfigurationState() {
        return sourceConfigurationState;
    }

    /**
     * Sets the value of the sourceConfigurationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceConfigurationState(String value) {
        this.sourceConfigurationState = value;
    }

    /**
     * Gets the value of the targetConfigurationStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetConfigurationStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetConfigurationStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetConfigurationStates() {
        if (targetConfigurationStates == null) {
            targetConfigurationStates = new ArrayList<String>();
        }
        return this.targetConfigurationStates;
    }

}
