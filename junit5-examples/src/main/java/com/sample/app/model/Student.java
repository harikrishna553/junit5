package com.sample.app.model;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Student getStudent(String name) {
		Student student = new Student();
		student.name = name;

		return student;
	}

}
