package com.office;

import java.util.Scanner;

public class Hourly_Employee extends Employee{
	private double weeklySal;
	private double wagePerHr;
	private int hrs;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter wage per hour :- ");
		wagePerHr = sc.nextDouble();
		System.out.print("Enter hours of work in week :- ");
		hrs = sc.nextInt();		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void calculateSal() {
		if((hrs - 40)> 0)
		{
			weeklySal = (hrs*wagePerHr)+((hrs - 40)*wagePerHr*1.5);
		}
		else
		{
			weeklySal = wagePerHr*hrs;
		}
		System.out.println("SALARY :- "+weeklySal);
	}
	
	
}
