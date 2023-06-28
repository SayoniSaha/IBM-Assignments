package com.model;

public class SpecialEditionCD extends CD{
		
	private String feature;
	public SpecialEditionCD() {}

	@Override
	public void createSpecialCD(int id, String name, double price, String feature) {
		super.createSpecialCD(id, name, null, null);
		this.feature=feature;
	}

	public String getCDFeature() {
		return feature;
	}

	public void setCDPrice(String feature) {
		this.feature = feature;
	}

	@Override
	public String getCDDetails() {
		
		return super.getCDDetails()+"Feature: "+feature;
	}
}