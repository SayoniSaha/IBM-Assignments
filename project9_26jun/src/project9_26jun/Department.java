package project9_26jun;

public class Department {

	private String deptId;
	private String deptName;
	private Location location;
		
	public Department() {
	}

	public String getDepartmentId() {
		return deptId;
	}

	public void setDepartmentId(String deptId) {
		this.deptId = deptId;
	}

	public String getDepartmentName() {
		return deptName;
	}

	public void setDepartmentName(String deptName) {
		this.deptName = deptName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "DepartmentId:" +deptId+ ", DepartmentName:" +deptName+ "\n---------------\nLocation:"
				+location+ "\n";
	}
}