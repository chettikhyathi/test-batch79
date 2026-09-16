package com.javaintro.copy;
//static block vs instance block
public class TestDemo6 {
	//instance variable
	//static variable
	static TestDemo6 t = new TestDemo6();//object creation
	static TestDemo6 t1 = new TestDemo6();//object creation
	static {
		System.out.println("Static block loaded");
	}
	{
		System.out.println("Instance block loaded");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Main Method Ended");

	}

}
