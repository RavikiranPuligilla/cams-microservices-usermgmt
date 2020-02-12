
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="Clean"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CategoryFlag")
@XmlEnum
public enum CategoryFlag {

    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Clean")
    CLEAN("Clean");
    private final String value;

    CategoryFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryFlag fromValue(String v) {
        for (CategoryFlag c: CategoryFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
