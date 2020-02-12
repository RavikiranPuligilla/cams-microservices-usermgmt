
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelReturnParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelReturnParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeEquipmentDescriptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeSpecialEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeExtendedOEMEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *         &lt;element name="disableEquipmentOrderLogic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelReturnParameters", propOrder = {
    "includeEquipment",
    "includeEquipmentDescriptions",
    "includeSpecialEquipment",
    "includeExtendedOEMEquipment",
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
    "disableEquipmentOrderLogic"
})
public class ModelReturnParameters {

    protected boolean includeEquipment;
    protected boolean includeEquipmentDescriptions;
    protected boolean includeSpecialEquipment;
    protected boolean includeExtendedOEMEquipment;
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
    protected boolean disableEquipmentOrderLogic;

    /**
     * Gets the value of the includeEquipment property.
     * 
     */
    public boolean isIncludeEquipment() {
        return includeEquipment;
    }

    /**
     * Sets the value of the includeEquipment property.
     * 
     */
    public void setIncludeEquipment(boolean value) {
        this.includeEquipment = value;
    }

    /**
     * Gets the value of the includeEquipmentDescriptions property.
     * 
     */
    public boolean isIncludeEquipmentDescriptions() {
        return includeEquipmentDescriptions;
    }

    /**
     * Sets the value of the includeEquipmentDescriptions property.
     * 
     */
    public void setIncludeEquipmentDescriptions(boolean value) {
        this.includeEquipmentDescriptions = value;
    }

    /**
     * Gets the value of the includeSpecialEquipment property.
     * 
     */
    public boolean isIncludeSpecialEquipment() {
        return includeSpecialEquipment;
    }

    /**
     * Sets the value of the includeSpecialEquipment property.
     * 
     */
    public void setIncludeSpecialEquipment(boolean value) {
        this.includeSpecialEquipment = value;
    }

    /**
     * Gets the value of the includeExtendedOEMEquipment property.
     * 
     */
    public boolean isIncludeExtendedOEMEquipment() {
        return includeExtendedOEMEquipment;
    }

    /**
     * Sets the value of the includeExtendedOEMEquipment property.
     * 
     */
    public void setIncludeExtendedOEMEquipment(boolean value) {
        this.includeExtendedOEMEquipment = value;
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
     * Gets the value of the disableEquipmentOrderLogic property.
     * 
     */
    public boolean isDisableEquipmentOrderLogic() {
        return disableEquipmentOrderLogic;
    }

    /**
     * Sets the value of the disableEquipmentOrderLogic property.
     * 
     */
    public void setDisableEquipmentOrderLogic(boolean value) {
        this.disableEquipmentOrderLogic = value;
    }

}
