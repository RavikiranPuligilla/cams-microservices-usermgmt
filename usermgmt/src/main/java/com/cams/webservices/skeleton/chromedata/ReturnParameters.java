
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeStandards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeOptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeOptionDescriptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="splitOptionsForAltDescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeSpecialEquipmentOptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeExtendedOEMOptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeOEMFleetCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeEditorialContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeConsumerInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeStructuredConsumerInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeConfigurationChecklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeAdditionalImages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeTechSpecs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filteredTechSpecTitleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measurementSystem" type="{urn:configcompare4g.kp.chrome.com}MeasurementSystem"/>
 *         &lt;element name="includeEnhancedPrices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeStylePackages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeCustomEquipmentInTotalPrices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeTaxesInTotalPrices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disableOptionOrderLogic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="priceSetting" type="{urn:configcompare4g.kp.chrome.com}PriceSetting"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnParameters", propOrder = {
    "includeStandards",
    "includeOptions",
    "includeOptionDescriptions",
    "splitOptionsForAltDescription",
    "includeSpecialEquipmentOptions",
    "includeExtendedOEMOptions",
    "includeOEMFleetCodes",
    "includeEditorialContent",
    "includeConsumerInfo",
    "includeStructuredConsumerInfo",
    "includeConfigurationChecklist",
    "includeAdditionalImages",
    "includeTechSpecs",
    "filteredTechSpecTitleIds",
    "measurementSystem",
    "includeEnhancedPrices",
    "includeStylePackages",
    "includeCustomEquipmentInTotalPrices",
    "includeTaxesInTotalPrices",
    "disableOptionOrderLogic",
    "priceSetting"
})
public class ReturnParameters {

    protected boolean includeStandards;
    protected boolean includeOptions;
    protected boolean includeOptionDescriptions;
    protected boolean splitOptionsForAltDescription;
    protected boolean includeSpecialEquipmentOptions;
    protected boolean includeExtendedOEMOptions;
    protected boolean includeOEMFleetCodes;
    protected boolean includeEditorialContent;
    protected boolean includeConsumerInfo;
    protected boolean includeStructuredConsumerInfo;
    protected boolean includeConfigurationChecklist;
    protected boolean includeAdditionalImages;
    protected boolean includeTechSpecs;
    @XmlElement(type = Integer.class)
    protected List<Integer> filteredTechSpecTitleIds;
    @XmlElement(required = true)
    protected MeasurementSystem measurementSystem;
    protected boolean includeEnhancedPrices;
    protected boolean includeStylePackages;
    protected boolean includeCustomEquipmentInTotalPrices;
    protected boolean includeTaxesInTotalPrices;
    protected boolean disableOptionOrderLogic;
    @XmlElement(required = true)
    protected PriceSetting priceSetting;

    /**
     * Gets the value of the includeStandards property.
     * 
     */
    public boolean isIncludeStandards() {
        return includeStandards;
    }

    /**
     * Sets the value of the includeStandards property.
     * 
     */
    public void setIncludeStandards(boolean value) {
        this.includeStandards = value;
    }

    /**
     * Gets the value of the includeOptions property.
     * 
     */
    public boolean isIncludeOptions() {
        return includeOptions;
    }

    /**
     * Sets the value of the includeOptions property.
     * 
     */
    public void setIncludeOptions(boolean value) {
        this.includeOptions = value;
    }

    /**
     * Gets the value of the includeOptionDescriptions property.
     * 
     */
    public boolean isIncludeOptionDescriptions() {
        return includeOptionDescriptions;
    }

    /**
     * Sets the value of the includeOptionDescriptions property.
     * 
     */
    public void setIncludeOptionDescriptions(boolean value) {
        this.includeOptionDescriptions = value;
    }

    /**
     * Gets the value of the splitOptionsForAltDescription property.
     * 
     */
    public boolean isSplitOptionsForAltDescription() {
        return splitOptionsForAltDescription;
    }

    /**
     * Sets the value of the splitOptionsForAltDescription property.
     * 
     */
    public void setSplitOptionsForAltDescription(boolean value) {
        this.splitOptionsForAltDescription = value;
    }

    /**
     * Gets the value of the includeSpecialEquipmentOptions property.
     * 
     */
    public boolean isIncludeSpecialEquipmentOptions() {
        return includeSpecialEquipmentOptions;
    }

    /**
     * Sets the value of the includeSpecialEquipmentOptions property.
     * 
     */
    public void setIncludeSpecialEquipmentOptions(boolean value) {
        this.includeSpecialEquipmentOptions = value;
    }

    /**
     * Gets the value of the includeExtendedOEMOptions property.
     * 
     */
    public boolean isIncludeExtendedOEMOptions() {
        return includeExtendedOEMOptions;
    }

    /**
     * Sets the value of the includeExtendedOEMOptions property.
     * 
     */
    public void setIncludeExtendedOEMOptions(boolean value) {
        this.includeExtendedOEMOptions = value;
    }

    /**
     * Gets the value of the includeOEMFleetCodes property.
     * 
     */
    public boolean isIncludeOEMFleetCodes() {
        return includeOEMFleetCodes;
    }

    /**
     * Sets the value of the includeOEMFleetCodes property.
     * 
     */
    public void setIncludeOEMFleetCodes(boolean value) {
        this.includeOEMFleetCodes = value;
    }

    /**
     * Gets the value of the includeEditorialContent property.
     * 
     */
    public boolean isIncludeEditorialContent() {
        return includeEditorialContent;
    }

    /**
     * Sets the value of the includeEditorialContent property.
     * 
     */
    public void setIncludeEditorialContent(boolean value) {
        this.includeEditorialContent = value;
    }

    /**
     * Gets the value of the includeConsumerInfo property.
     * 
     */
    public boolean isIncludeConsumerInfo() {
        return includeConsumerInfo;
    }

    /**
     * Sets the value of the includeConsumerInfo property.
     * 
     */
    public void setIncludeConsumerInfo(boolean value) {
        this.includeConsumerInfo = value;
    }

    /**
     * Gets the value of the includeStructuredConsumerInfo property.
     * 
     */
    public boolean isIncludeStructuredConsumerInfo() {
        return includeStructuredConsumerInfo;
    }

    /**
     * Sets the value of the includeStructuredConsumerInfo property.
     * 
     */
    public void setIncludeStructuredConsumerInfo(boolean value) {
        this.includeStructuredConsumerInfo = value;
    }

    /**
     * Gets the value of the includeConfigurationChecklist property.
     * 
     */
    public boolean isIncludeConfigurationChecklist() {
        return includeConfigurationChecklist;
    }

    /**
     * Sets the value of the includeConfigurationChecklist property.
     * 
     */
    public void setIncludeConfigurationChecklist(boolean value) {
        this.includeConfigurationChecklist = value;
    }

    /**
     * Gets the value of the includeAdditionalImages property.
     * 
     */
    public boolean isIncludeAdditionalImages() {
        return includeAdditionalImages;
    }

    /**
     * Sets the value of the includeAdditionalImages property.
     * 
     */
    public void setIncludeAdditionalImages(boolean value) {
        this.includeAdditionalImages = value;
    }

    /**
     * Gets the value of the includeTechSpecs property.
     * 
     */
    public boolean isIncludeTechSpecs() {
        return includeTechSpecs;
    }

    /**
     * Sets the value of the includeTechSpecs property.
     * 
     */
    public void setIncludeTechSpecs(boolean value) {
        this.includeTechSpecs = value;
    }

    /**
     * Gets the value of the filteredTechSpecTitleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filteredTechSpecTitleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilteredTechSpecTitleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFilteredTechSpecTitleIds() {
        if (filteredTechSpecTitleIds == null) {
            filteredTechSpecTitleIds = new ArrayList<Integer>();
        }
        return this.filteredTechSpecTitleIds;
    }

    /**
     * Gets the value of the measurementSystem property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSystem }
     *     
     */
    public MeasurementSystem getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * Sets the value of the measurementSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSystem }
     *     
     */
    public void setMeasurementSystem(MeasurementSystem value) {
        this.measurementSystem = value;
    }

    /**
     * Gets the value of the includeEnhancedPrices property.
     * 
     */
    public boolean isIncludeEnhancedPrices() {
        return includeEnhancedPrices;
    }

    /**
     * Sets the value of the includeEnhancedPrices property.
     * 
     */
    public void setIncludeEnhancedPrices(boolean value) {
        this.includeEnhancedPrices = value;
    }

    /**
     * Gets the value of the includeStylePackages property.
     * 
     */
    public boolean isIncludeStylePackages() {
        return includeStylePackages;
    }

    /**
     * Sets the value of the includeStylePackages property.
     * 
     */
    public void setIncludeStylePackages(boolean value) {
        this.includeStylePackages = value;
    }

    /**
     * Gets the value of the includeCustomEquipmentInTotalPrices property.
     * 
     */
    public boolean isIncludeCustomEquipmentInTotalPrices() {
        return includeCustomEquipmentInTotalPrices;
    }

    /**
     * Sets the value of the includeCustomEquipmentInTotalPrices property.
     * 
     */
    public void setIncludeCustomEquipmentInTotalPrices(boolean value) {
        this.includeCustomEquipmentInTotalPrices = value;
    }

    /**
     * Gets the value of the includeTaxesInTotalPrices property.
     * 
     */
    public boolean isIncludeTaxesInTotalPrices() {
        return includeTaxesInTotalPrices;
    }

    /**
     * Sets the value of the includeTaxesInTotalPrices property.
     * 
     */
    public void setIncludeTaxesInTotalPrices(boolean value) {
        this.includeTaxesInTotalPrices = value;
    }

    /**
     * Gets the value of the disableOptionOrderLogic property.
     * 
     */
    public boolean isDisableOptionOrderLogic() {
        return disableOptionOrderLogic;
    }

    /**
     * Sets the value of the disableOptionOrderLogic property.
     * 
     */
    public void setDisableOptionOrderLogic(boolean value) {
        this.disableOptionOrderLogic = value;
    }

    /**
     * Gets the value of the priceSetting property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSetting }
     *     
     */
    public PriceSetting getPriceSetting() {
        return priceSetting;
    }

    /**
     * Sets the value of the priceSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSetting }
     *     
     */
    public void setPriceSetting(PriceSetting value) {
        this.priceSetting = value;
    }

}
