package service;

import model.Employee;
import java.util.*;

public class EmployeeServiceMapImpl implements EmployeeServiceMap {
	
	private Map<String, Employee> empmap;
	
	{ empmap = new LinkedHashMap<String,Employee>();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		String[] s = UUID.randomUUID().toString().split(" ");
		empmap.put(s[0], employee);
		
		return employee;
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		System.out.println(empmap);
		return empmap.values();
	}

}
