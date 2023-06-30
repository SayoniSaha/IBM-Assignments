package com;

public class Employee {
	
	private int empId;
	private String firstname;
	private String lastname;
	private String email;
	
	public Employee() {
		super();
	}
	public int getId() {
		return empId;
	}
	public void setId(int empId) {
		this.empId = empId;
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
	
	@Override
	public String toString() {
		return "Employee ID: "+getId() + "\nName: "+ getFirstname() + " " + getLastname()+"\nEmail: " + getEmail();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=null;
		if(obj instanceof Employee)
		{
			employee=(Employee)obj;
		}
		
		if((this.getId()==employee.getId())&&(this.getFirstname().equals(employee.getFirstname()))&&(this.getLastname().equals(employee.getLastname()))&&(this.email.equals(employee.getEmail())))
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
