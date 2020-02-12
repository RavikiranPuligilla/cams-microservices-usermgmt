
package com.cams.webservices.skeleton.cpq.datatable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;all>
 *         &lt;element name="status" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}CommonStatusType"/>
 *         &lt;element name="DataTables" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}DataTablesType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "getResponse")
public class GetResponse {

    @XmlElement(required = true)
    protected CommonStatusType status;
    @XmlElement(name = "DataTables", required = true)
    protected DataTablesType dataTables;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CommonStatusType }
     *     
     */
    public CommonStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonStatusType }
     *     
     */
    public void setStatus(CommonStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the dataTables property.
     * 
     * @return
     *     possible object is
     *     {@link DataTablesType }
     *     
     */
    public DataTablesType getDataTables() {
        return dataTables;
    }

    /**
     * Sets the value of the dataTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTablesType }
     *     
     */
    public void setDataTables(DataTablesType value) {
        this.dataTables = value;
    }

}
