package com.javaintro.copy;

public class Calculation {
	static int  add(int a, int b) {
		int sum=a+b;
		System.out.println("Addition of 2 numbers is:" + sum);
		return sum;
	}
	static int sub(int a,int b) {
		int sub =a-b;
		System.out.println("Subtraction of 2 numbers is:" + sub);
		return sub;
	}
	double divide(double a, int b) {
		double div=a/b;
		System.out.println("Division of 2 numbers is:" + div);
		return div;
	}
	double multiply(double a, int b) {
		double mul=a*b;
		System.out.println("Multiplication of 2 numbers is:" + mul);
		return mul;
	}
	public static void main(String[] args) {
		Calculation c = new Calculation();
		int n1= add(10,20);
		int n2=sub(n1,20);
		double n3=c.divide(n2,5);
		double n4=c.multiply(n3, 2);
		System.out.println("The last result is: " + n4);
	}

}
