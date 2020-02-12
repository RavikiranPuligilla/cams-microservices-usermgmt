
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturesMatrixChartInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeaturesMatrixChartInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charts" type="{urn:configcompare4g.kp.chrome.com}FeaturesMatrixChart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseStatus" type="{urn:configcompare4g.kp.chrome.com}FeaturesMatrixChartResponseStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturesMatrixChartInformation", propOrder = {
    "charts",
    "responseStatus"
})
public class FeaturesMatrixChartInformation {

    protected List<FeaturesMatrixChart> charts;
    @XmlElement(required = true)
    protected FeaturesMatrixChartResponseStatus responseStatus;

    /**
     * Gets the value of the charts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturesMatrixChart }
     * 
     * 
     */
    public List<FeaturesMatrixChart> getCharts() {
        if (charts == null) {
            charts = new ArrayList<FeaturesMatrixChart>();
        }
        return this.charts;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesMatrixChartResponseStatus }
     *     
     */
    public FeaturesMatrixChartResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesMatrixChartResponseStatus }
     *     
     */
    public void setResponseStatus(FeaturesMatrixChartResponseStatus value) {
        this.responseStatus = value;
    }

}
