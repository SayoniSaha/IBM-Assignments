package tester;

import model.Employee;
import service.EmployeeServiceMap;
import service.EmployeeServiceMapImpl;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		EmployeeServiceMap es = new EmployeeServiceMapImpl();
		
		es.createEmployee(new Employee(new Random().nextInt(10), "ab", "cd", "ab@email.com"));
		es.createEmployee(new Employee(new Random().nextInt(10), "ef", "gh", "ef@email.com"));
		es.createEmployee(new Employee(new Random().nextInt(10), "ij", "kl", "ij@email.com"));
		
		Collection<Employee> employees=es.getAllEmployees();
		
		Iterator<Employee> iterator=employees.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
