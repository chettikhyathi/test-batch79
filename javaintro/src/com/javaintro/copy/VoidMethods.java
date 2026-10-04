package com.javaintro.copy;

public class VoidMethods {
	String StudentName;
	int RollNo;
	String Course;
	int marks1;
	int marks2;
	int marks3;
	int TotalMarks;
	int NoOfSubjects;
	double Avg;
	void displayStudentDetails() {
		System.out.println("StudentName:"+StudentName);
		System.out.println("RollNo:"+RollNo);
		System.out.println("Course:"+Course);
	}
	void calculateTotal() {
		TotalMarks=marks1+marks2+marks3;
		System.out.println("TotalMarks:"+TotalMarks);
	}
	void calculateAverage() {
		NoOfSubjects=3;
		TotalMarks=marks1+marks2+marks3;
		Avg=TotalMarks/NoOfSubjects;
		System.out.println("AverageMarks:"+Avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidMethods m1=new VoidMethods();
		VoidMethods m2=new VoidMethods();
		VoidMethods m3=new VoidMethods();
		m1.StudentName="Khyathi";
		m1.RollNo=9371;
		m1.Course="Java";
		m1.marks1=99;
		m1.marks2=89;
		m1.marks3=90;
		m1.displayStudentDetails();
		m1.calculateTotal();
		m1.calculateAverage();
		
		m2.StudentName="Usha";
		m2.RollNo=9372;
		m2.Course="Java";
		m2.marks1=99;
		m2.marks2=89;
		m2.marks3=90;
		m2.displayStudentDetails();
		m2.calculateTotal();
		m2.calculateAverage();
		
		m3.StudentName="Pravali";
		m3.RollNo=9370;
		m3.Course="Java";
		m3.marks1=99;
		m3.marks2=89;
		m3.marks3=90;
		m3.displayStudentDetails();
		m3.calculateTotal();
		m3.calculateAverage();
	}

}
