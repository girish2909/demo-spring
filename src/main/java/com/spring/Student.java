package com.spring;

import java.util.Map;
import java.util.Set;

public class Student {

	private int studentId;
	private String studentName;
	private Address studentAddress;
	private Set<String> subjects;
	private Map<String,String> cources;
	
	public void setStudentId(int studentId) {
		System.out.println("setting id");
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting name");
		this.studentName = studentName;
	}
	public void setStudentAddress(Address studentAddress) {
		System.out.println("setting address");
		this.studentAddress = studentAddress;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", subjects=" + subjects + ", cources=" + cources + "]";
	}
	
	
	
	
}
