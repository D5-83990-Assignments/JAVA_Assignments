package com.office;

import java.util.Scanner;

public class Salaried_Employee extends Employee {
	protected double weeklySal;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void calculateSal() {
		weeklySal=10000;
		System.out.println("SALARY :- "+weeklySal);
	}
}
