package com.example;

import com.example.model.Employee;
import com.example.model.RegularEmployee;

public class Tester {

	public static void main(String[] args) {
		Employee employee = new RegularEmployee();
		employee.setEmpId(101);
		employee.setEmpName("Abc");
		employee.setEmpSalary(10000);
		System.out.println(employee.getEmpDetails());
	}
}
