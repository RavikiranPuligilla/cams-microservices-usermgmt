
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionKind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionKind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="optionKindId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="optionKindName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionKind", propOrder = {
    "optionKindId",
    "optionKindName"
})
public class OptionKind {

    protected int optionKindId;
    @XmlElement(required = true, nillable = true)
    protected String optionKindName;

    /**
     * Gets the value of the optionKindId property.
     * 
     */
    public int getOptionKindId() {
        return optionKindId;
    }

    /**
     * Sets the value of the optionKindId property.
     * 
     */
    public void setOptionKindId(int value) {
        this.optionKindId = value;
    }

    /**
     * Gets the value of the optionKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionKindName() {
        return optionKindName;
    }

    /**
     * Sets the value of the optionKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionKindName(String value) {
        this.optionKindName = value;
    }

}
