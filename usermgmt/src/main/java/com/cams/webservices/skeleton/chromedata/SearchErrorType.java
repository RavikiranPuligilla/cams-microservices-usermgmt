
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InvalidToken"/>
 *     &lt;enumeration value="InvalidType"/>
 *     &lt;enumeration value="InvalidValue"/>
 *     &lt;enumeration value="OutOfRange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchErrorType")
@XmlEnum
public enum SearchErrorType {

    @XmlEnumValue("InvalidToken")
    INVALID_TOKEN("InvalidToken"),
    @XmlEnumValue("InvalidType")
    INVALID_TYPE("InvalidType"),
    @XmlEnumValue("InvalidValue")
    INVALID_VALUE("InvalidValue"),
    @XmlEnumValue("OutOfRange")
    OUT_OF_RANGE("OutOfRange");
    private final String value;

    SearchErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchErrorType fromValue(String v) {
        for (SearchErrorType c: SearchErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
