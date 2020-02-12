
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadSurface.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadSurface">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Concrete"/>
 *     &lt;enumeration value="Asphalt"/>
 *     &lt;enumeration value="HardGravel"/>
 *     &lt;enumeration value="LooseGravel"/>
 *     &lt;enumeration value="Sand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadSurface")
@XmlEnum
public enum RoadSurface {

    @XmlEnumValue("Concrete")
    CONCRETE("Concrete"),
    @XmlEnumValue("Asphalt")
    ASPHALT("Asphalt"),
    @XmlEnumValue("HardGravel")
    HARD_GRAVEL("HardGravel"),
    @XmlEnumValue("LooseGravel")
    LOOSE_GRAVEL("LooseGravel"),
    @XmlEnumValue("Sand")
    SAND("Sand");
    private final String value;

    RoadSurface(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadSurface fromValue(String v) {
        for (RoadSurface c: RoadSurface.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
