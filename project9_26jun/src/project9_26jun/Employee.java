package project9_26jun;
public class Employee {

	private String empName;
	private String empId;
	private int empSalary;
	private Department department;

	public Employee() {
	}

	public Employee(String empName, String empId, int empSalary, Department dept) {

		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.department = dept;
	}

	public String getEmployeeName() {
		return empName;
	}

	public void setEmployeeName(String empName) {
		this.empName = empName;
	}

	public String getEmployeeId() {
		return empId;
	}

	public void setEmployeeId(String empId) {
		this.empId = empId;
	}

	public int getEmployeeSalary() {
		return empSalary;
	}

	public void setEmployeeSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "------------------\nEmployeeName:" +empName+ ", EmployeeId:" +empId+ ", EmployeeSalary:"
				+empSalary+ "\n-----------------\nDepartment:" +department+ "\n";
	}
}