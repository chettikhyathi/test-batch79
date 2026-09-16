 package com.javaintro.copy;

public class Demo6 {
	
	static String CompanyName;
	int Empid;
	String EmpName;
	int Salary;
	
	static {
		CompanyName = "Infosys";	
		System.out.println(CompanyName);
	}
	{
		System.out.println("Instance block Loaded");
	}
	public static void main(String[] args) {
		Demo6 e1 = new Demo6();
		Demo6 e2 = new Demo6();
		Demo6 e3 = new Demo6();
		
		e1.Empid=01;
		e1.EmpName="Khyathi";
		e1.Salary=50000;
		
		e2.Empid=02;
		e2.EmpName="Ushasri";
		e2.Salary=50000;
		
		e3.Empid=03;
		e3.EmpName="Pravallika";
		e3.Salary=50000;
		
		 
		
		System.out.println("Empid :"+e1.Empid + ",EmpName :"+e1.EmpName + ",Salary :"+e1.Salary);
		System.out.println("Empid :"+e2.Empid + ",EmpName :"+e2.EmpName + ",Salary :"+e2.Salary);
		System.out.println("Empid :"+e3.Empid + ",EmpName :"+e3.EmpName + ",Salary :"+e3.Salary);
		

	}

}
