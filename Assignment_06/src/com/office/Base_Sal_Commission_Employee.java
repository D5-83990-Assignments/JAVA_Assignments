package com.office;

import java.util.Scanner;

public class Base_Sal_Commission_Employee extends Commisison_Employee{
	private double base_salary;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter BASE SALARY :- ");
		base_salary = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void calculateSal() {
		System.out.println("SALARY :- " +(getWeeklySal() + base_salary*0.1));
	}

}
