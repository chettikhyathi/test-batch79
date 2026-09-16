package com.javaintro.copy;

public class Demo8 {
	
	static int count =0;
	
	 void dust(){
		count++;
	}

	public static void main(String[] args) {
		Demo8 t = new Demo8();
		t.dust();
		Demo8 t1 = new Demo8();
		t1.dust();
		Demo8 t2 = new Demo8();
		t2.dust();
		Demo8 t3 = new Demo8();
		t3.dust();
		Demo8 t4 = new Demo8();
		t4.dust();
		System.out.println("Total Count:" + count);
	}

}
