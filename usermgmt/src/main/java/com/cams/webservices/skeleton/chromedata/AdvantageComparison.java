
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvantageComparison complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvantageComparison">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonConfiguration" type="{urn:configcompare4g.kp.chrome.com}Configuration"/>
 *         &lt;element name="comparisonItems" type="{urn:configcompare4g.kp.chrome.com}AdvantageComparisonItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvantageComparison", propOrder = {
    "comparisonConfiguration",
    "comparisonItems"
})
public class AdvantageComparison {

    @XmlElement(required = true)
    protected Configuration comparisonConfiguration;
    protected List<AdvantageComparisonItem> comparisonItems;

    /**
     * Gets the value of the comparisonConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link Configuration }
     *     
     */
    public Configuration getComparisonConfiguration() {
        return comparisonConfiguration;
    }

    /**
     * Sets the value of the comparisonConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration }
     *     
     */
    public void setComparisonConfiguration(Configuration value) {
        this.comparisonConfiguration = value;
    }

    /**
     * Gets the value of the comparisonItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvantageComparisonItem }
     * 
     * 
     */
    public List<AdvantageComparisonItem> getComparisonItems() {
        if (comparisonItems == null) {
            comparisonItems = new ArrayList<AdvantageComparisonItem>();
        }
        return this.comparisonItems;
    }

}
