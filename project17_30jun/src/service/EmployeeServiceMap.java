package service;

import model.Employee;
import java.util.*;

public interface EmployeeServiceMap {
	
	public Employee createEmployee(Employee employee);
	
	public Collection<Employee> getAllEmployees();

}