package com.model;

public class InternationalCD  extends CD{
	
	private String language;
	public InternationalCD() {}
	
	@Override
	public void createInternationalCD(int id, String name, double price, String language) {
		super.createInternationalCD(id, name, null, null);
		this.language=language;
	}
	
	public double getLanguage() {
		return price;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String getCDDetails() {
		
		return super.getCDDetails()+"Language: "+language;
	}
}