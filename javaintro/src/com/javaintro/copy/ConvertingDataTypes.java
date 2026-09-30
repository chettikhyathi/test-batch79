package com.javaintro.copy;

public class ConvertingDataTypes {
	int a=100;
	double d=a;
	double weight=54.2;
	int Weight=(int)weight;
	char s='A';
	int b=s;
	int n=66;
	char c=(char)n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertingDataTypes d1=new ConvertingDataTypes();
		System.out.println("int value:"+d1.a);
		System.out.println("int to double:"+d1.d);
		System.out.println("double:"+d1.weight);
		System.out.println("double to int:"+d1.Weight);
		System.out.println("char:"+d1.s);
		System.out.println("int to char:"+d1.b);
		System.out.println("int value:"+d1.n);
		System.out.println("char to int:"+d1.c);
	}

}
