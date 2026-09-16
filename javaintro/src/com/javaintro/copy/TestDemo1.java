package com.javaintro.copy;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main Method Started");
//Fully Qualified name of the classes = package name+class name
//The Below two classes are loading with the help of Bootstrap class loader
		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("java.lang.string"));
//The Below class is loading with the help of Application Class Loader.
		System.out.println(Class.forName("javaintro.TestDemo1"));
//com.mysql.cj.jdbc.Driver
		//System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		System.out.println("Main Method Ended");
	}

}
