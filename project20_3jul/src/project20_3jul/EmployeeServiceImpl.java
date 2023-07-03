package project20_3jul;

import java.util.*;
import java.io.*;

public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> emp;
    private EmployeeFactory factory;

    public EmployeeServiceImpl() {
        emp = new ArrayList<>();
        factory = new EmployeeFactory();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setId(new Random().nextInt(100));
        emp.add(employee);
        try {
            factory.createEmployee(employee);
        } catch (IOException e) {
            System.err.println(e);
        }
        return employee;
    }


}
