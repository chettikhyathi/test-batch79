package com.javaintro.copy;

public class Demo5 {

	static String TrainerName1 = "Vishwa Sir";
	static String TrainerName2 = "Srikanth Sir";
	
	String EmployeeName;
	int Empid;
	String EmployeeDesignation;
	public static void main(String[] args) {
		
		Demo5 obj1 = new Demo5();
		Demo5 obj2 = new Demo5();
		Demo5 obj3 = new Demo5();
		Demo5 obj4 = new Demo5();
		Demo5 obj5 = new Demo5();
		
		obj1.EmployeeName = "Khyathi";
		obj1.Empid = 1;
		obj1.EmployeeDesignation = "Java Full Stack";
		
		obj2.EmployeeName = "Ushasri";
		obj2.Empid = 2;
		obj2.EmployeeDesignation = "Python Full Stack";
		
		obj3.EmployeeName = "Pravallika";
		obj3.Empid = 3;
		obj3.EmployeeDesignation = "Java Full Stack";
		
		obj4.EmployeeName = "Bindhu";
		obj4.Empid = 4;
		obj4.EmployeeDesignation = "Python Full Stack";
		
		obj5.EmployeeName = "Madhu";
		obj5.Empid = 5;
		obj5.EmployeeDesignation = "Java Spring Boot";
		
		System.out.println(Demo5.TrainerName1);
		System.out.println(Demo5.TrainerName2);
		
		System.out.println("EmployeeName: " + obj1.EmployeeName + " ,Empid: " + obj1.Empid + " ,EmployeeDesignation: " + obj1.EmployeeDesignation);
		System.out.println("EmployeeName: " + obj2.EmployeeName + " ,Empid: " + obj2.Empid + " ,EmployeeDesignation: " + obj2.EmployeeDesignation);
		System.out.println("EmployeeName: " + obj3.EmployeeName + " ,Empid: " + obj3.Empid + " ,EmployeeDesignation: " + obj3.EmployeeDesignation);
		System.out.println("EmployeeName: " + obj4.EmployeeName + " ,Empid: " + obj4.Empid + " ,EmployeeDesignation: " + obj4.EmployeeDesignation);
		System.out.println("EmployeeName: " + obj5.EmployeeName + " ,Empid: " + obj5.Empid + " ,EmployeeDesignation: " + obj5.EmployeeDesignation);
	}

}
