
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Model complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Model">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="divisionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="divisionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subdivisionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subdivisionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="initialPriceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="buzzModel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Model", propOrder = {
    "modelYear",
    "divisionId",
    "divisionName",
    "subdivisionId",
    "subdivisionName",
    "modelId",
    "modelName",
    "dataReleaseDate",
    "initialPriceDate",
    "dataEffectiveDate",
    "dataComment",
    "buzzModel"
})
public class Model {

    protected int modelYear;
    protected int divisionId;
    @XmlElement(required = true)
    protected String divisionName;
    protected int subdivisionId;
    @XmlElement(required = true)
    protected String subdivisionName;
    protected int modelId;
    @XmlElement(required = true)
    protected String modelName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReleaseDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialPriceDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEffectiveDate;
    @XmlElement(required = true)
    protected String dataComment;
    protected Boolean buzzModel;

    /**
     * Gets the value of the modelYear property.
     * 
     */
    public int getModelYear() {
        return modelYear;
    }

    /**
     * Sets the value of the modelYear property.
     * 
     */
    public void setModelYear(int value) {
        this.modelYear = value;
    }

    /**
     * Gets the value of the divisionId property.
     * 
     */
    public int getDivisionId() {
        return divisionId;
    }

    /**
     * Sets the value of the divisionId property.
     * 
     */
    public void setDivisionId(int value) {
        this.divisionId = value;
    }

    /**
     * Gets the value of the divisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * Sets the value of the divisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionName(String value) {
        this.divisionName = value;
    }

    /**
     * Gets the value of the subdivisionId property.
     * 
     */
    public int getSubdivisionId() {
        return subdivisionId;
    }

    /**
     * Sets the value of the subdivisionId property.
     * 
     */
    public void setSubdivisionId(int value) {
        this.subdivisionId = value;
    }

    /**
     * Gets the value of the subdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivisionName() {
        return subdivisionName;
    }

    /**
     * Sets the value of the subdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivisionName(String value) {
        this.subdivisionName = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     */
    public int getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     */
    public void setModelId(int value) {
        this.modelId = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the dataReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReleaseDate() {
        return dataReleaseDate;
    }

    /**
     * Sets the value of the dataReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReleaseDate(XMLGregorianCalendar value) {
        this.dataReleaseDate = value;
    }

    /**
     * Gets the value of the initialPriceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialPriceDate() {
        return initialPriceDate;
    }

    /**
     * Sets the value of the initialPriceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialPriceDate(XMLGregorianCalendar value) {
        this.initialPriceDate = value;
    }

    /**
     * Gets the value of the dataEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEffectiveDate() {
        return dataEffectiveDate;
    }

    /**
     * Sets the value of the dataEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEffectiveDate(XMLGregorianCalendar value) {
        this.dataEffectiveDate = value;
    }

    /**
     * Gets the value of the dataComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataComment() {
        return dataComment;
    }

    /**
     * Sets the value of the dataComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataComment(String value) {
        this.dataComment = value;
    }

    /**
     * Gets the value of the buzzModel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuzzModel() {
        return buzzModel;
    }

    /**
     * Sets the value of the buzzModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuzzModel(Boolean value) {
        this.buzzModel = value;
    }

}
