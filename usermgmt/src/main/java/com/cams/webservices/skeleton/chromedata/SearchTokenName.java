
package com.cams.webservices.skeleton.chromedata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchTokenName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchTokenName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="crashTestRating"/>
 *     &lt;enumeration value="primaryExteriorColor"/>
 *     &lt;enumeration value="invoicePrice"/>
 *     &lt;enumeration value="msrp"/>
 *     &lt;enumeration value="marketClassId"/>
 *     &lt;enumeration value="modelId"/>
 *     &lt;enumeration value="year"/>
 *     &lt;enumeration value="numberOfDoors"/>
 *     &lt;enumeration value="fleetIncentiveAmount"/>
 *     &lt;enumeration value="bodyType"/>
 *     &lt;enumeration value="vehicleClassification"/>
 *     &lt;enumeration value="exteriorClassification"/>
 *     &lt;enumeration value="cargoClassification"/>
 *     &lt;enumeration value="interiorClassification"/>
 *     &lt;enumeration value="categoryId"/>
 *     &lt;enumeration value="divisionId"/>
 *     &lt;enumeration value="subDivisionId"/>
 *     &lt;enumeration value="ymmId"/>
 *     &lt;enumeration value="consumerFriendlyStyleName"/>
 *     &lt;enumeration value="consumerFriendlyBodyType"/>
 *     &lt;enumeration value="consumerFriendlyModelName"/>
 *     &lt;enumeration value="consumerFriendlyDrivetrain"/>
 *     &lt;enumeration value="styleId"/>
 *     &lt;enumeration value="make"/>
 *     &lt;enumeration value="model"/>
 *     &lt;enumeration value="style"/>
 *     &lt;enumeration value="trim"/>
 *     &lt;enumeration value="allocationGroup"/>
 *     &lt;enumeration value="naipcCountry"/>
 *     &lt;enumeration value="destinationCharge"/>
 *     &lt;enumeration value="manufacturersStyleCode"/>
 *     &lt;enumeration value="engineDisplacement"/>
 *     &lt;enumeration value="saeNetHP"/>
 *     &lt;enumeration value="saeNetTorque"/>
 *     &lt;enumeration value="fuelEconomyCity"/>
 *     &lt;enumeration value="fuelEconomyHwy"/>
 *     &lt;enumeration value="fuelEconomyCombined"/>
 *     &lt;enumeration value="baseCurbWeight"/>
 *     &lt;enumeration value="grossVehicleWeightRatingCap"/>
 *     &lt;enumeration value="maxPayload"/>
 *     &lt;enumeration value="groundClearanceFront"/>
 *     &lt;enumeration value="groundClearanceRear"/>
 *     &lt;enumeration value="groundClearanceMinimum"/>
 *     &lt;enumeration value="lengthOverall"/>
 *     &lt;enumeration value="heightOverall"/>
 *     &lt;enumeration value="wheelbase"/>
 *     &lt;enumeration value="passengerCapacity"/>
 *     &lt;enumeration value="passengerVolume"/>
 *     &lt;enumeration value="cargoVolumeTotal"/>
 *     &lt;enumeration value="cargoVolumeRearSeatUp"/>
 *     &lt;enumeration value="cargoVolumeRearSeatDown"/>
 *     &lt;enumeration value="trunkVolume"/>
 *     &lt;enumeration value="maxWidthWoMirrors"/>
 *     &lt;enumeration value="stepUpHeightFront"/>
 *     &lt;enumeration value="maxTrailerWeight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchTokenName")
@XmlEnum
public enum SearchTokenName {

    @XmlEnumValue("crashTestRating")
    CRASH_TEST_RATING("crashTestRating"),
    @XmlEnumValue("primaryExteriorColor")
    PRIMARY_EXTERIOR_COLOR("primaryExteriorColor"),
    @XmlEnumValue("invoicePrice")
    INVOICE_PRICE("invoicePrice"),
    @XmlEnumValue("msrp")
    MSRP("msrp"),
    @XmlEnumValue("marketClassId")
    MARKET_CLASS_ID("marketClassId"),
    @XmlEnumValue("modelId")
    MODEL_ID("modelId"),
    @XmlEnumValue("year")
    YEAR("year"),
    @XmlEnumValue("numberOfDoors")
    NUMBER_OF_DOORS("numberOfDoors"),
    @XmlEnumValue("fleetIncentiveAmount")
    FLEET_INCENTIVE_AMOUNT("fleetIncentiveAmount"),
    @XmlEnumValue("bodyType")
    BODY_TYPE("bodyType"),
    @XmlEnumValue("vehicleClassification")
    VEHICLE_CLASSIFICATION("vehicleClassification"),
    @XmlEnumValue("exteriorClassification")
    EXTERIOR_CLASSIFICATION("exteriorClassification"),
    @XmlEnumValue("cargoClassification")
    CARGO_CLASSIFICATION("cargoClassification"),
    @XmlEnumValue("interiorClassification")
    INTERIOR_CLASSIFICATION("interiorClassification"),
    @XmlEnumValue("categoryId")
    CATEGORY_ID("categoryId"),
    @XmlEnumValue("divisionId")
    DIVISION_ID("divisionId"),
    @XmlEnumValue("subDivisionId")
    SUB_DIVISION_ID("subDivisionId"),
    @XmlEnumValue("ymmId")
    YMM_ID("ymmId"),
    @XmlEnumValue("consumerFriendlyStyleName")
    CONSUMER_FRIENDLY_STYLE_NAME("consumerFriendlyStyleName"),
    @XmlEnumValue("consumerFriendlyBodyType")
    CONSUMER_FRIENDLY_BODY_TYPE("consumerFriendlyBodyType"),
    @XmlEnumValue("consumerFriendlyModelName")
    CONSUMER_FRIENDLY_MODEL_NAME("consumerFriendlyModelName"),
    @XmlEnumValue("consumerFriendlyDrivetrain")
    CONSUMER_FRIENDLY_DRIVETRAIN("consumerFriendlyDrivetrain"),
    @XmlEnumValue("styleId")
    STYLE_ID("styleId"),
    @XmlEnumValue("make")
    MAKE("make"),
    @XmlEnumValue("model")
    MODEL("model"),
    @XmlEnumValue("style")
    STYLE("style"),
    @XmlEnumValue("trim")
    TRIM("trim"),
    @XmlEnumValue("allocationGroup")
    ALLOCATION_GROUP("allocationGroup"),
    @XmlEnumValue("naipcCountry")
    NAIPC_COUNTRY("naipcCountry"),
    @XmlEnumValue("destinationCharge")
    DESTINATION_CHARGE("destinationCharge"),
    @XmlEnumValue("manufacturersStyleCode")
    MANUFACTURERS_STYLE_CODE("manufacturersStyleCode"),
    @XmlEnumValue("engineDisplacement")
    ENGINE_DISPLACEMENT("engineDisplacement"),
    @XmlEnumValue("saeNetHP")
    SAE_NET_HP("saeNetHP"),
    @XmlEnumValue("saeNetTorque")
    SAE_NET_TORQUE("saeNetTorque"),
    @XmlEnumValue("fuelEconomyCity")
    FUEL_ECONOMY_CITY("fuelEconomyCity"),
    @XmlEnumValue("fuelEconomyHwy")
    FUEL_ECONOMY_HWY("fuelEconomyHwy"),
    @XmlEnumValue("fuelEconomyCombined")
    FUEL_ECONOMY_COMBINED("fuelEconomyCombined"),
    @XmlEnumValue("baseCurbWeight")
    BASE_CURB_WEIGHT("baseCurbWeight"),
    @XmlEnumValue("grossVehicleWeightRatingCap")
    GROSS_VEHICLE_WEIGHT_RATING_CAP("grossVehicleWeightRatingCap"),
    @XmlEnumValue("maxPayload")
    MAX_PAYLOAD("maxPayload"),
    @XmlEnumValue("groundClearanceFront")
    GROUND_CLEARANCE_FRONT("groundClearanceFront"),
    @XmlEnumValue("groundClearanceRear")
    GROUND_CLEARANCE_REAR("groundClearanceRear"),
    @XmlEnumValue("groundClearanceMinimum")
    GROUND_CLEARANCE_MINIMUM("groundClearanceMinimum"),
    @XmlEnumValue("lengthOverall")
    LENGTH_OVERALL("lengthOverall"),
    @XmlEnumValue("heightOverall")
    HEIGHT_OVERALL("heightOverall"),
    @XmlEnumValue("wheelbase")
    WHEELBASE("wheelbase"),
    @XmlEnumValue("passengerCapacity")
    PASSENGER_CAPACITY("passengerCapacity"),
    @XmlEnumValue("passengerVolume")
    PASSENGER_VOLUME("passengerVolume"),
    @XmlEnumValue("cargoVolumeTotal")
    CARGO_VOLUME_TOTAL("cargoVolumeTotal"),
    @XmlEnumValue("cargoVolumeRearSeatUp")
    CARGO_VOLUME_REAR_SEAT_UP("cargoVolumeRearSeatUp"),
    @XmlEnumValue("cargoVolumeRearSeatDown")
    CARGO_VOLUME_REAR_SEAT_DOWN("cargoVolumeRearSeatDown"),
    @XmlEnumValue("trunkVolume")
    TRUNK_VOLUME("trunkVolume"),
    @XmlEnumValue("maxWidthWoMirrors")
    MAX_WIDTH_WO_MIRRORS("maxWidthWoMirrors"),
    @XmlEnumValue("stepUpHeightFront")
    STEP_UP_HEIGHT_FRONT("stepUpHeightFront"),
    @XmlEnumValue("maxTrailerWeight")
    MAX_TRAILER_WEIGHT("maxTrailerWeight");
    private final String value;

    SearchTokenName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchTokenName fromValue(String v) {
        for (SearchTokenName c: SearchTokenName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
