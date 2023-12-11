package com.prowings.cloning.deep;

public class TestCloning {
	
	public static void main(String[] args) {

		Address address = new Address(1234, "Pune", "India");
		
		NewEmployee emp1 = new NewEmployee(10, "Ram", address);

//		NewEmployee emp2 = new NewEmployee(10, "Ram", "Pune");//new constructor
		NewEmployee emp2 = null;

		try {
			emp2 = (NewEmployee) emp1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Error while cloning the object");
			e.printStackTrace();
		}

		System.out.println("Before changing the objects");
		System.out.println("NewEmployee 1 : " + emp1);
		System.out.println("NewEmployee 2 : " + emp2);

		System.out.println("After changing the objects");

		emp1.setName("Sham");
		emp1.getAddress().setCity("Mumbai");

		System.out.println("NewEmployee 1 : " + emp1);
		System.out.println("NewEmployee 2 : " + emp2);

	}


}
