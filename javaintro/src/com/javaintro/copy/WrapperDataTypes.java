package com.javaintro.copy;

public class WrapperDataTypes {
	
	Integer Student_ID =9371;
	String Student_Name ="khyathi";
	Integer Age =22;
	Double Marks =99d;
	Character Grade ='A';
	Boolean Passed =true;
	Byte Number;
	Float Weight;
	Short ID;
	Long PhoneNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperDataTypes d1 = new WrapperDataTypes();
		System.out.println("Integer Value : "+d1.Student_ID);
		System.out.println("String Value : "+d1.Student_Name);
		System.out.println("Integer Value : "+d1.Age);
		System.out.println("Double Value : "+d1.Marks);
		System.out.println("Character Value : "+d1.Grade);
		System.out.println("Boolean Value : "+d1.Passed);
		System.out.println("Byte Value : "+d1.Number);
		System.out.println("Float Value : "+d1.Weight);
		System.out.println("Short Value : "+d1.ID);
		System.out.println("Long Value : "+d1.PhoneNumber);
	}

}