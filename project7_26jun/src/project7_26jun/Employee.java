package project7_26jun;

public class Employee {


private String empName;

private String empId;

private int empSalary;

private Department department;


public void createEmployee(String id,String name,int salary,Department tempDepartment)

{

	empId=id;
	
	empName=name;
	
	if(salary<1000)
	{
		empSalary=1000;
	}
	else
	{
		empSalary=salary;
	}
	department=tempDepartment;
}

public String getDetails()

{

	return "Name: "+empName+" ID: "+empId+" Salary: "+empSalary+"Department: "+department.getDetails();

}

}