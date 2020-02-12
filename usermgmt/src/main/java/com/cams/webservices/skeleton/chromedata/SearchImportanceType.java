
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchImportanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchImportanceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MustHave"/>
 *     &lt;enumeration value="MustNotHave"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchImportanceType")
@XmlEnum
public enum SearchImportanceType {

    @XmlEnumValue("MustHave")
    MUST_HAVE("MustHave"),
    @XmlEnumValue("MustNotHave")
    MUST_NOT_HAVE("MustNotHave");
    private final String value;

    SearchImportanceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchImportanceType fromValue(String v) {
        for (SearchImportanceType c: SearchImportanceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
