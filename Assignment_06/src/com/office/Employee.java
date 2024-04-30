package com.office;

import java.util.Scanner;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private int empID;
	
	public void accept(Scanner sc)
	{
		System.out.print("Enter EMPLOYEE ID :- ");
		empID = sc.nextInt();
		System.out.print("Enter FIRST NAME :- ");
		firstName = sc.next();
		System.out.print("Enter LAST NAME :- ");
		lastName = sc.next();
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empID=" + empID + "]";
	}
	
	public abstract void calculateSal();
}
