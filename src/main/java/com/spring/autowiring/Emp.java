package com.spring.autowiring;

public class Emp {

	private Address address;

	public Emp(Address address) {
		super();
		System.out.println("############inside constructor############");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("############inside address setter############");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
}
