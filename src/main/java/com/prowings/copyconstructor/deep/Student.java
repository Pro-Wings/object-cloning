package com.prowings.copyconstructor.deep;

public class Student {
	
	private int roll;
	private String name;
	private Address address;

	public Student() {
		super();
	}

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	//copy constructor!!
	public Student(Student std)
	{
		this.roll = std.getRoll();
		this.name = std.getName();
		//this.address = std.getAddress(); //this is - just reference copied
		
		//Create deep copy for mutable fields
		Address copyAddress = new Address();
		copyAddress.setPin(std.getAddress().getPin());
		copyAddress.setCity(std.getAddress().getCity());
		copyAddress.setCountry(std.getAddress().getCountry());
		
		this.address = copyAddress;
		
	}
	
	
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
