package com.spring.autowiring;

public class Job {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Job(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Job [name=" + name + "]";
	}

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
