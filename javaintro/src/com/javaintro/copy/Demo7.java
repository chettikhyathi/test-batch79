package com.javaintro.copy;

public class Demo7 {
	static {
		System.out.println("heloo static");
	}
	{
		System.out.println("heloo instance");
	}

	public static void main(String[] args) {
		 Demo7 d=new Demo7();
		 Demo7 d1=new Demo7();
	}

}
