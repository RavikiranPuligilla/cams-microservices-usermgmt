
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomEquipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerFriendlyHeaderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumerFriendlyHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="msrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="frontWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rearWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomEquipment", propOrder = {
    "orderCode",
    "headerId",
    "header",
    "consumerFriendlyHeaderId",
    "consumerFriendlyHeader",
    "description",
    "invoice",
    "msrp",
    "frontWeight",
    "rearWeight",
    "condition"
})
public class CustomEquipment {

    @XmlElement(required = true)
    protected String orderCode;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer headerId;
    @XmlElement(required = true, nillable = true)
    protected String header;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer consumerFriendlyHeaderId;
    @XmlElement(required = true, nillable = true)
    protected String consumerFriendlyHeader;
    @XmlElement(required = true)
    protected List<String> description;
    protected double invoice;
    protected double msrp;
    protected double frontWeight;
    protected double rearWeight;
    @XmlElement(required = true)
    protected String condition;

    /**
     * Gets the value of the orderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * Sets the value of the orderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCode(String value) {
        this.orderCode = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeaderId(Integer value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
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
     * Gets the value of the consumerFriendlyHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFriendlyHeader() {
        return consumerFriendlyHeader;
    }

    /**
     * Sets the value of the consumerFriendlyHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFriendlyHeader(String value) {
        this.consumerFriendlyHeader = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the invoice property.
     * 
     */
    public double getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     */
    public void setInvoice(double value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the msrp property.
     * 
     */
    public double getMsrp() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     */
    public void setMsrp(double value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the frontWeight property.
     * 
     */
    public double getFrontWeight() {
        return frontWeight;
    }

    /**
     * Sets the value of the frontWeight property.
     * 
     */
    public void setFrontWeight(double value) {
        this.frontWeight = value;
    }

    /**
     * Gets the value of the rearWeight property.
     * 
     */
    public double getRearWeight() {
        return rearWeight;
    }

    /**
     * Sets the value of the rearWeight property.
     * 
     */
    public void setRearWeight(double value) {
        this.rearWeight = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

}
