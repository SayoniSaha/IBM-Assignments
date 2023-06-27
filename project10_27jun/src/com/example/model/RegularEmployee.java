package com.example.model;

public class RegularEmployee extends Employee {
	
	@Override
	public String getEmpDetails() {
		return super.getEmpDetails()+" Salary: "+salary;
	}

	private double salary;

	public RegularEmployee() {
		super();
	}

	public double getEmpSalary() {
		return salary;
	}

	public void setEmpSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void setEmpSalary(int salary) {
		this.salary=salary;
	}
	
	

}
