
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pivotConfiguration" type="{urn:configcompare4g.kp.chrome.com}Configuration"/>
 *         &lt;element name="comparisons" type="{urn:configcompare4g.kp.chrome.com}AdvantageComparison" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pivotConfiguration",
    "comparisons"
})
@XmlRootElement(name = "AdvantageBasedComparison")
public class AdvantageBasedComparison {

    @XmlElement(required = true)
    protected Configuration pivotConfiguration;
    protected List<AdvantageComparison> comparisons;

    /**
     * Gets the value of the pivotConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link Configuration }
     *     
     */
    public Configuration getPivotConfiguration() {
        return pivotConfiguration;
    }

    /**
     * Sets the value of the pivotConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration }
     *     
     */
    public void setPivotConfiguration(Configuration value) {
        this.pivotConfiguration = value;
    }

    /**
     * Gets the value of the comparisons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvantageComparison }
     * 
     * 
     */
    public List<AdvantageComparison> getComparisons() {
        if (comparisons == null) {
            comparisons = new ArrayList<AdvantageComparison>();
        }
        return this.comparisons;
    }

}
