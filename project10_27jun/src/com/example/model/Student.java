package com.example.model;

public class Student extends Object {
	
	private int id;
	private String name;
	
	public Student() {}

	public void createStudent(int id,String name,String stream)
	{
		this.id=id;
		this.name=name;
	}
	public String getStudentDetails()
	{
		return "Id: "+id+" Name: "+name;
	}

	@Override
	public String toString() {
		return "Student [Id:" + id + ", Name:" + name + "]";
	}

}
