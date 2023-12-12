package com.prowings.copyconstructor;

public class TestCopyConstructor {
	
	public static void main(String[] args) {
		
		
		Student std1 = new Student(10, "Ram", "Pune");
		
		Student std2 = new Student(std1);
	
		System.out.println("Before modification : ");
		
		System.out.println(std1);
		System.out.println(std2);
		
		System.out.println("After modification : ");

		std1.setAddress("Mumbai");
		
		System.out.println(std1);
		System.out.println(std2);
	}

}
