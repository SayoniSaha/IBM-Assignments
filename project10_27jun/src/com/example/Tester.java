package com.example;

//import com.example.model.Employee;
//import com.example.model.HourlyEmployee;
//import com.example.model.RegularEmployee;
import com.example.model.Manager;
import com.example.model.TaxCalculator;

public class Tester {

	public static void main(String[] args) {
		TaxCalculator taxCalculator=new TaxCalculator();
		taxCalculator.calculateTax(new Manager());

	}

}
