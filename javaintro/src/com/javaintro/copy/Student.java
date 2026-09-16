package com.javaintro.copy;

public class Student {
	static String CollegeName = "Raghu Engineering College";
	int studentid = 10;
	String studentname = "Khyathi";
	public static void main(String[] args) {
		System.out.println(Student.CollegeName);
		Student khy = new Student();
		System.out.println("studentid : " + khy.studentid);
		System.out.println("studentname : " + khy.studentname);
	}
}
