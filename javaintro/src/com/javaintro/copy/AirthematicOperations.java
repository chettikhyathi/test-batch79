package com.javaintro.copy;

import java.util.Scanner;

public class AirthematicOperations {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public double divide(int a, int b) {
		if(b==0) {
			System.out.println("Cannot divide by Zero");
			return 0;
		}
		return (double)a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AirthematicOperations ao = new AirthematicOperations();
		System.out.println("Enter first number: ");
		int n1=sc.nextInt();
		System.out.println("Enter second number: ");
		int n2=sc.nextInt();
		
		System.out.println("Addition:"+ ao.add(n1, n2));
		System.out.println("Subtraction:"+ ao.subtract(n1, n2));
		System.out.println("Multipilcation:"+ ao.multiply(n1, n2) );
	    System.out.println("Division:"+ ao.divide(n1, n2));

	}

}
