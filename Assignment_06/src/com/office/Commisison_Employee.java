package com.office;

import java.util.Scanner;

public class Commisison_Employee extends Employee{
	protected double grossSales;
	protected double commissionRate;
	protected double weeklySal;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter GROSS SALE :- ");
		grossSales = sc.nextDouble();
		System.out.print("Enter COMMISION RATE :- ");
		commissionRate = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void calculateSal() {
		weeklySal = grossSales * commissionRate;
		System.out.println("SALARY :- "+weeklySal);
	}

	public double getWeeklySal() {
		return weeklySal;
	} 
}
