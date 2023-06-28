package com.model;

public class CD {
	
	private int id;
	private String name;
	private double price;
	
	public CD() {
		super();
	}
	public int getCDId() {
		return id;
	}
	public void setCDId(int id) {
		this.id = id;
	}
	public String getCDName() {
		return name;
	}
	public void setCDName(String name) {
		this.name = name;
	}
	public double getCDPrice() {
		return price;
	}
	public void setCDPrice(double price) {
		this.price = price;
	}
	public String getCDDetails()
	{
		return "Id:"+id+"Name:"+name+"Price:"+price;
	}
	public void setEmpSalary(int salary) {}
}