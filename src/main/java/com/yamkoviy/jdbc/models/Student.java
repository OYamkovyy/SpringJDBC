package com.yamkoviy.jdbc.models;

public class Student {
	
	public Student(String pib, int course) {
		this.pib = pib;
		this.course = course;
	}
	public Student() {}
	
	private int studentId;
	private String pib;
	private int course;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
}
