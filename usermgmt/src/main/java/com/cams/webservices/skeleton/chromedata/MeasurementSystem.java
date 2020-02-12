
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAE"/>
 *     &lt;enumeration value="Metric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementSystem")
@XmlEnum
public enum MeasurementSystem {

    SAE("SAE"),
    @XmlEnumValue("Metric")
    METRIC("Metric");
    private final String value;

    MeasurementSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementSystem fromValue(String v) {
        for (MeasurementSystem c: MeasurementSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
