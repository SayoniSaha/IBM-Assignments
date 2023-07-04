package project21_3jul;

import java.io.*;

public class EmployeeFactory {

	private BufferedReader br = null;
	private EmployeeService es = null;
	private Employee emp;
	{	br = new BufferedReader(new InputStreamReader(System.in));
		es = new EmployeeServiceImpl();
		emp = new Employee();
	}

	public void createEmployee() throws IOException, NumberFormatException, SalaryCheckException, NameCheckException {
		System.out.print("Enter Name: ");
		String name = br.readLine();
		if (name.length() <= 4) {
			throw new NameCheckException("Invalid input");
		}
		System.out.print("Enter Salary: ");
		double salary = Double.parseDouble(br.readLine());
		if (salary < 1000) {
			throw new SalaryCheckException("Invalid input");
		}

		emp.setName(name);
		emp.setSalary(salary);
		Employee e = es.createEmployee(emp);
		System.out.println("Employee Created: " + e);

	}

}
