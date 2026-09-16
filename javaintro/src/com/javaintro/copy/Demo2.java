package com.javaintro.copy;

public class Demo2 {
	static String CollegeName = "Raghu";
	public static void main(String[] args) {
		//local variable : inside a method
		String CollegeName = "REC"; //Re declaration
		System.out.println(CollegeName);
		System.out.println(Demo2.CollegeName);
		System.out.println(Student.CollegeName);
		Student s=new Student();
		System.out.println(s.studentid);
	}

}