package com.prowings.cloning;

public class TestCloning {
	
	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "Ram", "Pune");

//		Employee emp2 = new Employee(10, "Ram", "Pune");//new constructor
		Employee emp2 = null;

		try {
			emp2 = (Employee) emp1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Error while cloning the object");
			e.printStackTrace();
		}

		System.out.println("Before changing the objects");
		System.out.println("Employee 1 : " + emp1);
		System.out.println("Employee 2 : " + emp2);

		System.out.println("After changing the objects");

		emp1.setName("Sham");

		System.out.println("Employee 1 : " + emp1);
		System.out.println("Employee 2 : " + emp2);

	}


}
