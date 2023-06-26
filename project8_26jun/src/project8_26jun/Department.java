package project8_26jun;

public class Department {
	private String departmentId;
	private String departmentName;
	private Location location;
	public Department() {
	}

	public Department(String departmentId, String departmentName, Location location) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}

	public String getDetails() {
		return "department Name: "+departmentName+" DepartmentId: "+departmentId+" Location: "+location.getDetails();
	}
}