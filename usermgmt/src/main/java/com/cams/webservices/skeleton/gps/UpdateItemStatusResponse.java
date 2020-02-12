
package com.cams.webservices.skeleton.gps;

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
 *       &lt;sequence>
 *         &lt;element name="UpdateItemStatusResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateItemStatusResult"
})
@XmlRootElement(name = "UpdateItemStatusResponse")
public class UpdateItemStatusResponse {

    @XmlElement(name = "UpdateItemStatusResult")
    protected boolean updateItemStatusResult;

    /**
     * Gets the value of the updateItemStatusResult property.
     * 
     */
    public boolean isUpdateItemStatusResult() {
        return updateItemStatusResult;
    }

    /**
     * Sets the value of the updateItemStatusResult property.
     * 
     */
    public void setUpdateItemStatusResult(boolean value) {
        this.updateItemStatusResult = value;
    }

}
