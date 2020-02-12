
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSetting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceSetting">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InitialPrice"/>
 *     &lt;enumeration value="LatestPrice"/>
 *     &lt;enumeration value="NoChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceSetting")
@XmlEnum
public enum PriceSetting {

    @XmlEnumValue("InitialPrice")
    INITIAL_PRICE("InitialPrice"),
    @XmlEnumValue("LatestPrice")
    LATEST_PRICE("LatestPrice"),
    @XmlEnumValue("NoChange")
    NO_CHANGE("NoChange");
    private final String value;

    PriceSetting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceSetting fromValue(String v) {
        for (PriceSetting c: PriceSetting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
