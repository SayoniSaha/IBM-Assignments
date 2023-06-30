package com;

import java.util.*;

public class Tester {
	public static void main(String args[])
	{
		EmployeeService s = new EmployeeServiceImpl();
			
		Employee e=new Employee();
		e.setId(1);
		e.setFirstname("ab");
		e.setLastname("cd");
		e.setEmail("ab@mail.com");
		s.createEmployee(e);
		Employee e2=new Employee();
		e2.setId(2);
		e2.setFirstname("ij");
		e2.setLastname("kl");
		e2.setEmail("ij@mail.com");
		s.createEmployee(e2);
		
		Set<Employee> set = s.getAllEmployees();
		Iterator<Employee> i =set.iterator();
		
		while(i.hasNext())	{
			System.out.println(i.next());
		}
		
		Employee emp = s.findEmployeeById(1);
		
		if(emp==null) {
			System.out.println("Empty");
			
		}
		else {
			System.out.println(emp);
		}
	}
}
