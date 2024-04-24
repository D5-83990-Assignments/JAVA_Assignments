import java.util.Scanner;

public class Que_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int allowedLimit;
		int beginBalance;
		int charges;
		int credits;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pending balance at the beginning of the month :- ");
		beginBalance = sc.nextInt();
		System.out.println("Enter total of all items charged by the customer this month :- ");
		charges = sc.nextInt();
		System.out.println("Enter total of all credits applied to the customer’s account this month :- ");
		credits = sc.nextInt();
		System.out.println("Enter allowed credit :- ");
		allowedLimit = sc.nextInt();
		int cal = beginBalance + charges - credits;
		if(allowedLimit < cal)
		{
			System.out.println("Credit limit exceeded");
		}
		else
		{
			System.out.println("New balance for next month :- "+cal);
		}
	}

}
