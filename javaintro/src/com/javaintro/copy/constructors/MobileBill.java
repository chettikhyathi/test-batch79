package com.javaintro.copy.constructors;

import java.util.Scanner;

public class MobileBill {
	String model;
	double price;
	int quantity;
	double deliveryCharge;
	double cost;
	double finalBill;
	
	MobileBill(String model){
		this.model=model;
	}
	
	MobileBill(String model, double price) {
		this(model);
		this.price = price;
	}
	
	MobileBill(String model, double price, int quantity) {
		this(model,price);
		this.quantity = quantity;
		this.cost=this.price*this.quantity;
	}
	
	MobileBill(String model, double price, int quantity, double deliveryCharge) {
		this(model,price,quantity);
		this.deliveryCharge = deliveryCharge;
		this.finalBill=this.cost+this.deliveryCharge;
	}
	
	void displayBill() {
		System.out.println("The model of the mobile is: "+model);
		System.out.println("The price of the mobile is: "+price);
		System.out.println("The Quantity of the mobiles is: "+quantity);
		System.out.println("The delivery charge of the mobile is: "+deliveryCharge);
		System.out.println("The cost of the mobile is: "+cost);
		System.out.println("The final bill is: "+finalBill);
	}
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the model of the mobile: ");
		String model =sc.nextLine();
		System.out.println("Enter the Price: ");
		double price =sc.nextDouble();
		System.out.println("Enter the quantity: ");
		int quantity =sc.nextInt();
		System.out.println("Enter the Delivery Charge: ");
		double deliveryCharge=sc.nextDouble();
		
		MobileBill m =new MobileBill(model,price,quantity,deliveryCharge);
		m.displayBill();
		
		sc.close();

	}

}
