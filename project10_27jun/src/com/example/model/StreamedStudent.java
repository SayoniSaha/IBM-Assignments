package com.example.model;

public class StreamedStudent extends Student {
	private String stream;
	
	public StreamedStudent() {}

	@Override
	public void createStudent(int id, String name, String stream) {
		super.createStudent(id, name, null);
		this.stream=stream;
	}

	public String getSStream() {
		return stream;
	}

	public void setSStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String getStudentDetails() {
		
		return super.getStudentDetails()+" Stream: "+stream;
	}
}
