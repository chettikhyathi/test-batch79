package com.javaintro.copy;

public class Purchase {
	
	static int chocolatecost =15;
	static int cookiecost = 10;
	static int totalamounthaving=450;
	
	int chocolates;
	int cookies;
	int totalcost;
	int remainingamount;
	
	{
		chocolates =10;
		cookies =5;
		totalcost = (chocolates*chocolatecost)+(cookies*cookiecost);
		remainingamount= totalamounthaving-totalcost;
		
		System.out.println("Total Cost of the Items: " +totalcost);
		System.out.println("Remaining Amount: " +remainingamount);
	}
	public static void main(String[] args) {
		new Purchase();
		
		System.out.println("Task Completed");
		

	}

}
