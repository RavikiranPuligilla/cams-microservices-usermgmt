package com.cams.model.chromadata;

import java.util.List;
import java.util.Map;

public class Style {
	
private int styleId;
private String styleName;
private double baseMsrp;
private double baseInvoice;
private String manufacturerModelCode;
private String marketClassName;
private String consumerFriendlyDrivetrain;
private String stockPhotoUrl;
private double destination;
private String trimName;
private String modelName;
private String bodyTypeName;
private Configuration configuration;
private List<Style> relatedStyles;
private String modelYear;
private String divisionName;
public Configuration getConfiguration() {
	return configuration;
}
public void setConfiguration(Configuration configuration) {
	this.configuration = configuration;
}
public double getDestination() {
	return destination;
}
public void setDestination(double destination) {
	this.destination = destination;
}
public int getStyleId() {
	return styleId;
}
public void setStyleId(int styleId) {
	this.styleId = styleId;
}
public String getStyleName() {
	return styleName;
}
public void setStyleName(String styleName) {
	this.styleName = styleName;
}
public double getBaseMsrp() {
	return baseMsrp;
}
public void setBaseMsrp(double baseMsrp) {
	this.baseMsrp = baseMsrp;
}
public double getBaseInvoice() {
	return baseInvoice;
}
public void setBaseInvoice(double baseInvoice) {
	this.baseInvoice = baseInvoice;
}
public String getManufacturerModelCode() {
	return manufacturerModelCode;
}
public void setManufacturerModelCode(String manufacturerModelCode) {
	this.manufacturerModelCode = manufacturerModelCode;
}
public String getMarketClassName() {
	return marketClassName;
}
public void setMarketClassName(String marketClassName) {
	this.marketClassName = marketClassName;
}
public String getConsumerFriendlyDrivetrain() {
	return consumerFriendlyDrivetrain;
}
public void setConsumerFriendlyDrivetrain(String consumerFriendlyDrivetrain) {
	this.consumerFriendlyDrivetrain = consumerFriendlyDrivetrain;
}
public String getStockPhotoUrl() {
	return stockPhotoUrl;
}
public void setStockPhotoUrl(String stockPhotoUrl) {
	this.stockPhotoUrl = stockPhotoUrl;
}
public String getTrimName() {
	return trimName;
}
public void setTrimName(String trimName) {
	this.trimName = trimName;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public String getBodyTypeName() {
	return bodyTypeName;
}
public void setBodyTypeName(String bodyTypeName) {
	this.bodyTypeName = bodyTypeName;
}
public List<Style> getRelatedStyles() {
	return relatedStyles;
}
public void setRelatedStyles(List<Style> relatedStyles) {
	this.relatedStyles = relatedStyles;
}
public String getModelYear() {
	return modelYear;
}
public void setModelYear(String modelYear) {
	this.modelYear = modelYear;
}
public String getDivisionName() {
	return divisionName;
}
public void setDivisionName(String divisionName) {
	this.divisionName = divisionName;
}



}
