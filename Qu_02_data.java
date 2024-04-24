package p1;

import java.util.Scanner;

public class Qu_02_data {
	
	double perDayMile;
	double costPerGallon;
	double avg;
	double parkFees;
	double tollPerDay;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total miles per day :- ");
		perDayMile = sc.nextDouble();
		System.out.println("Enter cost per gallon :- ");
		costPerGallon = sc.nextDouble();
		System.out.println("Enter average miles per gallon :- ");
		avg = sc.nextDouble();
		System.out.println("Enter parking fees per day :- ");
		parkFees = sc.nextDouble();
		System.out.println("Enter tolls per day :- ");
		tollPerDay = sc.nextDouble();
	}
	
	public void display()
	{
		double finalValue = (((perDayMile/avg)*costPerGallon)+parkFees+tollPerDay);
		System.out.println("Total cost for 4 Employee :- "+finalValue);
		System.out.println("Rs. Per head :- "+(finalValue/4));
	}
}
