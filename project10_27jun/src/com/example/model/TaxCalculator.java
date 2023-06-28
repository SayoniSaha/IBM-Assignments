package com.example.model;

public class TaxCalculator {
	public void calculateTax(Employee employee)
	{
		if(employee instanceof HourlyEmployee)
		{
			System.out.println("TAX IS NIL...");
		}
		if(employee instanceof RegularEmployee)
		{
			System.out.println("Tax is 10%");
		}
		if(employee instanceof Manager)
		{
			System.out.println("Tax is 9%");
		}
		if(employee instanceof Employee)
		{
			System.out.println("Please provide proper employee type");
		}
	}
}