package com.javaintro.copy;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Main Method Started");
		System.out.println(Class.forName("java.lang.String")); //Bootstrap class loader
		System.out.println(Class.forName("java.lang.System")); //Bootstrap class loader
		System.out.println(Class.forName("javaintro.Demo1")); //Application class loader
		//System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		System.out.println("Main Method Ended");
	}

}
