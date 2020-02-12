
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaArray" type="{urn:configcompare4g.kp.chrome.com}SearchCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orCriteriaArray" type="{urn:configcompare4g.kp.chrome.com}OrCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="andCriteriaArray" type="{urn:configcompare4g.kp.chrome.com}AndCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rangeTokens" type="{urn:configcompare4g.kp.chrome.com}SearchTokenName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filterTBD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterByPostalCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxNumResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buzzResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchServiceRequest", propOrder = {
    "criteriaArray",
    "orCriteriaArray",
    "andCriteriaArray",
    "rangeTokens",
    "filterTBD",
    "filterByPostalCode",
    "postalCode",
    "maxNumResults",
    "buzzResults"
})
public class SearchServiceRequest {

    protected List<SearchCriterion> criteriaArray;
    protected List<OrCriterion> orCriteriaArray;
    protected List<AndCriterion> andCriteriaArray;
    protected List<SearchTokenName> rangeTokens;
    @XmlElement(defaultValue = "false")
    protected boolean filterTBD;
    @XmlElement(defaultValue = "false")
    protected boolean filterByPostalCode;
    @XmlElement(required = true, nillable = true)
    protected String postalCode;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxNumResults;
    @XmlElement(defaultValue = "false")
    protected boolean buzzResults;

    /**
     * Gets the value of the criteriaArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchCriterion }
     * 
     * 
     */
    public List<SearchCriterion> getCriteriaArray() {
        if (criteriaArray == null) {
            criteriaArray = new ArrayList<SearchCriterion>();
        }
        return this.criteriaArray;
    }

    /**
     * Gets the value of the orCriteriaArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orCriteriaArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrCriteriaArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrCriterion }
     * 
     * 
     */
    public List<OrCriterion> getOrCriteriaArray() {
        if (orCriteriaArray == null) {
            orCriteriaArray = new ArrayList<OrCriterion>();
        }
        return this.orCriteriaArray;
    }

    /**
     * Gets the value of the andCriteriaArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the andCriteriaArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAndCriteriaArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AndCriterion }
     * 
     * 
     */
    public List<AndCriterion> getAndCriteriaArray() {
        if (andCriteriaArray == null) {
            andCriteriaArray = new ArrayList<AndCriterion>();
        }
        return this.andCriteriaArray;
    }

    /**
     * Gets the value of the rangeTokens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangeTokens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeTokens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTokenName }
     * 
     * 
     */
    public List<SearchTokenName> getRangeTokens() {
        if (rangeTokens == null) {
            rangeTokens = new ArrayList<SearchTokenName>();
        }
        return this.rangeTokens;
    }

    /**
     * Gets the value of the filterTBD property.
     * 
     */
    public boolean isFilterTBD() {
        return filterTBD;
    }

    /**
     * Sets the value of the filterTBD property.
     * 
     */
    public void setFilterTBD(boolean value) {
        this.filterTBD = value;
    }

    /**
     * Gets the value of the filterByPostalCode property.
     * 
     */
    public boolean isFilterByPostalCode() {
        return filterByPostalCode;
    }

    /**
     * Sets the value of the filterByPostalCode property.
     * 
     */
    public void setFilterByPostalCode(boolean value) {
        this.filterByPostalCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the maxNumResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumResults() {
        return maxNumResults;
    }

    /**
     * Sets the value of the maxNumResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumResults(Integer value) {
        this.maxNumResults = value;
    }

    /**
     * Gets the value of the buzzResults property.
     * 
     */
    public boolean isBuzzResults() {
        return buzzResults;
    }

    /**
     * Sets the value of the buzzResults property.
     * 
     */
    public void setBuzzResults(boolean value) {
        this.buzzResults = value;
    }

}
