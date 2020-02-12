
package com.cams.webservices.skeleton.cpq.datatable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="records_read" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="records_failed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="records_deleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="records_returned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="records_inserted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="records_updated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonStatusType", propOrder = {

})
public class CommonStatusType {

    @XmlElementRef(name = "success", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> success;
    @XmlElementRef(name = "message", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "records_read", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<Integer> recordsRead;
    @XmlElementRef(name = "records_failed", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<Integer> recordsFailed;
    @XmlElementRef(name = "records_deleted", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<Integer> recordsDeleted;
    @XmlElementRef(name = "records_returned", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<Integer> recordsReturned;
    @XmlElementRef(name = "records_inserted", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<Integer> recordsInserted;
    @XmlElementRef(name = "records_updated", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<Integer> recordsUpdated;
    @XmlElementRef(name = "detail", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> detail;
    @XmlElementRef(name = "warning", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> warning;

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuccess(JAXBElement<String> value) {
        this.success = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recordsRead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecordsRead() {
        return recordsRead;
    }

    /**
     * Sets the value of the recordsRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecordsRead(JAXBElement<Integer> value) {
        this.recordsRead = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the recordsFailed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecordsFailed() {
        return recordsFailed;
    }

    /**
     * Sets the value of the recordsFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecordsFailed(JAXBElement<Integer> value) {
        this.recordsFailed = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the recordsDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecordsDeleted() {
        return recordsDeleted;
    }

    /**
     * Sets the value of the recordsDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecordsDeleted(JAXBElement<Integer> value) {
        this.recordsDeleted = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the recordsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecordsReturned() {
        return recordsReturned;
    }

    /**
     * Sets the value of the recordsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecordsReturned(JAXBElement<Integer> value) {
        this.recordsReturned = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the recordsInserted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecordsInserted() {
        return recordsInserted;
    }

    /**
     * Sets the value of the recordsInserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecordsInserted(JAXBElement<Integer> value) {
        this.recordsInserted = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the recordsUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecordsUpdated() {
        return recordsUpdated;
    }

    /**
     * Sets the value of the recordsUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecordsUpdated(JAXBElement<Integer> value) {
        this.recordsUpdated = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetail(JAXBElement<String> value) {
        this.detail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarning(JAXBElement<String> value) {
        this.warning = ((JAXBElement<String> ) value);
    }

}
