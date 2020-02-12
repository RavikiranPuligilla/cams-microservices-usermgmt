
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionSelectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionSelectionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unselected"/>
 *     &lt;enumeration value="Selected"/>
 *     &lt;enumeration value="Included"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Excluded"/>
 *     &lt;enumeration value="Upgraded"/>
 *     &lt;enumeration value="ForcedOn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionSelectionState")
@XmlEnum
public enum OptionSelectionState {

    @XmlEnumValue("Unselected")
    UNSELECTED("Unselected"),
    @XmlEnumValue("Selected")
    SELECTED("Selected"),
    @XmlEnumValue("Included")
    INCLUDED("Included"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Excluded")
    EXCLUDED("Excluded"),
    @XmlEnumValue("Upgraded")
    UPGRADED("Upgraded"),
    @XmlEnumValue("ForcedOn")
    FORCED_ON("ForcedOn");
    private final String value;

    OptionSelectionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptionSelectionState fromValue(String v) {
        for (OptionSelectionState c: OptionSelectionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
