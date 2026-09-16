package com.javaintro.copy;

public class Demo3 {
	void Hello(){
		System.out.println("Hello Guys");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo3 s = new Demo3();
		//calling methods
		Welcome();
		s.Hello();
		System.out.println("Main Method Ended");
	}
	public static void Welcome() {
		System.out.println("Welcome to Vcube !!");
	}	
}


