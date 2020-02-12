
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
 * <p>Java class for ModelConfigurationState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelConfigurationState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataVersion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="modelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="styleConfigurations" type="{urn:configcompare4g.kp.chrome.com}ConfigurationState" maxOccurs="unbounded"/>
 *         &lt;element name="availableStyleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fullyConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderAvailability" type="{urn:configcompare4g.kp.chrome.com}OrderAvailability"/>
 *         &lt;element name="specialEquipmentEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="equipmentToggleStream" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="selectedEquipmentCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conditionProperties" type="{urn:configcompare4g.kp.chrome.com}ConditionProperty" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ModelConfigurationState", propOrder = {
    "dataVersion",
    "modelId",
    "styleConfigurations",
    "availableStyleIds",
    "fullyConfigured",
    "orderAvailability",
    "specialEquipmentEnabled",
    "equipmentToggleStream",
    "selectedEquipmentCodes",
    "conditionProperties",
    "userDefinedTechSpecs",
    "serializedValue"
})
public class ModelConfigurationState {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVersion;
    protected int modelId;
    @XmlElement(required = true)
    protected List<ConfigurationState> styleConfigurations;
    @XmlElement(type = Integer.class)
    protected List<Integer> availableStyleIds;
    protected boolean fullyConfigured;
    @XmlElement(required = true)
    protected OrderAvailability orderAvailability;
    protected boolean specialEquipmentEnabled;
    protected List<String> equipmentToggleStream;
    protected List<String> selectedEquipmentCodes;
    protected List<ConditionProperty> conditionProperties;
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
     * Gets the value of the modelId property.
     * 
     */
    public int getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     */
    public void setModelId(int value) {
        this.modelId = value;
    }

    /**
     * Gets the value of the styleConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationState }
     * 
     * 
     */
    public List<ConfigurationState> getStyleConfigurations() {
        if (styleConfigurations == null) {
            styleConfigurations = new ArrayList<ConfigurationState>();
        }
        return this.styleConfigurations;
    }

    /**
     * Gets the value of the availableStyleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableStyleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableStyleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAvailableStyleIds() {
        if (availableStyleIds == null) {
            availableStyleIds = new ArrayList<Integer>();
        }
        return this.availableStyleIds;
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
     * Gets the value of the equipmentToggleStream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentToggleStream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentToggleStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquipmentToggleStream() {
        if (equipmentToggleStream == null) {
            equipmentToggleStream = new ArrayList<String>();
        }
        return this.equipmentToggleStream;
    }

    /**
     * Gets the value of the selectedEquipmentCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedEquipmentCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedEquipmentCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelectedEquipmentCodes() {
        if (selectedEquipmentCodes == null) {
            selectedEquipmentCodes = new ArrayList<String>();
        }
        return this.selectedEquipmentCodes;
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
