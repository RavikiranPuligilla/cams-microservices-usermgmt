
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelEditorialContentSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelEditorialContentSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="editorialContentSource" type="{urn:configcompare4g.kp.chrome.com}EditorialContentSource"/>
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
@XmlType(name = "ModelEditorialContentSource", propOrder = {
    "editorialContentSource",
    "availableStyleIds"
})
public class ModelEditorialContentSource {

    @XmlElement(required = true)
    protected EditorialContentSource editorialContentSource;
    @XmlElement(type = Integer.class)
    protected List<Integer> availableStyleIds;

    /**
     * Gets the value of the editorialContentSource property.
     * 
     * @return
     *     possible object is
     *     {@link EditorialContentSource }
     *     
     */
    public EditorialContentSource getEditorialContentSource() {
        return editorialContentSource;
    }

    /**
     * Sets the value of the editorialContentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorialContentSource }
     *     
     */
    public void setEditorialContentSource(EditorialContentSource value) {
        this.editorialContentSource = value;
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
