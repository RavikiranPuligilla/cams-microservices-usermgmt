package com.cams.model.chromadata;

import java.util.List;

public class Configuration {

	List<KeyPair> standards;
	List<KeyPair> techSpecs;
	List<KeyPair> options;

	public List<KeyPair> getOptions() {
		return options;
	}

	public void setOptions(List<KeyPair> options) {
		this.options = options;
	}

	public List<KeyPair> getTechSpecs() {
		return techSpecs;
	}

	public void setTechSpecs(List<KeyPair> techSpecs) {
		this.techSpecs = techSpecs;
	}

	public List<KeyPair> getStandards() {
		return standards;
	}

	public void setStandards(List<KeyPair> standards) {
		this.standards = standards;
	}
	
}
