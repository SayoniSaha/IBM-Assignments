package com.example.model;
public class Employee {
	
	private int id;
	private String name;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return id;
	}
	public void setEmpId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return name;
	}
	public void setEmpName(String name) {
		this.name = name;
	}
	public String getEmpDetails()
	{
		return "id"+id+"name"+name;
	}
	public void setEmpSalary(int salary) {}
}


