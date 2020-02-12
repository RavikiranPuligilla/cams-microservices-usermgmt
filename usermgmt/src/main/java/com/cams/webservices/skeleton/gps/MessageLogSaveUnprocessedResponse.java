
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
 *         &lt;element name="MessageLogSaveUnprocessedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "messageLogSaveUnprocessedResult"
})
@XmlRootElement(name = "MessageLogSaveUnprocessedResponse")
public class MessageLogSaveUnprocessedResponse {

    @XmlElement(name = "MessageLogSaveUnprocessedResult")
    protected boolean messageLogSaveUnprocessedResult;

    /**
     * Gets the value of the messageLogSaveUnprocessedResult property.
     * 
     */
    public boolean isMessageLogSaveUnprocessedResult() {
        return messageLogSaveUnprocessedResult;
    }

    /**
     * Sets the value of the messageLogSaveUnprocessedResult property.
     * 
     */
    public void setMessageLogSaveUnprocessedResult(boolean value) {
        this.messageLogSaveUnprocessedResult = value;
    }

}
