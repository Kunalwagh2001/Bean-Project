package com.myBeanProject;

import java.util.List;


public class Student {

	private String name;
	private String SchoolName;
	private List <String> list;
	
	public Student() {
		System.out.println("Default Constructor");
	}

	public Student(String name, String schoolName, List<String> list) {
		
		this.name = name;
		SchoolName = schoolName;
		this.list = list;
		System.out.println("Parameterized Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void show() {
		System.out.println("Player name :"+name+" and Sport name : "+SchoolName+" and Player list : "+list);
	
	}
	
	
	
	
}
