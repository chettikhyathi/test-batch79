package com.javaintro.copy;

public class Methods {
	
	static void method1() {
		System.out.println("Static method1 is called");
	}
	static void method2() {
		System.out.println("Static method2 is called");
	}
	
	void instancemethod1() {
		System.out.println("Instance method1 is called");
	}
	void instancemethod2() {
		System.out.println("Instance method2 is called");
	}
	
	static {
		System.out.println("Static Block Called!");
		method1();
		method2();
		new Methods();
		System.out.println("Static Block Ended!");
	}
	
	{
		System.out.println("Instance Block Called!");
		instancemethod1();
		instancemethod2();
		System.out.println("Instance Block Ended!");
	}

	public static void main(String[] args) {
		
		System.out.println("All the 4 methods are called !!!");

	}

}
