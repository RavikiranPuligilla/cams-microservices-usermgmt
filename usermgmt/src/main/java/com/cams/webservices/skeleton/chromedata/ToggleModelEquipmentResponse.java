
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
 *         &lt;element name="status" type="{urn:configcompare4g.kp.chrome.com}ToggleOptionResponseStatus"/>
 *         &lt;element name="originatingChromeOptionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originatingOptionAnAddition" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="additionAffectedChromeOptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deletionAffectedChromeOptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conflictResolvingChromeOptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requiresToggleToResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="configuration" type="{urn:configcompare4g.kp.chrome.com}ModelConfiguration"/>
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
    "status",
    "originatingChromeOptionCode",
    "originatingOptionAnAddition",
    "additionAffectedChromeOptionCodes",
    "deletionAffectedChromeOptionCodes",
    "conflictResolvingChromeOptionCodes",
    "requiresToggleToResolve",
    "configuration"
})
@XmlRootElement(name = "ToggleModelEquipmentResponse")
public class ToggleModelEquipmentResponse {

    @XmlElement(required = true)
    protected ToggleOptionResponseStatus status;
    @XmlElement(required = true, nillable = true)
    protected String originatingChromeOptionCode;
    protected boolean originatingOptionAnAddition;
    protected List<String> additionAffectedChromeOptionCodes;
    protected List<String> deletionAffectedChromeOptionCodes;
    protected List<String> conflictResolvingChromeOptionCodes;
    protected boolean requiresToggleToResolve;
    @XmlElement(required = true)
    protected ModelConfiguration configuration;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ToggleOptionResponseStatus }
     *     
     */
    public ToggleOptionResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToggleOptionResponseStatus }
     *     
     */
    public void setStatus(ToggleOptionResponseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the originatingChromeOptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingChromeOptionCode() {
        return originatingChromeOptionCode;
    }

    /**
     * Sets the value of the originatingChromeOptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingChromeOptionCode(String value) {
        this.originatingChromeOptionCode = value;
    }

    /**
     * Gets the value of the originatingOptionAnAddition property.
     * 
     */
    public boolean isOriginatingOptionAnAddition() {
        return originatingOptionAnAddition;
    }

    /**
     * Sets the value of the originatingOptionAnAddition property.
     * 
     */
    public void setOriginatingOptionAnAddition(boolean value) {
        this.originatingOptionAnAddition = value;
    }

    /**
     * Gets the value of the additionAffectedChromeOptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionAffectedChromeOptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionAffectedChromeOptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionAffectedChromeOptionCodes() {
        if (additionAffectedChromeOptionCodes == null) {
            additionAffectedChromeOptionCodes = new ArrayList<String>();
        }
        return this.additionAffectedChromeOptionCodes;
    }

    /**
     * Gets the value of the deletionAffectedChromeOptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletionAffectedChromeOptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletionAffectedChromeOptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeletionAffectedChromeOptionCodes() {
        if (deletionAffectedChromeOptionCodes == null) {
            deletionAffectedChromeOptionCodes = new ArrayList<String>();
        }
        return this.deletionAffectedChromeOptionCodes;
    }

    /**
     * Gets the value of the conflictResolvingChromeOptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conflictResolvingChromeOptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConflictResolvingChromeOptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConflictResolvingChromeOptionCodes() {
        if (conflictResolvingChromeOptionCodes == null) {
            conflictResolvingChromeOptionCodes = new ArrayList<String>();
        }
        return this.conflictResolvingChromeOptionCodes;
    }

    /**
     * Gets the value of the requiresToggleToResolve property.
     * 
     */
    public boolean isRequiresToggleToResolve() {
        return requiresToggleToResolve;
    }

    /**
     * Sets the value of the requiresToggleToResolve property.
     * 
     */
    public void setRequiresToggleToResolve(boolean value) {
        this.requiresToggleToResolve = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link ModelConfiguration }
     *     
     */
    public ModelConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelConfiguration }
     *     
     */
    public void setConfiguration(ModelConfiguration value) {
        this.configuration = value;
    }

}
