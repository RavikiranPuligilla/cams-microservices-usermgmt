
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelEquipmentSelectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModelEquipmentSelectionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unselected"/>
 *     &lt;enumeration value="Selected"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Excluded"/>
 *     &lt;enumeration value="ForcedOn"/>
 *     &lt;enumeration value="NotAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModelEquipmentSelectionState")
@XmlEnum
public enum ModelEquipmentSelectionState {

    @XmlEnumValue("Unselected")
    UNSELECTED("Unselected"),
    @XmlEnumValue("Selected")
    SELECTED("Selected"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Excluded")
    EXCLUDED("Excluded"),
    @XmlEnumValue("ForcedOn")
    FORCED_ON("ForcedOn"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    ModelEquipmentSelectionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModelEquipmentSelectionState fromValue(String v) {
        for (ModelEquipmentSelectionState c: ModelEquipmentSelectionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
