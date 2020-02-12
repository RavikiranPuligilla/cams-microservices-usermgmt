
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="accountInfo" type="{urn:configcompare4g.kp.chrome.com}AccountInfo"/>
 *         &lt;element name="chartId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="styleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customXmlDef" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "accountInfo",
    "chartId",
    "modelId",
    "styleIds",
    "customXmlDef"
})
@XmlRootElement(name = "FeaturesMatrixChartRequest")
public class FeaturesMatrixChartRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected String chartId;
    @XmlElement(nillable = true)
    protected List<Integer> modelId;
    @XmlElement(nillable = true)
    protected List<Integer> styleIds;
    @XmlElement(required = true, nillable = true)
    protected String customXmlDef;

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfo }
     *     
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfo }
     *     
     */
    public void setAccountInfo(AccountInfo value) {
        this.accountInfo = value;
    }

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
     * Gets the value of the modelId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getModelId() {
        if (modelId == null) {
            modelId = new ArrayList<Integer>();
        }
        return this.modelId;
    }

    /**
     * Gets the value of the styleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getStyleIds() {
        if (styleIds == null) {
            styleIds = new ArrayList<Integer>();
        }
        return this.styleIds;
    }

    /**
     * Gets the value of the customXmlDef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomXmlDef() {
        return customXmlDef;
    }

    /**
     * Sets the value of the customXmlDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomXmlDef(String value) {
        this.customXmlDef = value;
    }

}
