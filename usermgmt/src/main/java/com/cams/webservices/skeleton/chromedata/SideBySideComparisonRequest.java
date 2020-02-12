
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
 *         &lt;element name="comparisonConfigurationStates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="includeCategoryComparisons" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filteredCategoryIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeTechSpecComparisons" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filteredTechSpecTitleIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnParameters" type="{urn:configcompare4g.kp.chrome.com}ReturnParameters"/>
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
    "comparisonConfigurationStates",
    "includeCategoryComparisons",
    "filteredCategoryIds",
    "includeTechSpecComparisons",
    "filteredTechSpecTitleIds",
    "returnParameters"
})
@XmlRootElement(name = "SideBySideComparisonRequest")
public class SideBySideComparisonRequest {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected List<String> comparisonConfigurationStates;
    protected boolean includeCategoryComparisons;
    @XmlElement(type = Integer.class)
    protected List<Integer> filteredCategoryIds;
    protected boolean includeTechSpecComparisons;
    @XmlElement(type = Integer.class)
    protected List<Integer> filteredTechSpecTitleIds;
    @XmlElement(required = true, nillable = true)
    protected ReturnParameters returnParameters;

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
     * Gets the value of the comparisonConfigurationStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonConfigurationStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonConfigurationStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComparisonConfigurationStates() {
        if (comparisonConfigurationStates == null) {
            comparisonConfigurationStates = new ArrayList<String>();
        }
        return this.comparisonConfigurationStates;
    }

    /**
     * Gets the value of the includeCategoryComparisons property.
     * 
     */
    public boolean isIncludeCategoryComparisons() {
        return includeCategoryComparisons;
    }

    /**
     * Sets the value of the includeCategoryComparisons property.
     * 
     */
    public void setIncludeCategoryComparisons(boolean value) {
        this.includeCategoryComparisons = value;
    }

    /**
     * Gets the value of the filteredCategoryIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filteredCategoryIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilteredCategoryIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFilteredCategoryIds() {
        if (filteredCategoryIds == null) {
            filteredCategoryIds = new ArrayList<Integer>();
        }
        return this.filteredCategoryIds;
    }

    /**
     * Gets the value of the includeTechSpecComparisons property.
     * 
     */
    public boolean isIncludeTechSpecComparisons() {
        return includeTechSpecComparisons;
    }

    /**
     * Sets the value of the includeTechSpecComparisons property.
     * 
     */
    public void setIncludeTechSpecComparisons(boolean value) {
        this.includeTechSpecComparisons = value;
    }

    /**
     * Gets the value of the filteredTechSpecTitleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filteredTechSpecTitleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilteredTechSpecTitleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFilteredTechSpecTitleIds() {
        if (filteredTechSpecTitleIds == null) {
            filteredTechSpecTitleIds = new ArrayList<Integer>();
        }
        return this.filteredTechSpecTitleIds;
    }

    /**
     * Gets the value of the returnParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnParameters }
     *     
     */
    public ReturnParameters getReturnParameters() {
        return returnParameters;
    }

    /**
     * Sets the value of the returnParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnParameters }
     *     
     */
    public void setReturnParameters(ReturnParameters value) {
        this.returnParameters = value;
    }

}
