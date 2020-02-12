
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
 *         &lt;element name="DataTables" type="{http://xmlns.oracle.com/cpqcloud/dataTables/TbCustomer_Master}DataTablesRetrieveType"/>
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
@XmlRootElement(name = "get")
public class Get {

    @XmlElement(name = "DataTables", required = true)
    protected DataTablesRetrieveType dataTables;

    /**
     * Gets the value of the dataTables property.
     * 
     * @return
     *     possible object is
     *     {@link DataTablesRetrieveType }
     *     
     */
    public DataTablesRetrieveType getDataTables() {
        return dataTables;
    }

    /**
     * Sets the value of the dataTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTablesRetrieveType }
     *     
     */
    public void setDataTables(DataTablesRetrieveType value) {
        this.dataTables = value;
    }

}
