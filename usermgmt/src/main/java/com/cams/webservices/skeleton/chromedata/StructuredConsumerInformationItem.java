
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredConsumerInformationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredConsumerInformationItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conditionNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredConsumerInformationItem", propOrder = {
    "name",
    "sequence",
    "conditionNote",
    "value"
})
public class StructuredConsumerInformationItem {

    @XmlElement(required = true, nillable = true)
    protected String name;
    protected int sequence;
    @XmlElement(required = true, nillable = true)
    protected String conditionNote;
    @XmlElement(required = true, nillable = true)
    protected String value;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the conditionNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionNote() {
        return conditionNote;
    }

    /**
     * Sets the value of the conditionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionNote(String value) {
        this.conditionNote = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
