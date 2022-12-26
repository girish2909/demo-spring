package com.spring.ci;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Person implements InitializingBean,DisposableBean{

	private String name;
	private int personId;
	private Certificate cert;
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + cert.getName() + "]";
	}
	public Person(String name, int personId, Certificate certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.cert = certi;
	}
	public Person() {
		super();
	}
	
	public void initCustom() {
		System.out.println("I am inside initCustom");
	}
	
	@PostConstruct
	public void postConstructMethod() {
		System.out.println("I am inside postConstructMethod...");
	}
	
	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("I am inside preDestroyMethod...");
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside afterPropertiesSet()  method...");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
		
	}
	
	public void destroyCustom() throws Exception {
		System.out.println("Inside destroyCustom method");
		
	}
	
}
