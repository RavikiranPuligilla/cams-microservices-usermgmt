
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelStructuredConsumerInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelStructuredConsumerInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="structuredConsumerInformation" type="{urn:configcompare4g.kp.chrome.com}StructuredConsumerInformation"/>
 *         &lt;element name="availableStyleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelStructuredConsumerInformation", propOrder = {
    "structuredConsumerInformation",
    "availableStyleIds"
})
public class ModelStructuredConsumerInformation {

    @XmlElement(required = true)
    protected StructuredConsumerInformation structuredConsumerInformation;
    @XmlElement(type = Integer.class)
    protected List<Integer> availableStyleIds;

    /**
     * Gets the value of the structuredConsumerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredConsumerInformation }
     *     
     */
    public StructuredConsumerInformation getStructuredConsumerInformation() {
        return structuredConsumerInformation;
    }

    /**
     * Sets the value of the structuredConsumerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredConsumerInformation }
     *     
     */
    public void setStructuredConsumerInformation(StructuredConsumerInformation value) {
        this.structuredConsumerInformation = value;
    }

    /**
     * Gets the value of the availableStyleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableStyleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableStyleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAvailableStyleIds() {
        if (availableStyleIds == null) {
            availableStyleIds = new ArrayList<Integer>();
        }
        return this.availableStyleIds;
    }

}
