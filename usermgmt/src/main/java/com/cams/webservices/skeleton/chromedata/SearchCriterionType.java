
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriterionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchCriterionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="NumberRange"/>
 *     &lt;enumeration value="MoneyRange"/>
 *     &lt;enumeration value="TechnicalSpecificationRange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchCriterionType")
@XmlEnum
public enum SearchCriterionType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("NumberRange")
    NUMBER_RANGE("NumberRange"),
    @XmlEnumValue("MoneyRange")
    MONEY_RANGE("MoneyRange"),
    @XmlEnumValue("TechnicalSpecificationRange")
    TECHNICAL_SPECIFICATION_RANGE("TechnicalSpecificationRange");
    private final String value;

    SearchCriterionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchCriterionType fromValue(String v) {
        for (SearchCriterionType c: SearchCriterionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
