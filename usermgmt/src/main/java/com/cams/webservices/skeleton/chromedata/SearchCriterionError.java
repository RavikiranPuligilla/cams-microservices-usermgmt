
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriterionError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriterionError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:configcompare4g.kp.chrome.com}SearchTokenName"/>
 *         &lt;element name="type" type="{urn:configcompare4g.kp.chrome.com}SearchErrorType"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriterionError", propOrder = {
    "name",
    "type",
    "error"
})
public class SearchCriterionError {

    @XmlElement(required = true)
    protected SearchTokenName name;
    @XmlElement(required = true)
    protected SearchErrorType type;
    @XmlElement(required = true)
    protected String error;

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
     *     {@link SearchErrorType }
     *     
     */
    public SearchErrorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchErrorType }
     *     
     */
    public void setType(SearchErrorType value) {
        this.type = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
