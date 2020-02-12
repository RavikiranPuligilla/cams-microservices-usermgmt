
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CargoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="liquidCargo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cargoWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="distanceFromRearAxle" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoItem", propOrder = {
    "itemName",
    "liquidCargo",
    "cargoWeight",
    "distanceFromRearAxle"
})
public class CargoItem {

    @XmlElement(required = true, nillable = true)
    protected String itemName;
    protected boolean liquidCargo;
    protected double cargoWeight;
    protected double distanceFromRearAxle;

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the liquidCargo property.
     * 
     */
    public boolean isLiquidCargo() {
        return liquidCargo;
    }

    /**
     * Sets the value of the liquidCargo property.
     * 
     */
    public void setLiquidCargo(boolean value) {
        this.liquidCargo = value;
    }

    /**
     * Gets the value of the cargoWeight property.
     * 
     */
    public double getCargoWeight() {
        return cargoWeight;
    }

    /**
     * Sets the value of the cargoWeight property.
     * 
     */
    public void setCargoWeight(double value) {
        this.cargoWeight = value;
    }

    /**
     * Gets the value of the distanceFromRearAxle property.
     * 
     */
    public double getDistanceFromRearAxle() {
        return distanceFromRearAxle;
    }

    /**
     * Sets the value of the distanceFromRearAxle property.
     * 
     */
    public void setDistanceFromRearAxle(double value) {
        this.distanceFromRearAxle = value;
    }

}
