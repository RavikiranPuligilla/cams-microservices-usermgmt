
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="n/a"/>
 *     &lt;enumeration value="pounds"/>
 *     &lt;enumeration value="inches"/>
 *     &lt;enumeration value="miles"/>
 *     &lt;enumeration value="feet"/>
 *     &lt;enumeration value="cubic feet"/>
 *     &lt;enumeration value="horsepower"/>
 *     &lt;enumeration value="miles per gallon"/>
 *     &lt;enumeration value="foot pounds"/>
 *     &lt;enumeration value="cubic inches"/>
 *     &lt;enumeration value="kilograms"/>
 *     &lt;enumeration value="millimeters"/>
 *     &lt;enumeration value="meters"/>
 *     &lt;enumeration value="kilometers"/>
 *     &lt;enumeration value="liters"/>
 *     &lt;enumeration value="liters per 100 km"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchUnitType")
@XmlEnum
public enum SearchUnitType {

    @XmlEnumValue("n/a")
    N_A("n/a"),
    @XmlEnumValue("pounds")
    POUNDS("pounds"),
    @XmlEnumValue("inches")
    INCHES("inches"),
    @XmlEnumValue("miles")
    MILES("miles"),
    @XmlEnumValue("feet")
    FEET("feet"),
    @XmlEnumValue("cubic feet")
    CUBIC_FEET("cubic feet"),
    @XmlEnumValue("horsepower")
    HORSEPOWER("horsepower"),
    @XmlEnumValue("miles per gallon")
    MILES_PER_GALLON("miles per gallon"),
    @XmlEnumValue("foot pounds")
    FOOT_POUNDS("foot pounds"),
    @XmlEnumValue("cubic inches")
    CUBIC_INCHES("cubic inches"),
    @XmlEnumValue("kilograms")
    KILOGRAMS("kilograms"),
    @XmlEnumValue("millimeters")
    MILLIMETERS("millimeters"),
    @XmlEnumValue("meters")
    METERS("meters"),
    @XmlEnumValue("kilometers")
    KILOMETERS("kilometers"),
    @XmlEnumValue("liters")
    LITERS("liters"),
    @XmlEnumValue("liters per 100 km")
    LITERS_PER_100_KM("liters per 100 km");
    private final String value;

    SearchUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchUnitType fromValue(String v) {
        for (SearchUnitType c: SearchUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
