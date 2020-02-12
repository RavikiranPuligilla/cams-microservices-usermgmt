
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturesMatrixChartResponseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeaturesMatrixChartResponseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Successful"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="UnrecognizedChartId"/>
 *     &lt;enumeration value="UnrecognizedVehicleId"/>
 *     &lt;enumeration value="InformationNotCarriedByChrome"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeaturesMatrixChartResponseCode")
@XmlEnum
public enum FeaturesMatrixChartResponseCode {

    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("UnrecognizedChartId")
    UNRECOGNIZED_CHART_ID("UnrecognizedChartId"),
    @XmlEnumValue("UnrecognizedVehicleId")
    UNRECOGNIZED_VEHICLE_ID("UnrecognizedVehicleId"),
    @XmlEnumValue("InformationNotCarriedByChrome")
    INFORMATION_NOT_CARRIED_BY_CHROME("InformationNotCarriedByChrome");
    private final String value;

    FeaturesMatrixChartResponseCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeaturesMatrixChartResponseCode fromValue(String v) {
        for (FeaturesMatrixChartResponseCode c: FeaturesMatrixChartResponseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
