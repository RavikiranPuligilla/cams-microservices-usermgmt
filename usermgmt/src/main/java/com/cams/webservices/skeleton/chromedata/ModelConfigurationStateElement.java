
package com.cams.webservices.skeleton.chromedata;

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
 *         &lt;element name="configurationState" type="{urn:configcompare4g.kp.chrome.com}ModelConfigurationState"/>
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
    "configurationState"
})
@XmlRootElement(name = "ModelConfigurationStateElement")
public class ModelConfigurationStateElement {

    @XmlElement(required = true)
    protected ModelConfigurationState configurationState;

    /**
     * Gets the value of the configurationState property.
     * 
     * @return
     *     possible object is
     *     {@link ModelConfigurationState }
     *     
     */
    public ModelConfigurationState getConfigurationState() {
        return configurationState;
    }

    /**
     * Sets the value of the configurationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelConfigurationState }
     *     
     */
    public void setConfigurationState(ModelConfigurationState value) {
        this.configurationState = value;
    }

}
