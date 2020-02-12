
package com.cams.webservices.skeleton.gps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="temperatureMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useDaylightSavingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursOfOperationSunday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursOfOperationMonday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursOfOperationTuesday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursOfOperationWednesday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursOfOperationThursday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursOfOperationFriday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursOfOperationSaturday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="savePositionDuringHoursOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "securityToken",
    "clientID",
    "groupName",
    "supervisorName",
    "description",
    "timezone",
    "unitOfMeasure",
    "volumeMeasurement",
    "temperatureMeasurement",
    "country",
    "useDaylightSavingTime",
    "hoursOfOperationSunday",
    "hoursOfOperationMonday",
    "hoursOfOperationTuesday",
    "hoursOfOperationWednesday",
    "hoursOfOperationThursday",
    "hoursOfOperationFriday",
    "hoursOfOperationSaturday",
    "startHours",
    "endHours",
    "savePositionDuringHoursOnly"
})
@XmlRootElement(name = "CreateAdministrativeGroup")
public class CreateAdministrativeGroup {

    protected String securityToken;
    protected String clientID;
    protected String groupName;
    protected String supervisorName;
    protected String description;
    protected String timezone;
    protected String unitOfMeasure;
    protected String volumeMeasurement;
    protected String temperatureMeasurement;
    protected String country;
    protected String useDaylightSavingTime;
    protected String hoursOfOperationSunday;
    protected String hoursOfOperationMonday;
    protected String hoursOfOperationTuesday;
    protected String hoursOfOperationWednesday;
    protected String hoursOfOperationThursday;
    protected String hoursOfOperationFriday;
    protected String hoursOfOperationSaturday;
    protected String startHours;
    protected String endHours;
    protected String savePositionDuringHoursOnly;

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the supervisorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorName() {
        return supervisorName;
    }

    /**
     * Sets the value of the supervisorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorName(String value) {
        this.supervisorName = value;
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
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the volumeMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeMeasurement() {
        return volumeMeasurement;
    }

    /**
     * Sets the value of the volumeMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeMeasurement(String value) {
        this.volumeMeasurement = value;
    }

    /**
     * Gets the value of the temperatureMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureMeasurement() {
        return temperatureMeasurement;
    }

    /**
     * Sets the value of the temperatureMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureMeasurement(String value) {
        this.temperatureMeasurement = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the useDaylightSavingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDaylightSavingTime() {
        return useDaylightSavingTime;
    }

    /**
     * Sets the value of the useDaylightSavingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDaylightSavingTime(String value) {
        this.useDaylightSavingTime = value;
    }

    /**
     * Gets the value of the hoursOfOperationSunday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperationSunday() {
        return hoursOfOperationSunday;
    }

    /**
     * Sets the value of the hoursOfOperationSunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperationSunday(String value) {
        this.hoursOfOperationSunday = value;
    }

    /**
     * Gets the value of the hoursOfOperationMonday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperationMonday() {
        return hoursOfOperationMonday;
    }

    /**
     * Sets the value of the hoursOfOperationMonday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperationMonday(String value) {
        this.hoursOfOperationMonday = value;
    }

    /**
     * Gets the value of the hoursOfOperationTuesday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperationTuesday() {
        return hoursOfOperationTuesday;
    }

    /**
     * Sets the value of the hoursOfOperationTuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperationTuesday(String value) {
        this.hoursOfOperationTuesday = value;
    }

    /**
     * Gets the value of the hoursOfOperationWednesday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperationWednesday() {
        return hoursOfOperationWednesday;
    }

    /**
     * Sets the value of the hoursOfOperationWednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperationWednesday(String value) {
        this.hoursOfOperationWednesday = value;
    }

    /**
     * Gets the value of the hoursOfOperationThursday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperationThursday() {
        return hoursOfOperationThursday;
    }

    /**
     * Sets the value of the hoursOfOperationThursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperationThursday(String value) {
        this.hoursOfOperationThursday = value;
    }

    /**
     * Gets the value of the hoursOfOperationFriday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperationFriday() {
        return hoursOfOperationFriday;
    }

    /**
     * Sets the value of the hoursOfOperationFriday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperationFriday(String value) {
        this.hoursOfOperationFriday = value;
    }

    /**
     * Gets the value of the hoursOfOperationSaturday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperationSaturday() {
        return hoursOfOperationSaturday;
    }

    /**
     * Sets the value of the hoursOfOperationSaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperationSaturday(String value) {
        this.hoursOfOperationSaturday = value;
    }

    /**
     * Gets the value of the startHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartHours() {
        return startHours;
    }

    /**
     * Sets the value of the startHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartHours(String value) {
        this.startHours = value;
    }

    /**
     * Gets the value of the endHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndHours() {
        return endHours;
    }

    /**
     * Sets the value of the endHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndHours(String value) {
        this.endHours = value;
    }

    /**
     * Gets the value of the savePositionDuringHoursOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavePositionDuringHoursOnly() {
        return savePositionDuringHoursOnly;
    }

    /**
     * Sets the value of the savePositionDuringHoursOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavePositionDuringHoursOnly(String value) {
        this.savePositionDuringHoursOnly = value;
    }

}
