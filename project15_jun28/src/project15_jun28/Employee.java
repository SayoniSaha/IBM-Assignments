
package project15_jun28;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private double salary;	
	
	public Employee() {
		super();
	}


	public Employee(int id, String firstname, String lastname, String email, double salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.salary = salary;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public final String getDetails()
	{
		return "\nId: " + id + "\nName:" + firstname + " "+ lastname + "\nEmail: " + email + "\nSalary: "+salary;
	}

}