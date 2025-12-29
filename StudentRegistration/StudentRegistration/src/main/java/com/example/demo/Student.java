package com.example.demo;

public class Student {
	int sid;
	String name;
	String course;
	String email;
	
	public Student() {}
	
	public Student(String name, String course, String email) {
		this.name = name;
		this.course = course;
		this.email = email;
	}
	
	
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
