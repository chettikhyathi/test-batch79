package com.javaintro.copy;

public class Students {
		String Name;
		int Id;
		int Marks;
		String EmailId;
		
		static {
			System.out.println("College: Raghu");
		}
		
		//{
	//		System.out.println("Student Object is Created");
		//}
		
		void hello() {
			System.out.println("Name: "+Name + " ,Id: "+Id+" ,Marks: "+Marks+" ,EmailId: "+EmailId);
		}
		static void College() {
			//System.out.println("College: Raghu");
			System.out.println("State: Andhra");
			System.out.println("Area: Visakhaptanam");
		}
	public static void main(String[] args) {
		
		Students s1=new Students();
		Students s2=new Students();
		
		s1.Name="Khyathi";
		s1.Id=10;
		s1.Marks=99;
		s1.EmailId="chettikhyathi@gmail.com";
		s1.hello();
		Students.College();
	
		s2.Name="Sai Kiran";
		s2.Id=11;
		s2.Marks=80;
		s2.EmailId="sarikiran@gmail.com";
		s2.hello();
		Students.College();
		System.out.println("Details Printed");
		
	}

}
