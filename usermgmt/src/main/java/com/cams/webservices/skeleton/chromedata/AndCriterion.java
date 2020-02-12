
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AndCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AndCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:configcompare4g.kp.chrome.com}SearchTokenName"/>
 *         &lt;element name="criteriaArray" type="{urn:configcompare4g.kp.chrome.com}SearchCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AndCriterion", propOrder = {
    "name",
    "criteriaArray"
})
public class AndCriterion {

    @XmlElement(required = true)
    protected SearchTokenName name;
    protected List<SearchCriterion> criteriaArray;

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

}
