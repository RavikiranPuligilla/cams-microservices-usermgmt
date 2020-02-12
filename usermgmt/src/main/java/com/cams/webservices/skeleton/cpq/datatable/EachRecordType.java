
package com.cams.webservices.skeleton.cpq.datatable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EachRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EachRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="AddressBookNumber" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="LeaseNumber" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="CustomerFirstName" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="CustomerLastName" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Branch" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="City" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="State" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="FleetNumber" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="FINFANCodes" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="FederalIdNumber" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="UBINumber" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="AccountExecutive" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="DCVMasterSigned" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="CEMasterSigned" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="CDOVGuranteeSigned" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="CCVGuranteeSigned" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="CDEGuranteeSigned" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Limitedpartnerdata" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Limitedpartnership" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="CDOVMasterSigned" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="InsuranceCompany" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Limits" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Deductible" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="InsuranceContact" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="InsurancePhone" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="InsuranceEmail" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="InsuranceAddress" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="InsuranceCity" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="InsuranceState" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="InsuranceZipCode" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="UnitNumber" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}String128" minOccurs="0"/>
 *         &lt;element name="Recordid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EachRecordType", propOrder = {

})
public class EachRecordType {

    protected Long id;
    @XmlElementRef(name = "CustomerId", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> customerId;
    @XmlElementRef(name = "AddressBookNumber", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> addressBookNumber;
    @XmlElementRef(name = "LeaseNumber", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> leaseNumber;
    @XmlElementRef(name = "Title", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "CustomerFirstName", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> customerFirstName;
    @XmlElementRef(name = "CustomerLastName", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> customerLastName;
    @XmlElementRef(name = "CompanyName", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "Branch", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> branch;
    @XmlElementRef(name = "Phone", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "Email", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "Contact", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> contact;
    @XmlElementRef(name = "AddressLine1", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "City", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "State", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "Country", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "PostalCode", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "FleetNumber", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> fleetNumber;
    @XmlElementRef(name = "FINFANCodes", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> finfanCodes;
    @XmlElementRef(name = "FederalIdNumber", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> federalIdNumber;
    @XmlElementRef(name = "UBINumber", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> ubiNumber;
    @XmlElementRef(name = "AccountExecutive", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> accountExecutive;
    @XmlElementRef(name = "DCVMasterSigned", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> dcvMasterSigned;
    @XmlElementRef(name = "CEMasterSigned", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> ceMasterSigned;
    @XmlElementRef(name = "CDOVGuranteeSigned", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> cdovGuranteeSigned;
    @XmlElementRef(name = "CCVGuranteeSigned", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> ccvGuranteeSigned;
    @XmlElementRef(name = "CDEGuranteeSigned", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> cdeGuranteeSigned;
    @XmlElementRef(name = "Limitedpartnerdata", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> limitedpartnerdata;
    @XmlElementRef(name = "Limitedpartnership", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> limitedpartnership;
    @XmlElementRef(name = "CDOVMasterSigned", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> cdovMasterSigned;
    @XmlElementRef(name = "InsuranceCompany", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> insuranceCompany;
    @XmlElementRef(name = "PolicyNo", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> policyNo;
    @XmlElementRef(name = "Carrier", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> carrier;
    @XmlElementRef(name = "ExpirationDate", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> expirationDate;
    @XmlElementRef(name = "Limits", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> limits;
    @XmlElementRef(name = "Deductible", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> deductible;
    @XmlElementRef(name = "InsuranceContact", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> insuranceContact;
    @XmlElementRef(name = "InsurancePhone", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> insurancePhone;
    @XmlElementRef(name = "InsuranceEmail", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> insuranceEmail;
    @XmlElementRef(name = "InsuranceAddress", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> insuranceAddress;
    @XmlElementRef(name = "InsuranceCity", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> insuranceCity;
    @XmlElementRef(name = "InsuranceState", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> insuranceState;
    @XmlElementRef(name = "InsuranceZipCode", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> insuranceZipCode;
    @XmlElementRef(name = "UnitNumber", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master", type = JAXBElement.class)
    protected JAXBElement<String> unitNumber;
    @XmlElement(name = "Recordid")
    protected Integer recordid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<String> value) {
        this.customerId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressBookNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressBookNumber() {
        return addressBookNumber;
    }

    /**
     * Sets the value of the addressBookNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressBookNumber(JAXBElement<String> value) {
        this.addressBookNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the leaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeaseNumber() {
        return leaseNumber;
    }

    /**
     * Sets the value of the leaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeaseNumber(JAXBElement<String> value) {
        this.leaseNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerFirstName(JAXBElement<String> value) {
        this.customerFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerLastName(JAXBElement<String> value) {
        this.customerLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranch(JAXBElement<String> value) {
        this.branch = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContact(JAXBElement<String> value) {
        this.contact = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fleetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFleetNumber() {
        return fleetNumber;
    }

    /**
     * Sets the value of the fleetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFleetNumber(JAXBElement<String> value) {
        this.fleetNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the finfanCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFINFANCodes() {
        return finfanCodes;
    }

    /**
     * Sets the value of the finfanCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFINFANCodes(JAXBElement<String> value) {
        this.finfanCodes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the federalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFederalIdNumber() {
        return federalIdNumber;
    }

    /**
     * Sets the value of the federalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFederalIdNumber(JAXBElement<String> value) {
        this.federalIdNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ubiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUBINumber() {
        return ubiNumber;
    }

    /**
     * Sets the value of the ubiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUBINumber(JAXBElement<String> value) {
        this.ubiNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the accountExecutive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountExecutive() {
        return accountExecutive;
    }

    /**
     * Sets the value of the accountExecutive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountExecutive(JAXBElement<String> value) {
        this.accountExecutive = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcvMasterSigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDCVMasterSigned() {
        return dcvMasterSigned;
    }

    /**
     * Sets the value of the dcvMasterSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDCVMasterSigned(JAXBElement<String> value) {
        this.dcvMasterSigned = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ceMasterSigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEMasterSigned() {
        return ceMasterSigned;
    }

    /**
     * Sets the value of the ceMasterSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCEMasterSigned(JAXBElement<String> value) {
        this.ceMasterSigned = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cdovGuranteeSigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCDOVGuranteeSigned() {
        return cdovGuranteeSigned;
    }

    /**
     * Sets the value of the cdovGuranteeSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCDOVGuranteeSigned(JAXBElement<String> value) {
        this.cdovGuranteeSigned = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccvGuranteeSigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCCVGuranteeSigned() {
        return ccvGuranteeSigned;
    }

    /**
     * Sets the value of the ccvGuranteeSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCCVGuranteeSigned(JAXBElement<String> value) {
        this.ccvGuranteeSigned = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cdeGuranteeSigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCDEGuranteeSigned() {
        return cdeGuranteeSigned;
    }

    /**
     * Sets the value of the cdeGuranteeSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCDEGuranteeSigned(JAXBElement<String> value) {
        this.cdeGuranteeSigned = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the limitedpartnerdata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitedpartnerdata() {
        return limitedpartnerdata;
    }

    /**
     * Sets the value of the limitedpartnerdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitedpartnerdata(JAXBElement<String> value) {
        this.limitedpartnerdata = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the limitedpartnership property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitedpartnership() {
        return limitedpartnership;
    }

    /**
     * Sets the value of the limitedpartnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitedpartnership(JAXBElement<String> value) {
        this.limitedpartnership = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cdovMasterSigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCDOVMasterSigned() {
        return cdovMasterSigned;
    }

    /**
     * Sets the value of the cdovMasterSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCDOVMasterSigned(JAXBElement<String> value) {
        this.cdovMasterSigned = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuranceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceCompany() {
        return insuranceCompany;
    }

    /**
     * Sets the value of the insuranceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceCompany(JAXBElement<String> value) {
        this.insuranceCompany = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the policyNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyNo() {
        return policyNo;
    }

    /**
     * Sets the value of the policyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyNo(JAXBElement<String> value) {
        this.policyNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrier(JAXBElement<String> value) {
        this.carrier = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<String> value) {
        this.expirationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimits(JAXBElement<String> value) {
        this.limits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deductible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeductible() {
        return deductible;
    }

    /**
     * Sets the value of the deductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeductible(JAXBElement<String> value) {
        this.deductible = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuranceContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceContact() {
        return insuranceContact;
    }

    /**
     * Sets the value of the insuranceContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceContact(JAXBElement<String> value) {
        this.insuranceContact = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insurancePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsurancePhone() {
        return insurancePhone;
    }

    /**
     * Sets the value of the insurancePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsurancePhone(JAXBElement<String> value) {
        this.insurancePhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuranceEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceEmail() {
        return insuranceEmail;
    }

    /**
     * Sets the value of the insuranceEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceEmail(JAXBElement<String> value) {
        this.insuranceEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuranceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceAddress() {
        return insuranceAddress;
    }

    /**
     * Sets the value of the insuranceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceAddress(JAXBElement<String> value) {
        this.insuranceAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuranceCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceCity() {
        return insuranceCity;
    }

    /**
     * Sets the value of the insuranceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceCity(JAXBElement<String> value) {
        this.insuranceCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuranceState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceState() {
        return insuranceState;
    }

    /**
     * Sets the value of the insuranceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceState(JAXBElement<String> value) {
        this.insuranceState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the insuranceZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceZipCode() {
        return insuranceZipCode;
    }

    /**
     * Sets the value of the insuranceZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceZipCode(JAXBElement<String> value) {
        this.insuranceZipCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitNumber(JAXBElement<String> value) {
        this.unitNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recordid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordid() {
        return recordid;
    }

    /**
     * Sets the value of the recordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordid(Integer value) {
        this.recordid = value;
    }

}
