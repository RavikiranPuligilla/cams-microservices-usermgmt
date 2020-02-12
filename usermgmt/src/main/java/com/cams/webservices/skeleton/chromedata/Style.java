
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Style complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Style">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="model" type="{urn:configcompare4g.kp.chrome.com}Model"/>
 *         &lt;element name="styleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="styleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="styleNameWithoutTrim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trimName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturerModelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="styleGroupStyleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="styleGroupBase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="baseMsrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="baseInvoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="startingAtInvoice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="startingAtMsrp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="trueBasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="priceState" type="{urn:configcompare4g.kp.chrome.com}PriceState"/>
 *         &lt;element name="enhancedBasePrices" type="{urn:configcompare4g.kp.chrome.com}EnhancedPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bodyTypes" type="{urn:configcompare4g.kp.chrome.com}BodyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="passengerDoors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketClassId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketClassName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allocationGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stockPhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyModelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyStyleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyDrivetrain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyBodyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketingCopy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buzzStyle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="buzzSourceStyleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="buzzSourceModelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="configurationState" type="{urn:configcompare4g.kp.chrome.com}ConfigurationState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Style", propOrder = {
    "model",
    "styleId",
    "styleName",
    "styleNameWithoutTrim",
    "trimName",
    "manufacturerModelCode",
    "styleGroupStyleIds",
    "styleGroupBase",
    "baseMsrp",
    "baseInvoice",
    "startingAtInvoice",
    "startingAtMsrp",
    "destination",
    "trueBasePrice",
    "priceState",
    "enhancedBasePrices",
    "bodyTypes",
    "passengerDoors",
    "marketClassId",
    "marketClassName",
    "allocationGroup",
    "stockPhotoUrl",
    "consumerFriendlyModelName",
    "consumerFriendlyStyleName",
    "consumerFriendlyDrivetrain",
    "consumerFriendlyBodyType",
    "marketingCopy",
    "buzzStyle",
    "buzzSourceStyleId",
    "buzzSourceModelId",
    "configurationState"
})
public class Style {

    @XmlElement(required = true)
    protected Model model;
    protected int styleId;
    @XmlElement(required = true)
    protected String styleName;
    @XmlElement(required = true, nillable = true)
    protected String styleNameWithoutTrim;
    @XmlElement(required = true, nillable = true)
    protected String trimName;
    @XmlElement(required = true)
    protected String manufacturerModelCode;
    @XmlElement(type = Integer.class)
    protected List<Integer> styleGroupStyleIds;
    protected boolean styleGroupBase;
    protected double baseMsrp;
    protected double baseInvoice;
    protected Double startingAtInvoice;
    protected Double startingAtMsrp;
    protected double destination;
    protected boolean trueBasePrice;
    @XmlElement(required = true)
    protected PriceState priceState;
    protected List<EnhancedPrice> enhancedBasePrices;
    protected List<BodyType> bodyTypes;
    protected int passengerDoors;
    protected int marketClassId;
    @XmlElement(required = true)
    protected String marketClassName;
    protected List<String> allocationGroup;
    @XmlElement(required = true)
    protected String stockPhotoUrl;
    @XmlElement(required = true)
    protected String consumerFriendlyModelName;
    @XmlElement(required = true)
    protected String consumerFriendlyStyleName;
    @XmlElement(required = true)
    protected String consumerFriendlyDrivetrain;
    @XmlElement(required = true)
    protected String consumerFriendlyBodyType;
    protected String marketingCopy;
    protected Boolean buzzStyle;
    protected Integer buzzSourceStyleId;
    protected Integer buzzSourceModelId;
    @XmlElement(required = true)
    protected ConfigurationState configurationState;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link Model }
     *     
     */
    public Model getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model }
     *     
     */
    public void setModel(Model value) {
        this.model = value;
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
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

    /**
     * Gets the value of the styleNameWithoutTrim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleNameWithoutTrim() {
        return styleNameWithoutTrim;
    }

    /**
     * Sets the value of the styleNameWithoutTrim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleNameWithoutTrim(String value) {
        this.styleNameWithoutTrim = value;
    }

    /**
     * Gets the value of the trimName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimName() {
        return trimName;
    }

    /**
     * Sets the value of the trimName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimName(String value) {
        this.trimName = value;
    }

    /**
     * Gets the value of the manufacturerModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerModelCode() {
        return manufacturerModelCode;
    }

    /**
     * Sets the value of the manufacturerModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerModelCode(String value) {
        this.manufacturerModelCode = value;
    }

    /**
     * Gets the value of the styleGroupStyleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleGroupStyleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleGroupStyleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getStyleGroupStyleIds() {
        if (styleGroupStyleIds == null) {
            styleGroupStyleIds = new ArrayList<Integer>();
        }
        return this.styleGroupStyleIds;
    }

    /**
     * Gets the value of the styleGroupBase property.
     * 
     */
    public boolean isStyleGroupBase() {
        return styleGroupBase;
    }

    /**
     * Sets the value of the styleGroupBase property.
     * 
     */
    public void setStyleGroupBase(boolean value) {
        this.styleGroupBase = value;
    }

    /**
     * Gets the value of the baseMsrp property.
     * 
     */
    public double getBaseMsrp() {
        return baseMsrp;
    }

    /**
     * Sets the value of the baseMsrp property.
     * 
     */
    public void setBaseMsrp(double value) {
        this.baseMsrp = value;
    }

    /**
     * Gets the value of the baseInvoice property.
     * 
     */
    public double getBaseInvoice() {
        return baseInvoice;
    }

    /**
     * Sets the value of the baseInvoice property.
     * 
     */
    public void setBaseInvoice(double value) {
        this.baseInvoice = value;
    }

    /**
     * Gets the value of the startingAtInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartingAtInvoice() {
        return startingAtInvoice;
    }

    /**
     * Sets the value of the startingAtInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartingAtInvoice(Double value) {
        this.startingAtInvoice = value;
    }

    /**
     * Gets the value of the startingAtMsrp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartingAtMsrp() {
        return startingAtMsrp;
    }

    /**
     * Sets the value of the startingAtMsrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartingAtMsrp(Double value) {
        this.startingAtMsrp = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     */
    public double getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     */
    public void setDestination(double value) {
        this.destination = value;
    }

    /**
     * Gets the value of the trueBasePrice property.
     * 
     */
    public boolean isTrueBasePrice() {
        return trueBasePrice;
    }

    /**
     * Sets the value of the trueBasePrice property.
     * 
     */
    public void setTrueBasePrice(boolean value) {
        this.trueBasePrice = value;
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
     * Gets the value of the enhancedBasePrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedBasePrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedBasePrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedPrice }
     * 
     * 
     */
    public List<EnhancedPrice> getEnhancedBasePrices() {
        if (enhancedBasePrices == null) {
            enhancedBasePrices = new ArrayList<EnhancedPrice>();
        }
        return this.enhancedBasePrices;
    }

    /**
     * Gets the value of the bodyTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodyTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodyTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodyType }
     * 
     * 
     */
    public List<BodyType> getBodyTypes() {
        if (bodyTypes == null) {
            bodyTypes = new ArrayList<BodyType>();
        }
        return this.bodyTypes;
    }

    /**
     * Gets the value of the passengerDoors property.
     * 
     */
    public int getPassengerDoors() {
        return passengerDoors;
    }

    /**
     * Sets the value of the passengerDoors property.
     * 
     */
    public void setPassengerDoors(int value) {
        this.passengerDoors = value;
    }

    /**
     * Gets the value of the marketClassId property.
     * 
     */
    public int getMarketClassId() {
        return marketClassId;
    }

    /**
     * Sets the value of the marketClassId property.
     * 
     */
    public void setMarketClassId(int value) {
        this.marketClassId = value;
    }

    /**
     * Gets the value of the marketClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketClassName() {
        return marketClassName;
    }

    /**
     * Sets the value of the marketClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketClassName(String value) {
        this.marketClassName = value;
    }

    /**
     * Gets the value of the allocationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllocationGroup() {
        if (allocationGroup == null) {
            allocationGroup = new ArrayList<String>();
        }
        return this.allocationGroup;
    }

    /**
     * Gets the value of the stockPhotoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhotoUrl() {
        return stockPhotoUrl;
    }

    /**
     * Sets the value of the stockPhotoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhotoUrl(String value) {
        this.stockPhotoUrl = value;
    }

    /**
     * Gets the value of the consumerFriendlyModelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFriendlyModelName() {
        return consumerFriendlyModelName;
    }

    /**
     * Sets the value of the consumerFriendlyModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFriendlyModelName(String value) {
        this.consumerFriendlyModelName = value;
    }

    /**
     * Gets the value of the consumerFriendlyStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFriendlyStyleName() {
        return consumerFriendlyStyleName;
    }

    /**
     * Sets the value of the consumerFriendlyStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFriendlyStyleName(String value) {
        this.consumerFriendlyStyleName = value;
    }

    /**
     * Gets the value of the consumerFriendlyDrivetrain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFriendlyDrivetrain() {
        return consumerFriendlyDrivetrain;
    }

    /**
     * Sets the value of the consumerFriendlyDrivetrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFriendlyDrivetrain(String value) {
        this.consumerFriendlyDrivetrain = value;
    }

    /**
     * Gets the value of the consumerFriendlyBodyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFriendlyBodyType() {
        return consumerFriendlyBodyType;
    }

    /**
     * Sets the value of the consumerFriendlyBodyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFriendlyBodyType(String value) {
        this.consumerFriendlyBodyType = value;
    }

    /**
     * Gets the value of the marketingCopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCopy() {
        return marketingCopy;
    }

    /**
     * Sets the value of the marketingCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCopy(String value) {
        this.marketingCopy = value;
    }

    /**
     * Gets the value of the buzzStyle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuzzStyle() {
        return buzzStyle;
    }

    /**
     * Sets the value of the buzzStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuzzStyle(Boolean value) {
        this.buzzStyle = value;
    }

    /**
     * Gets the value of the buzzSourceStyleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuzzSourceStyleId() {
        return buzzSourceStyleId;
    }

    /**
     * Sets the value of the buzzSourceStyleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuzzSourceStyleId(Integer value) {
        this.buzzSourceStyleId = value;
    }

    /**
     * Gets the value of the buzzSourceModelId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuzzSourceModelId() {
        return buzzSourceModelId;
    }

    /**
     * Sets the value of the buzzSourceModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuzzSourceModelId(Integer value) {
        this.buzzSourceModelId = value;
    }

    /**
     * Gets the value of the configurationState property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationState }
     *     
     */
    public ConfigurationState getConfigurationState() {
        return configurationState;
    }

    /**
     * Sets the value of the configurationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationState }
     *     
     */
    public void setConfigurationState(ConfigurationState value) {
        this.configurationState = value;
    }

}
