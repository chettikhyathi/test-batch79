package com.javaintro.copy;

public class TestDemo4 {
	void hello() {
		System.out.println("Hello guys,Good morning,Have a nice day !");
		System.out.println("Hello guys,Good morning,Have a nice day !");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		TestDemo4 t = new TestDemo4();
		//calling the methods.
		welcome();
		t.hello();
		
		System.out.println("Main Method Ended");
	}
	
	public static void welcome() {
		System.out.println("Welcome to Vcube !!");
		System.out.println("Welcome to Vcube !!");
		System.out.println("Welcome to Vcube !!");
	}

}
