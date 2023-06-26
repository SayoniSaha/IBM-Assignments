package project8_26jun;

public class Employee {
		private String employeeName;
		private String employeeId;
		private int employeeSalary;
		private Department department;
		
		public Employee(String employeeName, String employeeId, int employeeSalary, Department department) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.department = department;

	}

	public Employee()
	{
	}

	public void createEmployee(String id,String name,int salary,Department tempDepartment)
	{
		employeeId=id;
		employeeName=name;
		if(salary<1000)
		{	
		employeeSalary=1000;
		}
		else
		{
		employeeSalary=salary;
		}
		department=tempDepartment;

	}

	public String getDetails()
	{
		return "Name: "+employeeName+" ID: "+employeeId+" Salary: "+employeeSalary+"Department: "+department.getDetails();
	}

}