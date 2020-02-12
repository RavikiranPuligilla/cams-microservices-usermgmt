
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonFeatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparisonFeatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="TechnicalSpecification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComparisonFeatureType")
@XmlEnum
public enum ComparisonFeatureType {

    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("TechnicalSpecification")
    TECHNICAL_SPECIFICATION("TechnicalSpecification");
    private final String value;

    ComparisonFeatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonFeatureType fromValue(String v) {
        for (ComparisonFeatureType c: ComparisonFeatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
