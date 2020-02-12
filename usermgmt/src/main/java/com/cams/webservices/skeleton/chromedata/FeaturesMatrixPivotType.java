
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturesMatrixPivotType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeaturesMatrixPivotType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ModelYear"/>
 *     &lt;enumeration value="SubdivisionID"/>
 *     &lt;enumeration value="ModelID"/>
 *     &lt;enumeration value="StyleID"/>
 *     &lt;enumeration value="ManufacturerModelCode"/>
 *     &lt;enumeration value="Trim"/>
 *     &lt;enumeration value="Drivetrain"/>
 *     &lt;enumeration value="TechSpecTitleID"/>
 *     &lt;enumeration value="OptionCode"/>
 *     &lt;enumeration value="OptionKind"/>
 *     &lt;enumeration value="BodyType"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeaturesMatrixPivotType")
@XmlEnum
public enum FeaturesMatrixPivotType {

    @XmlEnumValue("ModelYear")
    MODEL_YEAR("ModelYear"),
    @XmlEnumValue("SubdivisionID")
    SUBDIVISION_ID("SubdivisionID"),
    @XmlEnumValue("ModelID")
    MODEL_ID("ModelID"),
    @XmlEnumValue("StyleID")
    STYLE_ID("StyleID"),
    @XmlEnumValue("ManufacturerModelCode")
    MANUFACTURER_MODEL_CODE("ManufacturerModelCode"),
    @XmlEnumValue("Trim")
    TRIM("Trim"),
    @XmlEnumValue("Drivetrain")
    DRIVETRAIN("Drivetrain"),
    @XmlEnumValue("TechSpecTitleID")
    TECH_SPEC_TITLE_ID("TechSpecTitleID"),
    @XmlEnumValue("OptionCode")
    OPTION_CODE("OptionCode"),
    @XmlEnumValue("OptionKind")
    OPTION_KIND("OptionKind"),
    @XmlEnumValue("BodyType")
    BODY_TYPE("BodyType"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    FeaturesMatrixPivotType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeaturesMatrixPivotType fromValue(String v) {
        for (FeaturesMatrixPivotType c: FeaturesMatrixPivotType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
