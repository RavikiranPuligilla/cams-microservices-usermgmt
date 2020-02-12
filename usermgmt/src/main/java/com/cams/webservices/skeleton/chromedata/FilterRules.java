
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderAvailability" type="{urn:configcompare4g.kp.chrome.com}OrderAvailability"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketClassIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vehicleTypes" type="{urn:configcompare4g.kp.chrome.com}VehicleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="msrpRange" type="{urn:configcompare4g.kp.chrome.com}MoneyRange"/>
 *         &lt;element name="buzzResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterRules", propOrder = {
    "orderAvailability",
    "postalCode",
    "marketClassIds",
    "vehicleTypes",
    "msrpRange",
    "buzzResults"
})
public class FilterRules {

    @XmlElement(required = true)
    protected OrderAvailability orderAvailability;
    @XmlElement(required = true, nillable = true)
    protected String postalCode;
    @XmlElement(nillable = true)
    protected List<Integer> marketClassIds;
    @XmlElement(nillable = true)
    protected List<VehicleType> vehicleTypes;
    @XmlElement(required = true, nillable = true)
    protected MoneyRange msrpRange;
    @XmlElement(defaultValue = "false")
    protected boolean buzzResults;

    /**
     * Gets the value of the orderAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAvailability }
     *     
     */
    public OrderAvailability getOrderAvailability() {
        return orderAvailability;
    }

    /**
     * Sets the value of the orderAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAvailability }
     *     
     */
    public void setOrderAvailability(OrderAvailability value) {
        this.orderAvailability = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the marketClassIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketClassIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketClassIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getMarketClassIds() {
        if (marketClassIds == null) {
            marketClassIds = new ArrayList<Integer>();
        }
        return this.marketClassIds;
    }

    /**
     * Gets the value of the vehicleTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleType }
     * 
     * 
     */
    public List<VehicleType> getVehicleTypes() {
        if (vehicleTypes == null) {
            vehicleTypes = new ArrayList<VehicleType>();
        }
        return this.vehicleTypes;
    }

    /**
     * Gets the value of the msrpRange property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyRange }
     *     
     */
    public MoneyRange getMsrpRange() {
        return msrpRange;
    }

    /**
     * Sets the value of the msrpRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyRange }
     *     
     */
    public void setMsrpRange(MoneyRange value) {
        this.msrpRange = value;
    }

    /**
     * Gets the value of the buzzResults property.
     * 
     */
    public boolean isBuzzResults() {
        return buzzResults;
    }

    /**
     * Sets the value of the buzzResults property.
     * 
     */
    public void setBuzzResults(boolean value) {
        this.buzzResults = value;
    }

}
