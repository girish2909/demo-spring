package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestJobBean {
	
	private String name;
	
	@Autowired
	@Qualifier(value="job2")
	private Job job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "TestJobBean [name=" + name + ", job=" + job + "]";
	}
	public TestJobBean(String name, Job job) {
		super();
		this.name = name;
		this.job = job;
	}
	public TestJobBean() {
		super();
	}
	
}
