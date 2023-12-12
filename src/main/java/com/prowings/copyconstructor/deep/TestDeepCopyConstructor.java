package com.prowings.copyconstructor.deep;

public class TestDeepCopyConstructor {
	
	public static void main(String[] args) {
		
		Address address = new Address(123, "Pune", "India");
		Student std1 = new Student(10, "Ram", address);
		
		Student std2 = new Student(std1);
	
		System.out.println("Before modification : ");
		
		System.out.println(std1);
		System.out.println(std2);
		
		System.out.println("After modification : ");

		std1.getAddress().setCity("Mumbai");
		
		System.out.println(std1);
		System.out.println(std2);
	}

}
