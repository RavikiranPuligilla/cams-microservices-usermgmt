
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Car"/>
 *     &lt;enumeration value="LightDutyTruck"/>
 *     &lt;enumeration value="Jeep"/>
 *     &lt;enumeration value="MediumDutyTruck"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleType")
@XmlEnum
public enum VehicleType {

    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("LightDutyTruck")
    LIGHT_DUTY_TRUCK("LightDutyTruck"),
    @XmlEnumValue("Jeep")
    JEEP("Jeep"),
    @XmlEnumValue("MediumDutyTruck")
    MEDIUM_DUTY_TRUCK("MediumDutyTruck");
    private final String value;

    VehicleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleType fromValue(String v) {
        for (VehicleType c: VehicleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
