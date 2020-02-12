
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerInformationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConsumerInformationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CrashTestRating"/>
 *     &lt;enumeration value="Rebate"/>
 *     &lt;enumeration value="Recall"/>
 *     &lt;enumeration value="Warranty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConsumerInformationType")
@XmlEnum
public enum ConsumerInformationType {

    @XmlEnumValue("CrashTestRating")
    CRASH_TEST_RATING("CrashTestRating"),
    @XmlEnumValue("Rebate")
    REBATE("Rebate"),
    @XmlEnumValue("Recall")
    RECALL("Recall"),
    @XmlEnumValue("Warranty")
    WARRANTY("Warranty");
    private final String value;

    ConsumerInformationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConsumerInformationType fromValue(String v) {
        for (ConsumerInformationType c: ConsumerInformationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
