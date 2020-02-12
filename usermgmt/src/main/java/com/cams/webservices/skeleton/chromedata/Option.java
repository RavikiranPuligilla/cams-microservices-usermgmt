
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Option complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Option">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromeOptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oemOptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="headerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyHeaderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumerFriendlyHeaderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionKindId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descriptions" type="{urn:configcompare4g.kp.chrome.com}OptionDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="msrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="frontWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rearWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="priceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="priceVariations" type="{urn:configcompare4g.kp.chrome.com}PriceVariation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="affectingOptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categories" type="{urn:configcompare4g.kp.chrome.com}Category" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extendedEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="optionPackage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="optionPackageContentOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="optionFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionFamilyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectionState" type="{urn:configcompare4g.kp.chrome.com}OptionSelectionState"/>
 *         &lt;element name="uniqueTypeFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enhancedPrices" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Option", propOrder = {
    "chromeOptionCode",
    "oemOptionCode",
    "headerId",
    "headerName",
    "consumerFriendlyHeaderId",
    "consumerFriendlyHeaderName",
    "optionKindId",
    "descriptions",
    "msrp",
    "invoice",
    "frontWeight",
    "rearWeight",
    "priceState",
    "priceVariations",
    "affectingOptionCode",
    "categories",
    "specialEquipment",
    "extendedEquipment",
    "customEquipment",
    "optionPackage",
    "optionPackageContentOnly",
    "optionFamilyCode",
    "optionFamilyName",
    "selectionState",
    "uniqueTypeFilter",
    "enhancedPrices",
    "rgbValue",
    "genericColors"
})
public class Option {

    @XmlElement(required = true, nillable = true)
    protected String chromeOptionCode;
    @XmlElement(required = true, nillable = true)
    protected String oemOptionCode;
    protected int headerId;
    @XmlElement(required = true, nillable = true)
    protected String headerName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer consumerFriendlyHeaderId;
    @XmlElement(required = true, nillable = true)
    protected String consumerFriendlyHeaderName;
    protected int optionKindId;
    protected List<OptionDescription> descriptions;
    protected double msrp;
    protected double invoice;
    protected double frontWeight;
    protected double rearWeight;
    @XmlElement(required = true, nillable = true)
    protected PriceState priceState;
    protected List<PriceVariation> priceVariations;
    @XmlElement(required = true, nillable = true)
    protected String affectingOptionCode;
    protected List<Category> categories;
    protected boolean specialEquipment;
    protected boolean extendedEquipment;
    protected boolean customEquipment;
    protected boolean optionPackage;
    protected boolean optionPackageContentOnly;
    @XmlElement(required = true, nillable = true)
    protected String optionFamilyCode;
    @XmlElement(required = true, nillable = true)
    protected String optionFamilyName;
    @XmlElement(required = true)
    protected OptionSelectionState selectionState;
    @XmlElement(required = true, nillable = true)
    protected String uniqueTypeFilter;
    protected List<EnhancedPrice> enhancedPrices;
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
     * Gets the value of the oemOptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOemOptionCode() {
        return oemOptionCode;
    }

    /**
     * Sets the value of the oemOptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOemOptionCode(String value) {
        this.oemOptionCode = value;
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
     * {@link OptionDescription }
     * 
     * 
     */
    public List<OptionDescription> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<OptionDescription>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the msrp property.
     * 
     */
    public double getMsrp() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     */
    public void setMsrp(double value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     */
    public double getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     */
    public void setInvoice(double value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the frontWeight property.
     * 
     */
    public double getFrontWeight() {
        return frontWeight;
    }

    /**
     * Sets the value of the frontWeight property.
     * 
     */
    public void setFrontWeight(double value) {
        this.frontWeight = value;
    }

    /**
     * Gets the value of the rearWeight property.
     * 
     */
    public double getRearWeight() {
        return rearWeight;
    }

    /**
     * Sets the value of the rearWeight property.
     * 
     */
    public void setRearWeight(double value) {
        this.rearWeight = value;
    }

    /**
     * Gets the value of the priceState property.
     * 
     * @return
     *     possible object is
     *     {@link PriceState }
     *     
     */
    public PriceState getPriceState() {
        return priceState;
    }

    /**
     * Sets the value of the priceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceState }
     *     
     */
    public void setPriceState(PriceState value) {
        this.priceState = value;
    }

    /**
     * Gets the value of the priceVariations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceVariations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceVariations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceVariation }
     * 
     * 
     */
    public List<PriceVariation> getPriceVariations() {
        if (priceVariations == null) {
            priceVariations = new ArrayList<PriceVariation>();
        }
        return this.priceVariations;
    }

    /**
     * Gets the value of the affectingOptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectingOptionCode() {
        return affectingOptionCode;
    }

    /**
     * Sets the value of the affectingOptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectingOptionCode(String value) {
        this.affectingOptionCode = value;
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
     * Gets the value of the optionPackage property.
     * 
     */
    public boolean isOptionPackage() {
        return optionPackage;
    }

    /**
     * Sets the value of the optionPackage property.
     * 
     */
    public void setOptionPackage(boolean value) {
        this.optionPackage = value;
    }

    /**
     * Gets the value of the optionPackageContentOnly property.
     * 
     */
    public boolean isOptionPackageContentOnly() {
        return optionPackageContentOnly;
    }

    /**
     * Sets the value of the optionPackageContentOnly property.
     * 
     */
    public void setOptionPackageContentOnly(boolean value) {
        this.optionPackageContentOnly = value;
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
     *     {@link OptionSelectionState }
     *     
     */
    public OptionSelectionState getSelectionState() {
        return selectionState;
    }

    /**
     * Sets the value of the selectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionSelectionState }
     *     
     */
    public void setSelectionState(OptionSelectionState value) {
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
     * Gets the value of the enhancedPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedPrice }
     * 
     * 
     */
    public List<EnhancedPrice> getEnhancedPrices() {
        if (enhancedPrices == null) {
            enhancedPrices = new ArrayList<EnhancedPrice>();
        }
        return this.enhancedPrices;
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
