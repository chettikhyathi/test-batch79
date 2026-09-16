package com.javaintro.copy;

public class Demo9 {
	protected void finalize() {
		System.out.println("Finalize method called");
	}
	void hello() {
		//System.out.println("Hello");
		Demo9 t = new Demo9();
		//System.out.println("hello method ended");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		Demo9 d1 = new Demo9();
		Demo9 d2 = new Demo9();
		Demo9 d3 = new Demo9();
		//nullifying
		d1=null;
		//re-assigning
		d2=d3;
		
		System.gc();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		new Demo9().hello();
	}

}
