package com.javaintro.copy;

public class LoanManagement {
	String CustomerName;
	double LoanAmount;
	double IntrestRate;
	int Loantenure;

	public static void main(String[] args) {
		LoanManagement lm=new LoanManagement();
		lm.CustomerName="Khyathi";
		lm.LoanAmount=2000000;
		lm.IntrestRate=8.5;
		lm.Loantenure=5;
		double intrest1=lm.calculateIntrest(lm.LoanAmount,lm.IntrestRate);
		double total1=lm.calculateTotalAmount(intrest1);
		double emi1=lm.calculateMonthlyEMI(total1,lm.Loantenure);
		lm.displayLoanSummary(intrest1,total1,emi1);
	}
	
	double calculateIntrest(double amount, double rate) {
		return(amount*rate*Loantenure)/100;
	}
	double calculateTotalAmount(double intrest) {
		return LoanAmount+ intrest;
	}
	double calculateMonthlyEMI(double total, int tenure) {
		return total/(tenure*12);
	}
	void displayLoanSummary(double intrest, double total, double emi) {
		System.out.println("The Customer Name is: "+ CustomerName);
		System.out.println("The LoanAmount is: "+ LoanAmount);
		System.out.println("The Rate of Intrest is: "+ IntrestRate);
		System.out.println("The Loantenure is: "+ Loantenure);
		System.out.println("The intrest is: "+ intrest);
		System.out.println("The Total Amount is: "+ total);
		System.out.println("The EMI is: "+ emi);
	}

}
