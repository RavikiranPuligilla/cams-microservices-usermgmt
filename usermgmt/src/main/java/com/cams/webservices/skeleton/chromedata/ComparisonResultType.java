
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparisonResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Advantage"/>
 *     &lt;enumeration value="Disadvantage"/>
 *     &lt;enumeration value="Tie"/>
 *     &lt;enumeration value="CannotCalculate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComparisonResultType")
@XmlEnum
public enum ComparisonResultType {

    @XmlEnumValue("Advantage")
    ADVANTAGE("Advantage"),
    @XmlEnumValue("Disadvantage")
    DISADVANTAGE("Disadvantage"),
    @XmlEnumValue("Tie")
    TIE("Tie"),
    @XmlEnumValue("CannotCalculate")
    CANNOT_CALCULATE("CannotCalculate");
    private final String value;

    ComparisonResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonResultType fromValue(String v) {
        for (ComparisonResultType c: ComparisonResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
