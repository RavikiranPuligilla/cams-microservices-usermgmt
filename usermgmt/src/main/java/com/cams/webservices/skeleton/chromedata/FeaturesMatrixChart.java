
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturesMatrixChart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeaturesMatrixChart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chartId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="header" type="{urn:configcompare4g.kp.chrome.com}FeaturesMatrixChartHeader" minOccurs="0"/>
 *         &lt;element name="row" type="{urn:configcompare4g.kp.chrome.com}FeaturesMatrixChartRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="footer" type="{urn:configcompare4g.kp.chrome.com}FeaturesMatrixChartFooter" minOccurs="0"/>
 *         &lt;element name="footnotes" type="{urn:configcompare4g.kp.chrome.com}FootnoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rowAxisHeader" type="{urn:configcompare4g.kp.chrome.com}FeaturesMatrixAxisHeader" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="columnAxisHeader" type="{urn:configcompare4g.kp.chrome.com}FeaturesMatrixAxisHeader" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturesMatrixChart", propOrder = {
    "chartId",
    "displayName",
    "header",
    "row",
    "footer",
    "footnotes",
    "rowAxisHeader",
    "columnAxisHeader"
})
public class FeaturesMatrixChart {

    @XmlElement(required = true)
    protected String chartId;
    @XmlElement(required = true)
    protected String displayName;
    protected FeaturesMatrixChartHeader header;
    protected List<FeaturesMatrixChartRow> row;
    protected FeaturesMatrixChartFooter footer;
    protected List<FootnoteType> footnotes;
    protected List<FeaturesMatrixAxisHeader> rowAxisHeader;
    protected List<FeaturesMatrixAxisHeader> columnAxisHeader;

    /**
     * Gets the value of the chartId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartId() {
        return chartId;
    }

    /**
     * Sets the value of the chartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartId(String value) {
        this.chartId = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesMatrixChartHeader }
     *     
     */
    public FeaturesMatrixChartHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesMatrixChartHeader }
     *     
     */
    public void setHeader(FeaturesMatrixChartHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturesMatrixChartRow }
     * 
     * 
     */
    public List<FeaturesMatrixChartRow> getRow() {
        if (row == null) {
            row = new ArrayList<FeaturesMatrixChartRow>();
        }
        return this.row;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesMatrixChartFooter }
     *     
     */
    public FeaturesMatrixChartFooter getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesMatrixChartFooter }
     *     
     */
    public void setFooter(FeaturesMatrixChartFooter value) {
        this.footer = value;
    }

    /**
     * Gets the value of the footnotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the footnotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFootnotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FootnoteType }
     * 
     * 
     */
    public List<FootnoteType> getFootnotes() {
        if (footnotes == null) {
            footnotes = new ArrayList<FootnoteType>();
        }
        return this.footnotes;
    }

    /**
     * Gets the value of the rowAxisHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rowAxisHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRowAxisHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturesMatrixAxisHeader }
     * 
     * 
     */
    public List<FeaturesMatrixAxisHeader> getRowAxisHeader() {
        if (rowAxisHeader == null) {
            rowAxisHeader = new ArrayList<FeaturesMatrixAxisHeader>();
        }
        return this.rowAxisHeader;
    }

    /**
     * Gets the value of the columnAxisHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnAxisHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnAxisHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturesMatrixAxisHeader }
     * 
     * 
     */
    public List<FeaturesMatrixAxisHeader> getColumnAxisHeader() {
        if (columnAxisHeader == null) {
            columnAxisHeader = new ArrayList<FeaturesMatrixAxisHeader>();
        }
        return this.columnAxisHeader;
    }

}
