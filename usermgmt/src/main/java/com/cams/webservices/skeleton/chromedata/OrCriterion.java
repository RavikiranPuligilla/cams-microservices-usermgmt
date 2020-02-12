
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importance" type="{urn:configcompare4g.kp.chrome.com}SearchImportanceType"/>
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
@XmlType(name = "OrCriterion", propOrder = {
    "importance",
    "criteriaArray"
})
public class OrCriterion {

    @XmlElement(required = true)
    protected SearchImportanceType importance;
    protected List<SearchCriterion> criteriaArray;

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
