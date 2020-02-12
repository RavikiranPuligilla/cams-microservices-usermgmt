
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderAvailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fleet"/>
 *     &lt;enumeration value="Retail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderAvailability")
@XmlEnum
public enum OrderAvailability {

    @XmlEnumValue("Fleet")
    FLEET("Fleet"),
    @XmlEnumValue("Retail")
    RETAIL("Retail");
    private final String value;

    OrderAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderAvailability fromValue(String v) {
        for (OrderAvailability c: OrderAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
