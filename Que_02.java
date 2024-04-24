import java.util.Scanner;

public class Que_02 {

	public static void main(String[] args) {
		double result=0;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("1. Dosa - Price: Rs.20");
			System.out.println("2. Samosa - Price: Rs.15");
			System.out.println("3. Idli - Price: Rs.20");
			System.out.println("4. Kachori - Price: Rs.15");
			System.out.println("5. Bread Patice - Price: Rs.15");
			System.out.println("6. Generate Bill");
			System.out.println("0. EXIT");
			System.out.print("Please enter your choice :- ");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:
				System.out.println("select quantity of dosa :- ");
				int num1;
				num1 = sc.nextInt();
				int price1 = 20;
				result = result + price1*num1;
				break;
				
			case 2:
				System.out.println("select quantity of samosa :- ");
				int num2;
				num2 = sc.nextInt();
				int price2 = 15;
				result = result + price2*num2;
				break;
				
			case 3:
				System.out.println("select quantity of idli :- ");
				int num3;
				num3 = sc.nextInt();
				int price3 = 20;
				result = result + price3*num3;
				break;

			case 4:
				System.out.println("select quantity of kachori :- ");
				int num4;
				num4 = sc.nextInt();
				int price4 = 15;
				result = result + price4*num4;
				break;	
				
			case 5:
				System.out.println("select quantity of bread pattice :- ");
				int num5;
				num5 = sc.nextInt();
				int price5 = 15;
				result = result + price5*num5;
				break;	
				
			case 6:
				System.out.println("Your bill :- Rs. "+result);
				choice = 0;
				System.out.println("Thanks for using our app");
				break;
				
			case 0:
				System.out.println("Thanks for using our app");
				break;
				
			default:
				System.out.println("Please make valid choice");
				break;
			}
			
		} while (choice != 0);
		
		

	}

}
