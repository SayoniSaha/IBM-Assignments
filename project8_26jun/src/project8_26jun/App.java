package project8_26jun;

import java.util.*;

public class App {
	public static void main(String[] args) {
	
		Employee emp=new Employee("Abc def",UUID.randomUUID().toString(),10000,new Department(UUID.randomUUID().toString(),"Sales",new Location(UUID.randomUUID().toString(), "Hyderabad", 5433123, "India")));
		System.out.println(emp.getDetails());
	
	}
}