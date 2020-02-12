
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationCheckListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationCheckListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionKindId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chromeOptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="satisfied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationCheckListItem", propOrder = {
    "itemName",
    "optionKindId",
    "chromeOptionCodes",
    "satisfied"
})
public class ConfigurationCheckListItem {

    @XmlElement(required = true, nillable = true)
    protected String itemName;
    protected int optionKindId;
    protected List<String> chromeOptionCodes;
    protected boolean satisfied;

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the optionKindId property.
     * 
     */
    public int getOptionKindId() {
        return optionKindId;
    }

    /**
     * Sets the value of the optionKindId property.
     * 
     */
    public void setOptionKindId(int value) {
        this.optionKindId = value;
    }

    /**
     * Gets the value of the chromeOptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chromeOptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChromeOptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChromeOptionCodes() {
        if (chromeOptionCodes == null) {
            chromeOptionCodes = new ArrayList<String>();
        }
        return this.chromeOptionCodes;
    }

    /**
     * Gets the value of the satisfied property.
     * 
     */
    public boolean isSatisfied() {
        return satisfied;
    }

    /**
     * Sets the value of the satisfied property.
     * 
     */
    public void setSatisfied(boolean value) {
        this.satisfied = value;
    }

}
