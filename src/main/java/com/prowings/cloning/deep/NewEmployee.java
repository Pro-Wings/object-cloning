package com.prowings.cloning.deep;

import com.prowings.cloning.Employee;

public class NewEmployee implements Cloneable {

	private int id;
	private String name;
//	private String address;
	private Address address;

	public NewEmployee() {
		super();
	}

	public NewEmployee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "NewEmployee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		NewEmployee clonedEmployee = (NewEmployee) super.clone();
		
		Address clonedAddress = (Address) this.address.clone();
		
		clonedEmployee.setAddress(clonedAddress);
		
		return clonedEmployee;
	}


}
