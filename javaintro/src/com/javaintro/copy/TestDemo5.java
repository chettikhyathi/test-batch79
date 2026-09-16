package com.javaintro.copy;

public class TestDemo5 {
	
	static TestDemo5 t = new TestDemo5();
	//In static methods,can we call static methods directly..? Yes
	static void method1() {
		method2();
		System.out.println("Method1 called !!");
	}
	//in instance method, can we call instance methods directly..? Yes
	void method3() {
		method4();
		System.out.println("Method3 called !!");
	}
	void method4() {
		System.out.println("Method4 called !!");
		method5();
	}
	static void method5() {
		System.out.println("Method5 called !!");
	}
	// in static method, can we call instance methods directly...? No
	// if we want to create we must need to create object..
	static void method2() {
		t.method3();
		System.out.println("Method2 called !!");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		TestDemo5.method1();
		System.out.println("Main Method Ended");
	}

}
