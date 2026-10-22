package com.javaintro.copy.constructors;

public class Students {
	static int count=0;
	int stno;
	Students(){
		count++;
	}
	public static void main(String[] args) {
		Students s1=new Students();
		s1.stno=01;
		Students s2=new Students();
		s2.stno=02;
		Students s3=new Students();
		s3.stno=03;
		Students s4=new Students();
		s4.stno=04;
		Students s5=new Students();
		s5.stno=05;
		System.out.println("The object count is: "+count);
		System.out.println("The student no is: "+s1.stno);
		System.out.println("The student no is: "+s2.stno);
		System.out.println("The student no is: "+s3.stno);
		System.out.println("The student no is: "+s4.stno);
		System.out.println("The student no is: "+s5.stno);
	}

}
