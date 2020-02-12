package com.cams.model.chromadata;

import java.util.List;

import com.cams.webservices.skeleton.chromedata.Option;
import com.cams.webservices.skeleton.chromedata.TechnicalSpecification;

public class ConfigurationResponse {

	private List<Option> conflictOptions;
	private List<Option> options;
	private List<TechnicalSpecification> technicalSpecifications;
	private com.cams.webservices.skeleton.chromedata.Style style;
	private double configuredTotalMsrp;
	private double configuredTotalInvoice;
	private double configuredOptionsMsrp;
	private double configuredOptionsInvoice;

	
	public List<Option> getConflictOptions() {
		return conflictOptions;
	}
	public void setConflictOptions(List<Option> conflictOptions) {
		this.conflictOptions = conflictOptions;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public double getConfiguredTotalMsrp() {
		return configuredTotalMsrp;
	}
	public void setConfiguredTotalMsrp(double configuredTotalMsrp) {
		this.configuredTotalMsrp = configuredTotalMsrp;
	}
	public double getConfiguredTotalInvoice() {
		return configuredTotalInvoice;
	}
	public void setConfiguredTotalInvoice(double configuredTotalInvoice) {
		this.configuredTotalInvoice = configuredTotalInvoice;
	}
	public double getConfiguredOptionsMsrp() {
		return configuredOptionsMsrp;
	}
	public void setConfiguredOptionsMsrp(double configuredOptionsMsrp) {
		this.configuredOptionsMsrp = configuredOptionsMsrp;
	}
	public double getConfiguredOptionsInvoice() {
		return configuredOptionsInvoice;
	}
	public void setConfiguredOptionsInvoice(double configuredOptionsInvoice) {
		this.configuredOptionsInvoice = configuredOptionsInvoice;
	}
	public List<TechnicalSpecification> getTechnicalSpecifications() {
		return technicalSpecifications;
	}
	public void setTechnicalSpecifications(List<TechnicalSpecification> technicalSpecifications) {
		this.technicalSpecifications = technicalSpecifications;
	}
	public com.cams.webservices.skeleton.chromedata.Style getStyle() {
		return style;
	}
	public void setStyle(com.cams.webservices.skeleton.chromedata.Style style) {
		this.style = style;
	}
	
	
	
	
	
}
