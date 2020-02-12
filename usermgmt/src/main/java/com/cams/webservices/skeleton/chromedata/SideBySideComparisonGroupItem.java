
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SideBySideComparisonGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SideBySideComparisonGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonFeatureId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comparisonFeatureType" type="{urn:configcompare4g.kp.chrome.com}ComparisonFeatureType"/>
 *         &lt;element name="comparisonValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="featureDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SideBySideComparisonGroupItem", propOrder = {
    "comparisonFeatureId",
    "comparisonFeatureType",
    "comparisonValues",
    "featureDescription",
    "unitOfMeasure"
})
public class SideBySideComparisonGroupItem {

    protected int comparisonFeatureId;
    @XmlElement(required = true)
    protected ComparisonFeatureType comparisonFeatureType;
    @XmlElement(required = true)
    protected List<String> comparisonValues;
    @XmlElement(required = true)
    protected String featureDescription;
    @XmlElement(required = true, nillable = true)
    protected String unitOfMeasure;

    /**
     * Gets the value of the comparisonFeatureId property.
     * 
     */
    public int getComparisonFeatureId() {
        return comparisonFeatureId;
    }

    /**
     * Sets the value of the comparisonFeatureId property.
     * 
     */
    public void setComparisonFeatureId(int value) {
        this.comparisonFeatureId = value;
    }

    /**
     * Gets the value of the comparisonFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonFeatureType }
     *     
     */
    public ComparisonFeatureType getComparisonFeatureType() {
        return comparisonFeatureType;
    }

    /**
     * Sets the value of the comparisonFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonFeatureType }
     *     
     */
    public void setComparisonFeatureType(ComparisonFeatureType value) {
        this.comparisonFeatureType = value;
    }

    /**
     * Gets the value of the comparisonValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComparisonValues() {
        if (comparisonValues == null) {
            comparisonValues = new ArrayList<String>();
        }
        return this.comparisonValues;
    }

    /**
     * Gets the value of the featureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureDescription() {
        return featureDescription;
    }

    /**
     * Sets the value of the featureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureDescription(String value) {
        this.featureDescription = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

}
