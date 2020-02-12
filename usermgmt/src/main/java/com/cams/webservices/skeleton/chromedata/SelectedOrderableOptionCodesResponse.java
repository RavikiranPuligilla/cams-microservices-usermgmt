
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="configurationComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="configurationOrderable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="optionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorMessages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "configurationComplete",
    "configurationOrderable",
    "optionCodes",
    "errorMessages"
})
@XmlRootElement(name = "SelectedOrderableOptionCodesResponse")
public class SelectedOrderableOptionCodesResponse {

    protected boolean configurationComplete;
    protected boolean configurationOrderable;
    protected List<String> optionCodes;
    protected List<String> errorMessages;

    /**
     * Gets the value of the configurationComplete property.
     * 
     */
    public boolean isConfigurationComplete() {
        return configurationComplete;
    }

    /**
     * Sets the value of the configurationComplete property.
     * 
     */
    public void setConfigurationComplete(boolean value) {
        this.configurationComplete = value;
    }

    /**
     * Gets the value of the configurationOrderable property.
     * 
     */
    public boolean isConfigurationOrderable() {
        return configurationOrderable;
    }

    /**
     * Sets the value of the configurationOrderable property.
     * 
     */
    public void setConfigurationOrderable(boolean value) {
        this.configurationOrderable = value;
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
     * Gets the value of the errorMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorMessages() {
        if (errorMessages == null) {
            errorMessages = new ArrayList<String>();
        }
        return this.errorMessages;
    }

}
