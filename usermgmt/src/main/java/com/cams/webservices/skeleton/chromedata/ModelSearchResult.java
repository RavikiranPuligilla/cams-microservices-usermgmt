
package com.cams.webservices.skeleton.chromedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="model" type="{urn:configcompare4g.kp.chrome.com}Model"/>
 *         &lt;element name="styles" type="{urn:configcompare4g.kp.chrome.com}Style" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modelConfigurationState" type="{urn:configcompare4g.kp.chrome.com}ModelConfigurationState" minOccurs="0"/>
 *         &lt;element name="tokenRangeValues" type="{urn:configcompare4g.kp.chrome.com}TokenRangeValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelSearchResult", propOrder = {
    "model",
    "styles",
    "modelConfigurationState",
    "tokenRangeValues"
})
public class ModelSearchResult {

    @XmlElement(required = true)
    protected Model model;
    protected List<Style> styles;
    protected ModelConfigurationState modelConfigurationState;
    protected List<TokenRangeValue> tokenRangeValues;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link Model }
     *     
     */
    public Model getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model }
     *     
     */
    public void setModel(Model value) {
        this.model = value;
    }

    /**
     * Gets the value of the styles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Style }
     * 
     * 
     */
    public List<Style> getStyles() {
        if (styles == null) {
            styles = new ArrayList<Style>();
        }
        return this.styles;
    }

    /**
     * Gets the value of the modelConfigurationState property.
     * 
     * @return
     *     possible object is
     *     {@link ModelConfigurationState }
     *     
     */
    public ModelConfigurationState getModelConfigurationState() {
        return modelConfigurationState;
    }

    /**
     * Sets the value of the modelConfigurationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelConfigurationState }
     *     
     */
    public void setModelConfigurationState(ModelConfigurationState value) {
        this.modelConfigurationState = value;
    }

    /**
     * Gets the value of the tokenRangeValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokenRangeValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokenRangeValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TokenRangeValue }
     * 
     * 
     */
    public List<TokenRangeValue> getTokenRangeValues() {
        if (tokenRangeValues == null) {
            tokenRangeValues = new ArrayList<TokenRangeValue>();
        }
        return this.tokenRangeValues;
    }

}
