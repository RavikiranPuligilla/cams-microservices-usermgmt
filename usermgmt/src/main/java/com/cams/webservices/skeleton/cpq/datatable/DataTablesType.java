
package com.cams.webservices.skeleton.cpq.datatable;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataTablesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTablesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="each_record" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}EachRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="table_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTablesType", propOrder = {
    "eachRecord"
})
public class DataTablesType {

    @XmlElement(name = "each_record")
    protected List<EachRecordType> eachRecord;
    @XmlAttribute(name = "table_name", namespace = "http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master")
    protected String tableName;

    /**
     * Gets the value of the eachRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eachRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEachRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EachRecordType }
     * 
     * 
     */
    public List<EachRecordType> getEachRecord() {
        if (eachRecord == null) {
            eachRecord = new ArrayList<EachRecordType>();
        }
        return this.eachRecord;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

}
