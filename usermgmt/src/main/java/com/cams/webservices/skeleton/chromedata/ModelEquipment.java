
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelEquipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromeOptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="headerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyHeaderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumerFriendlyHeaderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionKindId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descriptions" type="{urn:configcompare4g.kp.chrome.com}EquipmentDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="msrp" type="{urn:configcompare4g.kp.chrome.com}ModelPriceRange"/>
 *         &lt;element name="invoice" type="{urn:configcompare4g.kp.chrome.com}ModelPriceRange"/>
 *         &lt;element name="enhancedPriceRanges" type="{urn:configcompare4g.kp.chrome.com}EnhancedModelPriceRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activeMsrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeInvoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activePriceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="activeEnhancedPrices" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="categories" type="{urn:configcompare4g.kp.chrome.com}Category" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extendedEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="equipmentPackage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="equipmentPackageContentOnlyStyleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="optionFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionFamilyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectionState" type="{urn:configcompare4g.kp.chrome.com}ModelEquipmentSelectionState"/>
 *         &lt;element name="uniqueTypeFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseEquipmentStyleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="availableStyleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rgbValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genericColors" type="{urn:configcompare4g.kp.chrome.com}GenericColor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelEquipment", propOrder = {
    "chromeOptionCode",
    "optionCode",
    "headerId",
    "headerName",
    "consumerFriendlyHeaderId",
    "consumerFriendlyHeaderName",
    "optionKindId",
    "descriptions",
    "msrp",
    "invoice",
    "enhancedPriceRanges",
    "activeMsrp",
    "activeInvoice",
    "activePriceState",
    "activeEnhancedPrices",
    "categories",
    "specialEquipment",
    "extendedEquipment",
    "customEquipment",
    "equipmentPackage",
    "equipmentPackageContentOnlyStyleIds",
    "optionFamilyCode",
    "optionFamilyName",
    "selectionState",
    "uniqueTypeFilter",
    "baseEquipmentStyleIds",
    "availableStyleIds",
    "rgbValue",
    "genericColors"
})
public class ModelEquipment {

    @XmlElement(required = true, nillable = true)
    protected String chromeOptionCode;
    @XmlElement(required = true, nillable = true)
    protected String optionCode;
    protected int headerId;
    @XmlElement(required = true, nillable = true)
    protected String headerName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer consumerFriendlyHeaderId;
    @XmlElement(required = true, nillable = true)
    protected String consumerFriendlyHeaderName;
    protected int optionKindId;
    protected List<EquipmentDescription> descriptions;
    @XmlElement(required = true)
    protected ModelPriceRange msrp;
    @XmlElement(required = true)
    protected ModelPriceRange invoice;
    protected List<EnhancedModelPriceRange> enhancedPriceRanges;
    protected double activeMsrp;
    protected double activeInvoice;
    @XmlElement(required = true)
    protected PriceState activePriceState;
    protected List<EnhancedPrice> activeEnhancedPrices;
    protected List<Category> categories;
    protected boolean specialEquipment;
    protected boolean extendedEquipment;
    protected boolean customEquipment;
    protected boolean equipmentPackage;
    @XmlElement(type = Integer.class)
    protected List<Integer> equipmentPackageContentOnlyStyleIds;
    @XmlElement(required = true, nillable = true)
    protected String optionFamilyCode;
    @XmlElement(required = true, nillable = true)
    protected String optionFamilyName;
    @XmlElement(required = true)
    protected ModelEquipmentSelectionState selectionState;
    @XmlElement(required = true, nillable = true)
    protected String uniqueTypeFilter;
    @XmlElement(type = Integer.class)
    protected List<Integer> baseEquipmentStyleIds;
    @XmlElement(type = Integer.class)
    protected List<Integer> availableStyleIds;
    protected String rgbValue;
    protected List<GenericColor> genericColors;

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
     * Gets the value of the optionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * Sets the value of the optionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCode(String value) {
        this.optionCode = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     */
    public int getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     */
    public void setHeaderId(int value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the headerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderName() {
        return headerName;
    }

    /**
     * Sets the value of the headerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderName(String value) {
        this.headerName = value;
    }

    /**
     * Gets the value of the consumerFriendlyHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumerFriendlyHeaderId() {
        return consumerFriendlyHeaderId;
    }

    /**
     * Sets the value of the consumerFriendlyHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumerFriendlyHeaderId(Integer value) {
        this.consumerFriendlyHeaderId = value;
    }

    /**
     * Gets the value of the consumerFriendlyHeaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFriendlyHeaderName() {
        return consumerFriendlyHeaderName;
    }

    /**
     * Sets the value of the consumerFriendlyHeaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFriendlyHeaderName(String value) {
        this.consumerFriendlyHeaderName = value;
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
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentDescription }
     * 
     * 
     */
    public List<EquipmentDescription> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<EquipmentDescription>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the msrp property.
     * 
     * @return
     *     possible object is
     *     {@link ModelPriceRange }
     *     
     */
    public ModelPriceRange getMsrp() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelPriceRange }
     *     
     */
    public void setMsrp(ModelPriceRange value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link ModelPriceRange }
     *     
     */
    public ModelPriceRange getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelPriceRange }
     *     
     */
    public void setInvoice(ModelPriceRange value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the enhancedPriceRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedPriceRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedPriceRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedModelPriceRange }
     * 
     * 
     */
    public List<EnhancedModelPriceRange> getEnhancedPriceRanges() {
        if (enhancedPriceRanges == null) {
            enhancedPriceRanges = new ArrayList<EnhancedModelPriceRange>();
        }
        return this.enhancedPriceRanges;
    }

    /**
     * Gets the value of the activeMsrp property.
     * 
     */
    public double getActiveMsrp() {
        return activeMsrp;
    }

    /**
     * Sets the value of the activeMsrp property.
     * 
     */
    public void setActiveMsrp(double value) {
        this.activeMsrp = value;
    }

    /**
     * Gets the value of the activeInvoice property.
     * 
     */
    public double getActiveInvoice() {
        return activeInvoice;
    }

    /**
     * Sets the value of the activeInvoice property.
     * 
     */
    public void setActiveInvoice(double value) {
        this.activeInvoice = value;
    }

    /**
     * Gets the value of the activePriceState property.
     * 
     * @return
     *     possible object is
     *     {@link PriceState }
     *     
     */
    public PriceState getActivePriceState() {
        return activePriceState;
    }

    /**
     * Sets the value of the activePriceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceState }
     *     
     */
    public void setActivePriceState(PriceState value) {
        this.activePriceState = value;
    }

    /**
     * Gets the value of the activeEnhancedPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeEnhancedPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveEnhancedPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedPrice }
     * 
     * 
     */
    public List<EnhancedPrice> getActiveEnhancedPrices() {
        if (activeEnhancedPrices == null) {
            activeEnhancedPrices = new ArrayList<EnhancedPrice>();
        }
        return this.activeEnhancedPrices;
    }

    /**
     * Gets the value of the categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * 
     * 
     */
    public List<Category> getCategories() {
        if (categories == null) {
            categories = new ArrayList<Category>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the specialEquipment property.
     * 
     */
    public boolean isSpecialEquipment() {
        return specialEquipment;
    }

    /**
     * Sets the value of the specialEquipment property.
     * 
     */
    public void setSpecialEquipment(boolean value) {
        this.specialEquipment = value;
    }

    /**
     * Gets the value of the extendedEquipment property.
     * 
     */
    public boolean isExtendedEquipment() {
        return extendedEquipment;
    }

    /**
     * Sets the value of the extendedEquipment property.
     * 
     */
    public void setExtendedEquipment(boolean value) {
        this.extendedEquipment = value;
    }

    /**
     * Gets the value of the customEquipment property.
     * 
     */
    public boolean isCustomEquipment() {
        return customEquipment;
    }

    /**
     * Sets the value of the customEquipment property.
     * 
     */
    public void setCustomEquipment(boolean value) {
        this.customEquipment = value;
    }

    /**
     * Gets the value of the equipmentPackage property.
     * 
     */
    public boolean isEquipmentPackage() {
        return equipmentPackage;
    }

    /**
     * Sets the value of the equipmentPackage property.
     * 
     */
    public void setEquipmentPackage(boolean value) {
        this.equipmentPackage = value;
    }

    /**
     * Gets the value of the equipmentPackageContentOnlyStyleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentPackageContentOnlyStyleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentPackageContentOnlyStyleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEquipmentPackageContentOnlyStyleIds() {
        if (equipmentPackageContentOnlyStyleIds == null) {
            equipmentPackageContentOnlyStyleIds = new ArrayList<Integer>();
        }
        return this.equipmentPackageContentOnlyStyleIds;
    }

    /**
     * Gets the value of the optionFamilyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionFamilyCode() {
        return optionFamilyCode;
    }

    /**
     * Sets the value of the optionFamilyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionFamilyCode(String value) {
        this.optionFamilyCode = value;
    }

    /**
     * Gets the value of the optionFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionFamilyName() {
        return optionFamilyName;
    }

    /**
     * Sets the value of the optionFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionFamilyName(String value) {
        this.optionFamilyName = value;
    }

    /**
     * Gets the value of the selectionState property.
     * 
     * @return
     *     possible object is
     *     {@link ModelEquipmentSelectionState }
     *     
     */
    public ModelEquipmentSelectionState getSelectionState() {
        return selectionState;
    }

    /**
     * Sets the value of the selectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelEquipmentSelectionState }
     *     
     */
    public void setSelectionState(ModelEquipmentSelectionState value) {
        this.selectionState = value;
    }

    /**
     * Gets the value of the uniqueTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueTypeFilter() {
        return uniqueTypeFilter;
    }

    /**
     * Sets the value of the uniqueTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueTypeFilter(String value) {
        this.uniqueTypeFilter = value;
    }

    /**
     * Gets the value of the baseEquipmentStyleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseEquipmentStyleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseEquipmentStyleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBaseEquipmentStyleIds() {
        if (baseEquipmentStyleIds == null) {
            baseEquipmentStyleIds = new ArrayList<Integer>();
        }
        return this.baseEquipmentStyleIds;
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
     * Gets the value of the rgbValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgbValue() {
        return rgbValue;
    }

    /**
     * Sets the value of the rgbValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgbValue(String value) {
        this.rgbValue = value;
    }

    /**
     * Gets the value of the genericColors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericColors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericColor }
     * 
     * 
     */
    public List<GenericColor> getGenericColors() {
        if (genericColors == null) {
            genericColors = new ArrayList<GenericColor>();
        }
        return this.genericColors;
    }

}
