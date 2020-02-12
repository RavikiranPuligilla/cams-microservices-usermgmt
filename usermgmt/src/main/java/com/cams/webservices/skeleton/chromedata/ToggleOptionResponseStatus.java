
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToggleOptionResponseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ToggleOptionResponseStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="UserConfirmationNeeded"/>
 *     &lt;enumeration value="UserChoiceNeeded"/>
 *     &lt;enumeration value="ConstrainedOptionToggleNotAllowed"/>
 *     &lt;enumeration value="InvalidOption"/>
 *     &lt;enumeration value="FatalError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ToggleOptionResponseStatus")
@XmlEnum
public enum ToggleOptionResponseStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("UserConfirmationNeeded")
    USER_CONFIRMATION_NEEDED("UserConfirmationNeeded"),
    @XmlEnumValue("UserChoiceNeeded")
    USER_CHOICE_NEEDED("UserChoiceNeeded"),
    @XmlEnumValue("ConstrainedOptionToggleNotAllowed")
    CONSTRAINED_OPTION_TOGGLE_NOT_ALLOWED("ConstrainedOptionToggleNotAllowed"),
    @XmlEnumValue("InvalidOption")
    INVALID_OPTION("InvalidOption"),
    @XmlEnumValue("FatalError")
    FATAL_ERROR("FatalError");
    private final String value;

    ToggleOptionResponseStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToggleOptionResponseStatus fromValue(String v) {
        for (ToggleOptionResponseStatus c: ToggleOptionResponseStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
