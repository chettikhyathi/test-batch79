package com.javaintro.copy;

public class TestDemo3 {
	
	static String collegeName = "Vcube";
	public static void main(String[] args) {
		//local variable : inside a method
		//illegal modifier for parameter collegeName;
		//only final is permitted
		String collegeName = "VSS";
		System.out.println(collegeName);
		System.out.println(TestDemo3.collegeName);
		//static int a=10;
		//the local variable x may not have been initialized
		//JVM will not provide the default values for local variables.
		int x;
		//x=10;
		//System.out.println(x);//Compile time Error

	}

}
