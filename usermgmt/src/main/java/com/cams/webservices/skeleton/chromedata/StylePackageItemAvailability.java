
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StylePackageItemAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StylePackageItemAvailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Included"/>
 *     &lt;enumeration value="Upgraded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StylePackageItemAvailability")
@XmlEnum
public enum StylePackageItemAvailability {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Included")
    INCLUDED("Included"),
    @XmlEnumValue("Upgraded")
    UPGRADED("Upgraded");
    private final String value;

    StylePackageItemAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StylePackageItemAvailability fromValue(String v) {
        for (StylePackageItemAvailability c: StylePackageItemAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
