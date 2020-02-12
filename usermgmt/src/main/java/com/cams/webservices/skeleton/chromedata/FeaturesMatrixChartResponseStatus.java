
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturesMatrixChartResponseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeaturesMatrixChartResponseStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unrecognizedChartId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unrecognizedStyleIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unrecognizedModelIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{urn:configcompare4g.kp.chrome.com}FeaturesMatrixChartResponseCode"/>
 *         &lt;element name="responseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturesMatrixChartResponseStatus", propOrder = {
    "unrecognizedChartId",
    "unrecognizedStyleIds",
    "unrecognizedModelIds",
    "responseCode",
    "responseDescription"
})
public class FeaturesMatrixChartResponseStatus {

    protected List<String> unrecognizedChartId;
    protected List<String> unrecognizedStyleIds;
    protected List<String> unrecognizedModelIds;
    @XmlElement(required = true)
    protected FeaturesMatrixChartResponseCode responseCode;
    @XmlElement(required = true)
    protected String responseDescription;

    /**
     * Gets the value of the unrecognizedChartId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrecognizedChartId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrecognizedChartId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnrecognizedChartId() {
        if (unrecognizedChartId == null) {
            unrecognizedChartId = new ArrayList<String>();
        }
        return this.unrecognizedChartId;
    }

    /**
     * Gets the value of the unrecognizedStyleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrecognizedStyleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrecognizedStyleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnrecognizedStyleIds() {
        if (unrecognizedStyleIds == null) {
            unrecognizedStyleIds = new ArrayList<String>();
        }
        return this.unrecognizedStyleIds;
    }

    /**
     * Gets the value of the unrecognizedModelIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrecognizedModelIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrecognizedModelIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnrecognizedModelIds() {
        if (unrecognizedModelIds == null) {
            unrecognizedModelIds = new ArrayList<String>();
        }
        return this.unrecognizedModelIds;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesMatrixChartResponseCode }
     *     
     */
    public FeaturesMatrixChartResponseCode getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesMatrixChartResponseCode }
     *     
     */
    public void setResponseCode(FeaturesMatrixChartResponseCode value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
    }

}
