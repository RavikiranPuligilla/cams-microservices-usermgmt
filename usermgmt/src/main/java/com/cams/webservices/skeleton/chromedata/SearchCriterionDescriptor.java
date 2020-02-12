
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriterionDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriterionDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:configcompare4g.kp.chrome.com}SearchTokenName"/>
 *         &lt;element name="type" type="{urn:configcompare4g.kp.chrome.com}SearchCriterionType"/>
 *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unit" type="{urn:configcompare4g.kp.chrome.com}SearchUnitType"/>
 *         &lt;element name="values" type="{urn:configcompare4g.kp.chrome.com}SearchValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriterionDescriptor", propOrder = {
    "name",
    "type",
    "min",
    "max",
    "unit",
    "values"
})
public class SearchCriterionDescriptor {

    @XmlElement(required = true)
    protected SearchTokenName name;
    @XmlElement(required = true)
    protected SearchCriterionType type;
    @XmlElement(required = true, nillable = true)
    protected String min;
    @XmlElement(required = true, nillable = true)
    protected String max;
    @XmlElement(required = true, nillable = true)
    protected SearchUnitType unit;
    protected List<SearchValue> values;

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

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchUnitType }
     *     
     */
    public SearchUnitType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchUnitType }
     *     
     */
    public void setUnit(SearchUnitType value) {
        this.unit = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchValue }
     * 
     * 
     */
    public List<SearchValue> getValues() {
        if (values == null) {
            values = new ArrayList<SearchValue>();
        }
        return this.values;
    }

}
