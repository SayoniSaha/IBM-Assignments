package com;

import java.util.*;
public interface EmployeeService {
	public void createEmployee(Employee employee);
		
		public Set<Employee> getAllEmployees();
		public Employee findEmployeeById(int id);
}
