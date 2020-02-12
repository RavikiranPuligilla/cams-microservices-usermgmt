
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:configcompare4g.kp.chrome.com}SearchTokenName"/>
 *         &lt;element name="importance" type="{urn:configcompare4g.kp.chrome.com}SearchImportanceType"/>
 *         &lt;element name="type" type="{urn:configcompare4g.kp.chrome.com}SearchCriterionType"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriterion", propOrder = {
    "name",
    "importance",
    "type",
    "value",
    "min",
    "max"
})
public class SearchCriterion {

    @XmlElement(required = true)
    protected SearchTokenName name;
    @XmlElement(required = true)
    protected SearchImportanceType importance;
    @XmlElement(required = true)
    protected SearchCriterionType type;
    @XmlElement(required = true, nillable = true)
    protected String value;
    @XmlElement(required = true, nillable = true)
    protected String min;
    @XmlElement(required = true, nillable = true)
    protected String max;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTokenName }
     *     
     */
    public SearchTokenName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTokenName }
     *     
     */
    public void setName(SearchTokenName value) {
        this.name = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link SearchImportanceType }
     *     
     */
    public SearchImportanceType getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchImportanceType }
     *     
     */
    public void setImportance(SearchImportanceType value) {
        this.importance = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriterionType }
     *     
     */
    public SearchCriterionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriterionType }
     *     
     */
    public void setType(SearchCriterionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

}
