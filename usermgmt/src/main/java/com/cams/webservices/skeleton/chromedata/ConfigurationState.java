
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConfigurationState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataVersion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="styleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fullyConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderAvailability" type="{urn:configcompare4g.kp.chrome.com}OrderAvailability"/>
 *         &lt;element name="specialEquipmentEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="optionOrderLogicDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initialPricingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chromeOptionCodeToggleStream" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="selectedChromeOptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conditionProperties" type="{urn:configcompare4g.kp.chrome.com}ConditionProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constraint" type="{urn:configcompare4g.kp.chrome.com}ConfigurationConstraint"/>
 *         &lt;element name="userDefinedTechSpecs" type="{urn:configcompare4g.kp.chrome.com}UserDefinedTechSpecs"/>
 *         &lt;element name="serializedValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationState", propOrder = {
    "dataVersion",
    "styleId",
    "fullyConfigured",
    "orderAvailability",
    "specialEquipmentEnabled",
    "optionOrderLogicDisabled",
    "initialPricingEnabled",
    "chromeOptionCodeToggleStream",
    "selectedChromeOptionCodes",
    "conditionProperties",
    "constraint",
    "userDefinedTechSpecs",
    "serializedValue"
})
public class ConfigurationState {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVersion;
    protected int styleId;
    protected boolean fullyConfigured;
    @XmlElement(required = true)
    protected OrderAvailability orderAvailability;
    protected boolean specialEquipmentEnabled;
    protected boolean optionOrderLogicDisabled;
    protected boolean initialPricingEnabled;
    protected List<String> chromeOptionCodeToggleStream;
    protected List<String> selectedChromeOptionCodes;
    protected List<ConditionProperty> conditionProperties;
    @XmlElement(required = true, nillable = true)
    protected ConfigurationConstraint constraint;
    @XmlElement(required = true, nillable = true)
    protected UserDefinedTechSpecs userDefinedTechSpecs;
    @XmlElement(required = true)
    protected String serializedValue;

    /**
     * Gets the value of the dataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVersion() {
        return dataVersion;
    }

    /**
     * Sets the value of the dataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVersion(XMLGregorianCalendar value) {
        this.dataVersion = value;
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
     * Gets the value of the fullyConfigured property.
     * 
     */
    public boolean isFullyConfigured() {
        return fullyConfigured;
    }

    /**
     * Sets the value of the fullyConfigured property.
     * 
     */
    public void setFullyConfigured(boolean value) {
        this.fullyConfigured = value;
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
     * Gets the value of the specialEquipmentEnabled property.
     * 
     */
    public boolean isSpecialEquipmentEnabled() {
        return specialEquipmentEnabled;
    }

    /**
     * Sets the value of the specialEquipmentEnabled property.
     * 
     */
    public void setSpecialEquipmentEnabled(boolean value) {
        this.specialEquipmentEnabled = value;
    }

    /**
     * Gets the value of the optionOrderLogicDisabled property.
     * 
     */
    public boolean isOptionOrderLogicDisabled() {
        return optionOrderLogicDisabled;
    }

    /**
     * Sets the value of the optionOrderLogicDisabled property.
     * 
     */
    public void setOptionOrderLogicDisabled(boolean value) {
        this.optionOrderLogicDisabled = value;
    }

    /**
     * Gets the value of the initialPricingEnabled property.
     * 
     */
    public boolean isInitialPricingEnabled() {
        return initialPricingEnabled;
    }

    /**
     * Sets the value of the initialPricingEnabled property.
     * 
     */
    public void setInitialPricingEnabled(boolean value) {
        this.initialPricingEnabled = value;
    }

    /**
     * Gets the value of the chromeOptionCodeToggleStream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chromeOptionCodeToggleStream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChromeOptionCodeToggleStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChromeOptionCodeToggleStream() {
        if (chromeOptionCodeToggleStream == null) {
            chromeOptionCodeToggleStream = new ArrayList<String>();
        }
        return this.chromeOptionCodeToggleStream;
    }

    /**
     * Gets the value of the selectedChromeOptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedChromeOptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedChromeOptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelectedChromeOptionCodes() {
        if (selectedChromeOptionCodes == null) {
            selectedChromeOptionCodes = new ArrayList<String>();
        }
        return this.selectedChromeOptionCodes;
    }

    /**
     * Gets the value of the conditionProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionProperty }
     * 
     * 
     */
    public List<ConditionProperty> getConditionProperties() {
        if (conditionProperties == null) {
            conditionProperties = new ArrayList<ConditionProperty>();
        }
        return this.conditionProperties;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationConstraint }
     *     
     */
    public ConfigurationConstraint getConstraint() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationConstraint }
     *     
     */
    public void setConstraint(ConfigurationConstraint value) {
        this.constraint = value;
    }

    /**
     * Gets the value of the userDefinedTechSpecs property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedTechSpecs }
     *     
     */
    public UserDefinedTechSpecs getUserDefinedTechSpecs() {
        return userDefinedTechSpecs;
    }

    /**
     * Sets the value of the userDefinedTechSpecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedTechSpecs }
     *     
     */
    public void setUserDefinedTechSpecs(UserDefinedTechSpecs value) {
        this.userDefinedTechSpecs = value;
    }

    /**
     * Gets the value of the serializedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerializedValue() {
        return serializedValue;
    }

    /**
     * Sets the value of the serializedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerializedValue(String value) {
        this.serializedValue = value;
    }

}
