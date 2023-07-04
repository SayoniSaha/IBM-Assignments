package project21_3jul;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> emp;
	{ emp = new ArrayList<>();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		employee.setId(new Random().nextInt(100));
		emp.add(employee);
		return employee;
	}
}
