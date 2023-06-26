package project6_26jun;

public class Employee {
	String empName;
	String empId;
	String empSalary;
	Department department;
	
	void createEmployee(String id,String name,String salary,Department tempDepartment) {
		empId = id;
		empName = name;
		empSalary = salary;
		department = tempDepartment;
	}
		
	public String getDetails(){
		return "Id: "+empId+"Name: "+empName+"Salary: "+empSalary+"Department: "+department.getDetails();
	}
}
