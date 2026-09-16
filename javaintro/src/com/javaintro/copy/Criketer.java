package com.javaintro.copy;

public class Criketer {
	static int countryId;
	static String countryName; 
	
	int jerseyNumber;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome to Indian CricketTeam");
		countryId = 91;
		countryName = "India";
		System.out.println("countryId : " + countryId);
		System.out.println("countryName : " + countryName);
		
		Criketer msd = new Criketer();
		msd.jerseyNumber=7;
		msd.cricketerName="Dhoni";
		System.out.println("jerseyNumber : " + msd.jerseyNumber);
		System.out.println("cricketerName : " + msd.cricketerName);
		
		Criketer vk = new Criketer();
		countryId = 92;
		countryName = "Bharath";
		System.out.println("countryId : " + countryId);
		System.out.println("countryName : " + countryName);
		vk.jerseyNumber=18;
		vk.cricketerName="Virat";
		System.out.println("jerseyNumber : " + vk.jerseyNumber);
		System.out.println("cricketerName : " + vk.cricketerName);
		
		Criketer rs = new Criketer();
		System.out.println("countryId : " + countryId);
		System.out.println("countryName : " + countryName);
		rs.jerseyNumber=45;
		rs.cricketerName="Rohit Sharma";
		System.out.println("jerseyNumber : " + rs.jerseyNumber);
		System.out.println("cricketerName : " + rs.cricketerName);
		
	}

}
