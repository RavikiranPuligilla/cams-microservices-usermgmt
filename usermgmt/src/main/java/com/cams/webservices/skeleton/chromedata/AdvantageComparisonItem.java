
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvantageComparisonItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvantageComparisonItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonResultType" type="{urn:configcompare4g.kp.chrome.com}ComparisonResultType"/>
 *         &lt;element name="comparisonValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="difference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="naturalLanguageDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pivotValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvantageComparisonItem", propOrder = {
    "comparisonResultType",
    "comparisonValue",
    "difference",
    "naturalLanguageDescription",
    "pivotValue",
    "ruleDescription",
    "units"
})
public class AdvantageComparisonItem {

    @XmlElement(required = true)
    protected ComparisonResultType comparisonResultType;
    @XmlElement(required = true, nillable = true)
    protected String comparisonValue;
    @XmlElement(required = true, nillable = true)
    protected String difference;
    @XmlElement(required = true)
    protected String naturalLanguageDescription;
    @XmlElement(required = true, nillable = true)
    protected String pivotValue;
    @XmlElement(required = true, nillable = true)
    protected String ruleDescription;
    @XmlElement(required = true, nillable = true)
    protected String units;

    /**
     * Gets the value of the comparisonResultType property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonResultType }
     *     
     */
    public ComparisonResultType getComparisonResultType() {
        return comparisonResultType;
    }

    /**
     * Sets the value of the comparisonResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonResultType }
     *     
     */
    public void setComparisonResultType(ComparisonResultType value) {
        this.comparisonResultType = value;
    }

    /**
     * Gets the value of the comparisonValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparisonValue() {
        return comparisonValue;
    }

    /**
     * Sets the value of the comparisonValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparisonValue(String value) {
        this.comparisonValue = value;
    }

    /**
     * Gets the value of the difference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifference() {
        return difference;
    }

    /**
     * Sets the value of the difference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifference(String value) {
        this.difference = value;
    }

    /**
     * Gets the value of the naturalLanguageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalLanguageDescription() {
        return naturalLanguageDescription;
    }

    /**
     * Sets the value of the naturalLanguageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalLanguageDescription(String value) {
        this.naturalLanguageDescription = value;
    }

    /**
     * Gets the value of the pivotValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPivotValue() {
        return pivotValue;
    }

    /**
     * Sets the value of the pivotValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPivotValue(String value) {
        this.pivotValue = value;
    }

    /**
     * Gets the value of the ruleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Sets the value of the ruleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDescription(String value) {
        this.ruleDescription = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

}
