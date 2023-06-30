package com;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {

	private Set<Employee> emp; 
	{emp = new HashSet<>();
	}

	@Override
	public void createEmployee(Employee employee) {
		emp.add(employee);
	}

	@Override
	public Set<Employee> getAllEmployees() {
		return emp;
	}

	@Override
	public Employee findEmployeeById(int id) {
		Employee employee = null;
		for (Employee e : emp) {
			if (e.getId() == id) {
				employee = e;
				break;
			}
		}
		return employee;
	}

}
