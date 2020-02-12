
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationConstraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constraintId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="constraintName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="availableOptions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="preselectedOptions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationConstraint", propOrder = {
    "constraintId",
    "constraintName",
    "availableOptions",
    "preselectedOptions"
})
public class ConfigurationConstraint {

    @XmlElement(required = true)
    protected String constraintId;
    @XmlElement(required = true)
    protected String constraintName;
    @XmlElement(required = true)
    protected List<String> availableOptions;
    protected List<String> preselectedOptions;

    /**
     * Gets the value of the constraintId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintId() {
        return constraintId;
    }

    /**
     * Sets the value of the constraintId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintId(String value) {
        this.constraintId = value;
    }

    /**
     * Gets the value of the constraintName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintName() {
        return constraintName;
    }

    /**
     * Sets the value of the constraintName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintName(String value) {
        this.constraintName = value;
    }

    /**
     * Gets the value of the availableOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAvailableOptions() {
        if (availableOptions == null) {
            availableOptions = new ArrayList<String>();
        }
        return this.availableOptions;
    }

    /**
     * Gets the value of the preselectedOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preselectedOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreselectedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreselectedOptions() {
        if (preselectedOptions == null) {
            preselectedOptions = new ArrayList<String>();
        }
        return this.preselectedOptions;
    }

}
