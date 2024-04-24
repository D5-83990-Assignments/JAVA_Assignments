import java.util.InputMismatchException;
import java.util.Scanner;

public class Que_01 {
	
	void displayType(String var)
	{
		System.out.println("String type");
	}
	void displayType(int var)
	{
		System.out.println("Integer type");
	}
	String displayType(double var)
	{
		return "Double";
	}
	void displayType(float var)
	{
		System.out.println("Float type");
	}

	public static void main(String[] args) {
		
	
		Que_01 sam = new Que_01();
		
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		try
		{
			System.out.print("Enter number 1 :- ");
			num1 = sc.nextDouble();
			System.out.print("Enter number 2 :- ");
			num2 = sc.nextDouble();
			if(sam.displayType(num1) == "Double" && sam.displayType(num2) == "Double")
			{
				System.out.println("Average :- "+(num1+num2)/2);
			}
			else
			{
				System.out.println("Please enter double value");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter double value");
		}
		System.out.println("Thanks.....");
	}
}
