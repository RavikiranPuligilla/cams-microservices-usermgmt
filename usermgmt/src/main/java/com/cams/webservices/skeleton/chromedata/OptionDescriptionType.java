
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionDescriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionDescriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PrimaryName"/>
 *     &lt;enumeration value="Extended"/>
 *     &lt;enumeration value="EnforcedLogic"/>
 *     &lt;enumeration value="UnenforcedLogic"/>
 *     &lt;enumeration value="PriceNote"/>
 *     &lt;enumeration value="ConsumerFriendly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionDescriptionType")
@XmlEnum
public enum OptionDescriptionType {

    @XmlEnumValue("PrimaryName")
    PRIMARY_NAME("PrimaryName"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended"),
    @XmlEnumValue("EnforcedLogic")
    ENFORCED_LOGIC("EnforcedLogic"),
    @XmlEnumValue("UnenforcedLogic")
    UNENFORCED_LOGIC("UnenforcedLogic"),
    @XmlEnumValue("PriceNote")
    PRICE_NOTE("PriceNote"),
    @XmlEnumValue("ConsumerFriendly")
    CONSUMER_FRIENDLY("ConsumerFriendly");
    private final String value;

    OptionDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptionDescriptionType fromValue(String v) {
        for (OptionDescriptionType c: OptionDescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
