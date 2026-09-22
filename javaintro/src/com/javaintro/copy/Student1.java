package com.javaintro.copy;

public class Student1 {
	
	int Accno;
    String name;
    double salary;
    static int accountNoGenerater = 1000; 

    
    {
        accountNoGenerater++;
        Accno = accountNoGenerater;
        System.out.println("New Account Created: " + Accno);
    }

    
    Student1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Accno: " + Accno + ", Name: " + name + ", Salary: " + salary);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 a1 = new Student1("Ramesh", 25000);
		Student1 a2 = new Student1("Suresh", 30000);
		Student1 a3 = new Student1("Mahesh", 15000);

        a1.display();
        a2.display();
        a3.display();

	}

}
