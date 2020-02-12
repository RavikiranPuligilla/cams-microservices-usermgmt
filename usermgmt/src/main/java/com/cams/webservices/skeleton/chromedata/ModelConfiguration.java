
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="styles" type="{urn:configcompare4g.kp.chrome.com}Style" maxOccurs="unbounded"/>
 *         &lt;element name="availableStyleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuredOptionsMsrp" type="{urn:configcompare4g.kp.chrome.com}ModelPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuredOptionsInvoice" type="{urn:configcompare4g.kp.chrome.com}ModelPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enhancedConfiguredOptionsPrices" type="{urn:configcompare4g.kp.chrome.com}EnhancedModelPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activeConfiguredOptionsMsrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeConfiguredOptionsInvoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeConfiguredOptionsPriceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="activeEnhancedConfiguredOptionsPrices" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuredCustomEquipmentMsrp" type="{urn:configcompare4g.kp.chrome.com}ModelPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuredCustomEquipmentInvoice" type="{urn:configcompare4g.kp.chrome.com}ModelPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activeConfiguredCustomEquipmentMsrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeConfiguredCustomEquipmentInvoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeAdvertisingAndAdjustmentsMsrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeAdvertisingAndAdjustmentsInvoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeEnhancedAdvertisingAndAdjustments" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activeTaxItems" type="{urn:configcompare4g.kp.chrome.com}TaxItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuredTotalMsrp" type="{urn:configcompare4g.kp.chrome.com}ModelPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuredTotalInvoice" type="{urn:configcompare4g.kp.chrome.com}ModelPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enhancedConfiguredTotalPrices" type="{urn:configcompare4g.kp.chrome.com}EnhancedModelPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activeConfiguredTotalMsrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeConfiguredTotalInvoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeConfiguredTotalPriceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="activeEnhancedConfiguredTotalPrices" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="equipment" type="{urn:configcompare4g.kp.chrome.com}ModelEquipment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configurationCheckListItems" type="{urn:configcompare4g.kp.chrome.com}ModelConfigurationCheckListItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consumerInformation" type="{urn:configcompare4g.kp.chrome.com}ModelConsumerInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="structuredConsumerInformation" type="{urn:configcompare4g.kp.chrome.com}ModelStructuredConsumerInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="technicalSpecifications" type="{urn:configcompare4g.kp.chrome.com}ModelTechnicalSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="editorialContentSources" type="{urn:configcompare4g.kp.chrome.com}ModelEditorialContentSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalImages" type="{urn:configcompare4g.kp.chrome.com}ModelAdditionalImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="packages" type="{urn:configcompare4g.kp.chrome.com}ModelPackage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modelConfigurationState" type="{urn:configcompare4g.kp.chrome.com}ModelConfigurationState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelConfiguration", propOrder = {
    "styles",
    "availableStyleIds",
    "configuredOptionsMsrp",
    "configuredOptionsInvoice",
    "enhancedConfiguredOptionsPrices",
    "activeConfiguredOptionsMsrp",
    "activeConfiguredOptionsInvoice",
    "activeConfiguredOptionsPriceState",
    "activeEnhancedConfiguredOptionsPrices",
    "configuredCustomEquipmentMsrp",
    "configuredCustomEquipmentInvoice",
    "activeConfiguredCustomEquipmentMsrp",
    "activeConfiguredCustomEquipmentInvoice",
    "activeAdvertisingAndAdjustmentsMsrp",
    "activeAdvertisingAndAdjustmentsInvoice",
    "activeEnhancedAdvertisingAndAdjustments",
    "activeTaxItems",
    "configuredTotalMsrp",
    "configuredTotalInvoice",
    "enhancedConfiguredTotalPrices",
    "activeConfiguredTotalMsrp",
    "activeConfiguredTotalInvoice",
    "activeConfiguredTotalPriceState",
    "activeEnhancedConfiguredTotalPrices",
    "equipment",
    "configurationCheckListItems",
    "consumerInformation",
    "structuredConsumerInformation",
    "technicalSpecifications",
    "editorialContentSources",
    "additionalImages",
    "packages",
    "modelConfigurationState"
})
public class ModelConfiguration {

    @XmlElement(required = true)
    protected List<Style> styles;
    @XmlElement(type = Integer.class)
    protected List<Integer> availableStyleIds;
    protected List<ModelPrice> configuredOptionsMsrp;
    protected List<ModelPrice> configuredOptionsInvoice;
    protected List<EnhancedModelPrice> enhancedConfiguredOptionsPrices;
    protected double activeConfiguredOptionsMsrp;
    protected double activeConfiguredOptionsInvoice;
    @XmlElement(required = true)
    protected PriceState activeConfiguredOptionsPriceState;
    protected List<EnhancedPrice> activeEnhancedConfiguredOptionsPrices;
    protected List<ModelPrice> configuredCustomEquipmentMsrp;
    protected List<ModelPrice> configuredCustomEquipmentInvoice;
    protected double activeConfiguredCustomEquipmentMsrp;
    protected double activeConfiguredCustomEquipmentInvoice;
    protected double activeAdvertisingAndAdjustmentsMsrp;
    protected double activeAdvertisingAndAdjustmentsInvoice;
    protected List<EnhancedPrice> activeEnhancedAdvertisingAndAdjustments;
    protected List<TaxItem> activeTaxItems;
    protected List<ModelPrice> configuredTotalMsrp;
    protected List<ModelPrice> configuredTotalInvoice;
    protected List<EnhancedModelPrice> enhancedConfiguredTotalPrices;
    protected double activeConfiguredTotalMsrp;
    protected double activeConfiguredTotalInvoice;
    @XmlElement(required = true)
    protected PriceState activeConfiguredTotalPriceState;
    protected List<EnhancedPrice> activeEnhancedConfiguredTotalPrices;
    protected List<ModelEquipment> equipment;
    protected List<ModelConfigurationCheckListItem> configurationCheckListItems;
    protected List<ModelConsumerInformation> consumerInformation;
    protected List<ModelStructuredConsumerInformation> structuredConsumerInformation;
    protected List<ModelTechnicalSpecification> technicalSpecifications;
    protected List<ModelEditorialContentSource> editorialContentSources;
    protected List<ModelAdditionalImage> additionalImages;
    protected List<ModelPackage> packages;
    @XmlElement(required = true)
    protected ModelConfigurationState modelConfigurationState;

    /**
     * Gets the value of the styles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Style }
     * 
     * 
     */
    public List<Style> getStyles() {
        if (styles == null) {
            styles = new ArrayList<Style>();
        }
        return this.styles;
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
     * Gets the value of the configuredOptionsMsrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredOptionsMsrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguredOptionsMsrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelPrice }
     * 
     * 
     */
    public List<ModelPrice> getConfiguredOptionsMsrp() {
        if (configuredOptionsMsrp == null) {
            configuredOptionsMsrp = new ArrayList<ModelPrice>();
        }
        return this.configuredOptionsMsrp;
    }

    /**
     * Gets the value of the configuredOptionsInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredOptionsInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguredOptionsInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelPrice }
     * 
     * 
     */
    public List<ModelPrice> getConfiguredOptionsInvoice() {
        if (configuredOptionsInvoice == null) {
            configuredOptionsInvoice = new ArrayList<ModelPrice>();
        }
        return this.configuredOptionsInvoice;
    }

    /**
     * Gets the value of the enhancedConfiguredOptionsPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedConfiguredOptionsPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedConfiguredOptionsPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedModelPrice }
     * 
     * 
     */
    public List<EnhancedModelPrice> getEnhancedConfiguredOptionsPrices() {
        if (enhancedConfiguredOptionsPrices == null) {
            enhancedConfiguredOptionsPrices = new ArrayList<EnhancedModelPrice>();
        }
        return this.enhancedConfiguredOptionsPrices;
    }

    /**
     * Gets the value of the activeConfiguredOptionsMsrp property.
     * 
     */
    public double getActiveConfiguredOptionsMsrp() {
        return activeConfiguredOptionsMsrp;
    }

    /**
     * Sets the value of the activeConfiguredOptionsMsrp property.
     * 
     */
    public void setActiveConfiguredOptionsMsrp(double value) {
        this.activeConfiguredOptionsMsrp = value;
    }

    /**
     * Gets the value of the activeConfiguredOptionsInvoice property.
     * 
     */
    public double getActiveConfiguredOptionsInvoice() {
        return activeConfiguredOptionsInvoice;
    }

    /**
     * Sets the value of the activeConfiguredOptionsInvoice property.
     * 
     */
    public void setActiveConfiguredOptionsInvoice(double value) {
        this.activeConfiguredOptionsInvoice = value;
    }

    /**
     * Gets the value of the activeConfiguredOptionsPriceState property.
     * 
     * @return
     *     possible object is
     *     {@link PriceState }
     *     
     */
    public PriceState getActiveConfiguredOptionsPriceState() {
        return activeConfiguredOptionsPriceState;
    }

    /**
     * Sets the value of the activeConfiguredOptionsPriceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceState }
     *     
     */
    public void setActiveConfiguredOptionsPriceState(PriceState value) {
        this.activeConfiguredOptionsPriceState = value;
    }

    /**
     * Gets the value of the activeEnhancedConfiguredOptionsPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeEnhancedConfiguredOptionsPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveEnhancedConfiguredOptionsPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedPrice }
     * 
     * 
     */
    public List<EnhancedPrice> getActiveEnhancedConfiguredOptionsPrices() {
        if (activeEnhancedConfiguredOptionsPrices == null) {
            activeEnhancedConfiguredOptionsPrices = new ArrayList<EnhancedPrice>();
        }
        return this.activeEnhancedConfiguredOptionsPrices;
    }

    /**
     * Gets the value of the configuredCustomEquipmentMsrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredCustomEquipmentMsrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguredCustomEquipmentMsrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelPrice }
     * 
     * 
     */
    public List<ModelPrice> getConfiguredCustomEquipmentMsrp() {
        if (configuredCustomEquipmentMsrp == null) {
            configuredCustomEquipmentMsrp = new ArrayList<ModelPrice>();
        }
        return this.configuredCustomEquipmentMsrp;
    }

    /**
     * Gets the value of the configuredCustomEquipmentInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredCustomEquipmentInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguredCustomEquipmentInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelPrice }
     * 
     * 
     */
    public List<ModelPrice> getConfiguredCustomEquipmentInvoice() {
        if (configuredCustomEquipmentInvoice == null) {
            configuredCustomEquipmentInvoice = new ArrayList<ModelPrice>();
        }
        return this.configuredCustomEquipmentInvoice;
    }

    /**
     * Gets the value of the activeConfiguredCustomEquipmentMsrp property.
     * 
     */
    public double getActiveConfiguredCustomEquipmentMsrp() {
        return activeConfiguredCustomEquipmentMsrp;
    }

    /**
     * Sets the value of the activeConfiguredCustomEquipmentMsrp property.
     * 
     */
    public void setActiveConfiguredCustomEquipmentMsrp(double value) {
        this.activeConfiguredCustomEquipmentMsrp = value;
    }

    /**
     * Gets the value of the activeConfiguredCustomEquipmentInvoice property.
     * 
     */
    public double getActiveConfiguredCustomEquipmentInvoice() {
        return activeConfiguredCustomEquipmentInvoice;
    }

    /**
     * Sets the value of the activeConfiguredCustomEquipmentInvoice property.
     * 
     */
    public void setActiveConfiguredCustomEquipmentInvoice(double value) {
        this.activeConfiguredCustomEquipmentInvoice = value;
    }

    /**
     * Gets the value of the activeAdvertisingAndAdjustmentsMsrp property.
     * 
     */
    public double getActiveAdvertisingAndAdjustmentsMsrp() {
        return activeAdvertisingAndAdjustmentsMsrp;
    }

    /**
     * Sets the value of the activeAdvertisingAndAdjustmentsMsrp property.
     * 
     */
    public void setActiveAdvertisingAndAdjustmentsMsrp(double value) {
        this.activeAdvertisingAndAdjustmentsMsrp = value;
    }

    /**
     * Gets the value of the activeAdvertisingAndAdjustmentsInvoice property.
     * 
     */
    public double getActiveAdvertisingAndAdjustmentsInvoice() {
        return activeAdvertisingAndAdjustmentsInvoice;
    }

    /**
     * Sets the value of the activeAdvertisingAndAdjustmentsInvoice property.
     * 
     */
    public void setActiveAdvertisingAndAdjustmentsInvoice(double value) {
        this.activeAdvertisingAndAdjustmentsInvoice = value;
    }

    /**
     * Gets the value of the activeEnhancedAdvertisingAndAdjustments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeEnhancedAdvertisingAndAdjustments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveEnhancedAdvertisingAndAdjustments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedPrice }
     * 
     * 
     */
    public List<EnhancedPrice> getActiveEnhancedAdvertisingAndAdjustments() {
        if (activeEnhancedAdvertisingAndAdjustments == null) {
            activeEnhancedAdvertisingAndAdjustments = new ArrayList<EnhancedPrice>();
        }
        return this.activeEnhancedAdvertisingAndAdjustments;
    }

    /**
     * Gets the value of the activeTaxItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeTaxItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveTaxItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxItem }
     * 
     * 
     */
    public List<TaxItem> getActiveTaxItems() {
        if (activeTaxItems == null) {
            activeTaxItems = new ArrayList<TaxItem>();
        }
        return this.activeTaxItems;
    }

    /**
     * Gets the value of the configuredTotalMsrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredTotalMsrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguredTotalMsrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelPrice }
     * 
     * 
     */
    public List<ModelPrice> getConfiguredTotalMsrp() {
        if (configuredTotalMsrp == null) {
            configuredTotalMsrp = new ArrayList<ModelPrice>();
        }
        return this.configuredTotalMsrp;
    }

    /**
     * Gets the value of the configuredTotalInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredTotalInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguredTotalInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelPrice }
     * 
     * 
     */
    public List<ModelPrice> getConfiguredTotalInvoice() {
        if (configuredTotalInvoice == null) {
            configuredTotalInvoice = new ArrayList<ModelPrice>();
        }
        return this.configuredTotalInvoice;
    }

    /**
     * Gets the value of the enhancedConfiguredTotalPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedConfiguredTotalPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedConfiguredTotalPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedModelPrice }
     * 
     * 
     */
    public List<EnhancedModelPrice> getEnhancedConfiguredTotalPrices() {
        if (enhancedConfiguredTotalPrices == null) {
            enhancedConfiguredTotalPrices = new ArrayList<EnhancedModelPrice>();
        }
        return this.enhancedConfiguredTotalPrices;
    }

    /**
     * Gets the value of the activeConfiguredTotalMsrp property.
     * 
     */
    public double getActiveConfiguredTotalMsrp() {
        return activeConfiguredTotalMsrp;
    }

    /**
     * Sets the value of the activeConfiguredTotalMsrp property.
     * 
     */
    public void setActiveConfiguredTotalMsrp(double value) {
        this.activeConfiguredTotalMsrp = value;
    }

    /**
     * Gets the value of the activeConfiguredTotalInvoice property.
     * 
     */
    public double getActiveConfiguredTotalInvoice() {
        return activeConfiguredTotalInvoice;
    }

    /**
     * Sets the value of the activeConfiguredTotalInvoice property.
     * 
     */
    public void setActiveConfiguredTotalInvoice(double value) {
        this.activeConfiguredTotalInvoice = value;
    }

    /**
     * Gets the value of the activeConfiguredTotalPriceState property.
     * 
     * @return
     *     possible object is
     *     {@link PriceState }
     *     
     */
    public PriceState getActiveConfiguredTotalPriceState() {
        return activeConfiguredTotalPriceState;
    }

    /**
     * Sets the value of the activeConfiguredTotalPriceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceState }
     *     
     */
    public void setActiveConfiguredTotalPriceState(PriceState value) {
        this.activeConfiguredTotalPriceState = value;
    }

    /**
     * Gets the value of the activeEnhancedConfiguredTotalPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeEnhancedConfiguredTotalPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveEnhancedConfiguredTotalPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedPrice }
     * 
     * 
     */
    public List<EnhancedPrice> getActiveEnhancedConfiguredTotalPrices() {
        if (activeEnhancedConfiguredTotalPrices == null) {
            activeEnhancedConfiguredTotalPrices = new ArrayList<EnhancedPrice>();
        }
        return this.activeEnhancedConfiguredTotalPrices;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelEquipment }
     * 
     * 
     */
    public List<ModelEquipment> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<ModelEquipment>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the configurationCheckListItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationCheckListItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationCheckListItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelConfigurationCheckListItem }
     * 
     * 
     */
    public List<ModelConfigurationCheckListItem> getConfigurationCheckListItems() {
        if (configurationCheckListItems == null) {
            configurationCheckListItems = new ArrayList<ModelConfigurationCheckListItem>();
        }
        return this.configurationCheckListItems;
    }

    /**
     * Gets the value of the consumerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelConsumerInformation }
     * 
     * 
     */
    public List<ModelConsumerInformation> getConsumerInformation() {
        if (consumerInformation == null) {
            consumerInformation = new ArrayList<ModelConsumerInformation>();
        }
        return this.consumerInformation;
    }

    /**
     * Gets the value of the structuredConsumerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuredConsumerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuredConsumerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelStructuredConsumerInformation }
     * 
     * 
     */
    public List<ModelStructuredConsumerInformation> getStructuredConsumerInformation() {
        if (structuredConsumerInformation == null) {
            structuredConsumerInformation = new ArrayList<ModelStructuredConsumerInformation>();
        }
        return this.structuredConsumerInformation;
    }

    /**
     * Gets the value of the technicalSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelTechnicalSpecification }
     * 
     * 
     */
    public List<ModelTechnicalSpecification> getTechnicalSpecifications() {
        if (technicalSpecifications == null) {
            technicalSpecifications = new ArrayList<ModelTechnicalSpecification>();
        }
        return this.technicalSpecifications;
    }

    /**
     * Gets the value of the editorialContentSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editorialContentSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditorialContentSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelEditorialContentSource }
     * 
     * 
     */
    public List<ModelEditorialContentSource> getEditorialContentSources() {
        if (editorialContentSources == null) {
            editorialContentSources = new ArrayList<ModelEditorialContentSource>();
        }
        return this.editorialContentSources;
    }

    /**
     * Gets the value of the additionalImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelAdditionalImage }
     * 
     * 
     */
    public List<ModelAdditionalImage> getAdditionalImages() {
        if (additionalImages == null) {
            additionalImages = new ArrayList<ModelAdditionalImage>();
        }
        return this.additionalImages;
    }

    /**
     * Gets the value of the packages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelPackage }
     * 
     * 
     */
    public List<ModelPackage> getPackages() {
        if (packages == null) {
            packages = new ArrayList<ModelPackage>();
        }
        return this.packages;
    }

    /**
     * Gets the value of the modelConfigurationState property.
     * 
     * @return
     *     possible object is
     *     {@link ModelConfigurationState }
     *     
     */
    public ModelConfigurationState getModelConfigurationState() {
        return modelConfigurationState;
    }

    /**
     * Sets the value of the modelConfigurationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelConfigurationState }
     *     
     */
    public void setModelConfigurationState(ModelConfigurationState value) {
        this.modelConfigurationState = value;
    }

}
