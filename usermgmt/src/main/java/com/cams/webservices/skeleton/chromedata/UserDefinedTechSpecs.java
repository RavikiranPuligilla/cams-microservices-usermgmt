
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDefinedTechSpecs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedTechSpecs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roadSurface" type="{urn:configcompare4g.kp.chrome.com}RoadSurface"/>
 *         &lt;element name="roadGrade" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="occupantWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bodyLength" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bodyFrontalArea" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bodyWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cabToBodyDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="trailerWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cargoItems" type="{urn:configcompare4g.kp.chrome.com}CargoItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bodyType" type="{urn:configcompare4g.kp.chrome.com}UserDefinedBodyType" minOccurs="0"/>
 *         &lt;element name="measurementSystem" type="{urn:configcompare4g.kp.chrome.com}MeasurementSystem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedTechSpecs", propOrder = {
    "roadSurface",
    "roadGrade",
    "occupantWeight",
    "bodyLength",
    "bodyFrontalArea",
    "bodyWeight",
    "cabToBodyDistance",
    "trailerWeight",
    "cargoItems",
    "bodyType",
    "measurementSystem"
})
public class UserDefinedTechSpecs {

    @XmlElement(required = true)
    protected RoadSurface roadSurface;
    protected double roadGrade;
    protected double occupantWeight;
    protected double bodyLength;
    protected double bodyFrontalArea;
    protected double bodyWeight;
    protected double cabToBodyDistance;
    protected double trailerWeight;
    protected List<CargoItem> cargoItems;
    protected UserDefinedBodyType bodyType;
    @XmlElement(required = true)
    protected MeasurementSystem measurementSystem;

    /**
     * Gets the value of the roadSurface property.
     * 
     * @return
     *     possible object is
     *     {@link RoadSurface }
     *     
     */
    public RoadSurface getRoadSurface() {
        return roadSurface;
    }

    /**
     * Sets the value of the roadSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSurface }
     *     
     */
    public void setRoadSurface(RoadSurface value) {
        this.roadSurface = value;
    }

    /**
     * Gets the value of the roadGrade property.
     * 
     */
    public double getRoadGrade() {
        return roadGrade;
    }

    /**
     * Sets the value of the roadGrade property.
     * 
     */
    public void setRoadGrade(double value) {
        this.roadGrade = value;
    }

    /**
     * Gets the value of the occupantWeight property.
     * 
     */
    public double getOccupantWeight() {
        return occupantWeight;
    }

    /**
     * Sets the value of the occupantWeight property.
     * 
     */
    public void setOccupantWeight(double value) {
        this.occupantWeight = value;
    }

    /**
     * Gets the value of the bodyLength property.
     * 
     */
    public double getBodyLength() {
        return bodyLength;
    }

    /**
     * Sets the value of the bodyLength property.
     * 
     */
    public void setBodyLength(double value) {
        this.bodyLength = value;
    }

    /**
     * Gets the value of the bodyFrontalArea property.
     * 
     */
    public double getBodyFrontalArea() {
        return bodyFrontalArea;
    }

    /**
     * Sets the value of the bodyFrontalArea property.
     * 
     */
    public void setBodyFrontalArea(double value) {
        this.bodyFrontalArea = value;
    }

    /**
     * Gets the value of the bodyWeight property.
     * 
     */
    public double getBodyWeight() {
        return bodyWeight;
    }

    /**
     * Sets the value of the bodyWeight property.
     * 
     */
    public void setBodyWeight(double value) {
        this.bodyWeight = value;
    }

    /**
     * Gets the value of the cabToBodyDistance property.
     * 
     */
    public double getCabToBodyDistance() {
        return cabToBodyDistance;
    }

    /**
     * Sets the value of the cabToBodyDistance property.
     * 
     */
    public void setCabToBodyDistance(double value) {
        this.cabToBodyDistance = value;
    }

    /**
     * Gets the value of the trailerWeight property.
     * 
     */
    public double getTrailerWeight() {
        return trailerWeight;
    }

    /**
     * Sets the value of the trailerWeight property.
     * 
     */
    public void setTrailerWeight(double value) {
        this.trailerWeight = value;
    }

    /**
     * Gets the value of the cargoItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CargoItem }
     * 
     * 
     */
    public List<CargoItem> getCargoItems() {
        if (cargoItems == null) {
            cargoItems = new ArrayList<CargoItem>();
        }
        return this.cargoItems;
    }

    /**
     * Gets the value of the bodyType property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedBodyType }
     *     
     */
    public UserDefinedBodyType getBodyType() {
        return bodyType;
    }

    /**
     * Sets the value of the bodyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedBodyType }
     *     
     */
    public void setBodyType(UserDefinedBodyType value) {
        this.bodyType = value;
    }

    /**
     * Gets the value of the measurementSystem property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSystem }
     *     
     */
    public MeasurementSystem getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * Sets the value of the measurementSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSystem }
     *     
     */
    public void setMeasurementSystem(MeasurementSystem value) {
        this.measurementSystem = value;
    }

}
