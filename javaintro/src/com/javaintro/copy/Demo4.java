package com.javaintro.copy;

public class Demo4 {
	static Demo4 t = new Demo4();

	static void method1() {
		System.out.println("Method1 Called !");
		method2();
	}

	static void method2() {
		System.out.println("Method2 Called !");
		t.method3();
	}

	void method3() {

		System.out.println("Method3 Called !");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		method1();
		System.out.println("Main Method Ended");
	}
}