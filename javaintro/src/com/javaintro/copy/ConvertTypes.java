package com.javaintro.copy;

public class ConvertTypes {
	Integer Student_ID=9371;
	Integer Marks=100;//Auto-Boxing(converting primitive data types to wrapper object data types)
	int i1=Marks;//Auto-Unboxing(converting wrapper object data types to primitive data types)
	Boolean Pass=true;
	public static void main(String[] args) {
		ConvertTypes d1=new ConvertTypes();
		System.out.println("Student ID :"+d1.Student_ID);
		System.out.println("Student Marks :"+d1.Marks);
		System.out.println("Student Pass:"+d1.Pass);
		System.out.println("Auto UnBoxing:"+d1.i1);
	}

}
