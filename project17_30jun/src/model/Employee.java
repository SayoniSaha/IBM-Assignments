package model;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	public Employee() {
		super();
	}
	
	public Employee(int id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}


	public int getEmployeeId() {
		return id;
	}
	public void setEmployeeId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\nEmployee ID: "+getEmployeeId()+"\nName: "+getFirstName( )+ " "+ getLastName()+"\nEmail: "+getEmail();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=null;
		if(obj instanceof Employee)
		{
			employee=(Employee)obj;
		}
		
		if((this.getEmployeeId()==employee.getEmployeeId())&&(this.getFirstName().equals(employee.getFirstName()))&&(this.getLastName().equals(employee.getLastName()))&&(this.email.equals(employee.getEmail())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
