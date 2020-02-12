
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDefinedBodyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserDefinedBodyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Dump"/>
 *     &lt;enumeration value="Refuse"/>
 *     &lt;enumeration value="Van"/>
 *     &lt;enumeration value="FlatbedRollback"/>
 *     &lt;enumeration value="Stake"/>
 *     &lt;enumeration value="Tanker"/>
 *     &lt;enumeration value="Utility"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserDefinedBodyType")
@XmlEnum
public enum UserDefinedBodyType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Dump")
    DUMP("Dump"),
    @XmlEnumValue("Refuse")
    REFUSE("Refuse"),
    @XmlEnumValue("Van")
    VAN("Van"),
    @XmlEnumValue("FlatbedRollback")
    FLATBED_ROLLBACK("FlatbedRollback"),
    @XmlEnumValue("Stake")
    STAKE("Stake"),
    @XmlEnumValue("Tanker")
    TANKER("Tanker"),
    @XmlEnumValue("Utility")
    UTILITY("Utility");
    private final String value;

    UserDefinedBodyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserDefinedBodyType fromValue(String v) {
        for (UserDefinedBodyType c: UserDefinedBodyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
