
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StylePackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StylePackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="msrp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invoiceDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="msrpDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="displaySequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="items" type="{urn:configcompare4g.kp.chrome.com}StylePackageItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StylePackage", propOrder = {
    "name",
    "optionCode",
    "invoice",
    "msrp",
    "invoiceDiscount",
    "msrpDiscount",
    "displaySequence",
    "items"
})
public class StylePackage {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String optionCode;
    protected double invoice;
    protected double msrp;
    protected double invoiceDiscount;
    protected double msrpDiscount;
    protected int displaySequence;
    @XmlElement(required = true)
    protected List<StylePackageItem> items;

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
     * Gets the value of the optionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * Sets the value of the optionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCode(String value) {
        this.optionCode = value;
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
     * Gets the value of the invoiceDiscount property.
     * 
     */
    public double getInvoiceDiscount() {
        return invoiceDiscount;
    }

    /**
     * Sets the value of the invoiceDiscount property.
     * 
     */
    public void setInvoiceDiscount(double value) {
        this.invoiceDiscount = value;
    }

    /**
     * Gets the value of the msrpDiscount property.
     * 
     */
    public double getMsrpDiscount() {
        return msrpDiscount;
    }

    /**
     * Sets the value of the msrpDiscount property.
     * 
     */
    public void setMsrpDiscount(double value) {
        this.msrpDiscount = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     */
    public int getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     */
    public void setDisplaySequence(int value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StylePackageItem }
     * 
     * 
     */
    public List<StylePackageItem> getItems() {
        if (items == null) {
            items = new ArrayList<StylePackageItem>();
        }
        return this.items;
    }

}
