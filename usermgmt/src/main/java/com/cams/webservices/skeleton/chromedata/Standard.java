
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Standard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Standard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="headerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="headerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyHeaderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumerFriendlyHeaderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categories" type="{urn:configcompare4g.kp.chrome.com}Category" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="upgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upgradedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Standard", propOrder = {
    "headerId",
    "headerName",
    "consumerFriendlyHeaderId",
    "consumerFriendlyHeaderName",
    "description",
    "categories",
    "upgrade",
    "upgradedTo"
})
public class Standard {

    protected int headerId;
    @XmlElement(required = true)
    protected String headerName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer consumerFriendlyHeaderId;
    @XmlElement(required = true, nillable = true)
    protected String consumerFriendlyHeaderName;
    @XmlElement(required = true)
    protected String description;
    protected List<Category> categories;
    protected boolean upgrade;
    protected String upgradedTo;

    /**
     * Gets the value of the headerId property.
     * 
     */
    public int getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     */
    public void setHeaderId(int value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the headerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderName() {
        return headerName;
    }

    /**
     * Sets the value of the headerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderName(String value) {
        this.headerName = value;
    }

    /**
     * Gets the value of the consumerFriendlyHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumerFriendlyHeaderId() {
        return consumerFriendlyHeaderId;
    }

    /**
     * Sets the value of the consumerFriendlyHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumerFriendlyHeaderId(Integer value) {
        this.consumerFriendlyHeaderId = value;
    }

    /**
     * Gets the value of the consumerFriendlyHeaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFriendlyHeaderName() {
        return consumerFriendlyHeaderName;
    }

    /**
     * Sets the value of the consumerFriendlyHeaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFriendlyHeaderName(String value) {
        this.consumerFriendlyHeaderName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * 
     * 
     */
    public List<Category> getCategories() {
        if (categories == null) {
            categories = new ArrayList<Category>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the upgrade property.
     * 
     */
    public boolean isUpgrade() {
        return upgrade;
    }

    /**
     * Sets the value of the upgrade property.
     * 
     */
    public void setUpgrade(boolean value) {
        this.upgrade = value;
    }

    /**
     * Gets the value of the upgradedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradedTo() {
        return upgradedTo;
    }

    /**
     * Sets the value of the upgradedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradedTo(String value) {
        this.upgradedTo = value;
    }

}
