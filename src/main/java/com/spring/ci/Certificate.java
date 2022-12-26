package com.spring.ci;

public class Certificate {

	private String name;

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}

	public Certificate(String name) {
		super();
		this.name = name;
	}

	public Certificate() {
		super();
	}

	public String getName() {
		return name;
	}
	
	
}
