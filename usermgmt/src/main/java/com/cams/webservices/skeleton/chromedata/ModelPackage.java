
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stylePackage" type="{urn:configcompare4g.kp.chrome.com}StylePackage"/>
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
@XmlType(name = "ModelPackage", propOrder = {
    "stylePackage",
    "availableStyleIds"
})
public class ModelPackage {

    @XmlElement(required = true)
    protected StylePackage stylePackage;
    @XmlElement(type = Integer.class)
    protected List<Integer> availableStyleIds;

    /**
     * Gets the value of the stylePackage property.
     * 
     * @return
     *     possible object is
     *     {@link StylePackage }
     *     
     */
    public StylePackage getStylePackage() {
        return stylePackage;
    }

    /**
     * Sets the value of the stylePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StylePackage }
     *     
     */
    public void setStylePackage(StylePackage value) {
        this.stylePackage = value;
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
