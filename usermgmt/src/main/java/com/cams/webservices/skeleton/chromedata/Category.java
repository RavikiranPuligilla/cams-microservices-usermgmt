
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryFlag" type="{urn:configcompare4g.kp.chrome.com}CategoryFlag"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
    "categoryFlag",
    "categoryId"
})
public class Category {

    @XmlElement(required = true, nillable = true)
    protected CategoryFlag categoryFlag;
    protected int categoryId;

    /**
     * Gets the value of the categoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryFlag }
     *     
     */
    public CategoryFlag getCategoryFlag() {
        return categoryFlag;
    }

    /**
     * Sets the value of the categoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryFlag }
     *     
     */
    public void setCategoryFlag(CategoryFlag value) {
        this.categoryFlag = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
    }

}
