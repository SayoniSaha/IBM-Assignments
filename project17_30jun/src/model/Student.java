package model;

public class Student {
	private String firstname;
	private String lastname;
	private double GPA;
	public Student() {
		super();
	}
	
	public Student(String firstname, String lastname, double gpa) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		GPA = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [First Name:" + firstname + ", Last Name: " + lastname + ", GPA: " + GPA + "]\n";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gpa) {
		GPA = gpa;
	}
}
