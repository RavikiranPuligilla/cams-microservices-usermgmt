
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
 *         &lt;element name="comparisonConfigurations" type="{urn:configcompare4g.kp.chrome.com}Configuration" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="comparisonGroups" type="{urn:configcompare4g.kp.chrome.com}SideBySideComparisonGroup" maxOccurs="unbounded" minOccurs="0"/>
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
    "comparisonConfigurations",
    "comparisonGroups"
})
@XmlRootElement(name = "SideBySideComparison")
public class SideBySideComparison {

    @XmlElement(required = true)
    protected List<Configuration> comparisonConfigurations;
    protected List<SideBySideComparisonGroup> comparisonGroups;

    /**
     * Gets the value of the comparisonConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Configuration }
     * 
     * 
     */
    public List<Configuration> getComparisonConfigurations() {
        if (comparisonConfigurations == null) {
            comparisonConfigurations = new ArrayList<Configuration>();
        }
        return this.comparisonConfigurations;
    }

    /**
     * Gets the value of the comparisonGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SideBySideComparisonGroup }
     * 
     * 
     */
    public List<SideBySideComparisonGroup> getComparisonGroups() {
        if (comparisonGroups == null) {
            comparisonGroups = new ArrayList<SideBySideComparisonGroup>();
        }
        return this.comparisonGroups;
    }

}
