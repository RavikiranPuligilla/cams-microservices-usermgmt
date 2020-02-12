
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturesMatrixType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeaturesMatrixType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Raw"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeaturesMatrixType")
@XmlEnum
public enum FeaturesMatrixType {

    @XmlEnumValue("Raw")
    RAW("Raw"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    FeaturesMatrixType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeaturesMatrixType fromValue(String v) {
        for (FeaturesMatrixType c: FeaturesMatrixType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
