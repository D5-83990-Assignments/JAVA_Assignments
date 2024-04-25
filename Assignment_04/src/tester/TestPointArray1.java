package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		int num,x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many points you want :- ");
		num = sc.nextInt();
		Point2D[] points = new Point2D[num];
		for (int i = 0; i < points.length; i++) {
			System.out.print("Enter x"+(i+1)+" :- ");
			x = sc.nextInt();
			System.out.print("Enter y"+(i+1)+" :- ");
			y = sc.nextInt();
			points[i] = new Point2D(x, y);
		}
		
		int choice;
		do {
			System.out.println();
			System.out.println("1. Display details of specific point ");
			System.out.println("2. Display all point ");
			System.out.println("3. Give 2 indices for the points and find distance ");
			System.out.println("4. EXIT ");
			System.out.println();
			System.out.print("Enter your choice :- ");
			choice = sc.nextInt();
			System.out.println();
			
			switch (choice) {
			case 1:
				int index;
				System.out.print("Enter the index :- ");
				index = sc.nextInt();
				if(0 <= index && index < points.length)
				{
					System.out.println(points[index].getDetails());
				}
				else
				{
					System.out.println("Invalid index , pls retry!!!!");
				}
				break;
				
			case 2:
				for(Point2D data : points)
					System.out.println(data.getDetails());
				break;
				
			case 3:
				int index1,index2;
				System.out.print("Enter index of start point :- ");
				index1 = sc.nextInt();
				System.out.print("Enter index of end point :- ");
				index2 = sc.nextInt();
				if((0<=index1 && index1<points.length) && (0<=index2 && index2<points.length))
				{
					if(points[index1].isEqual(points[index2]))
					{
						System.out.println();
						System.out.println("Both points are at same position");
						System.out.println();
					}
					else
					{
						
						double res = points[index1].calculateDistance(points[index2]);
						System.out.println("Distance between points is :- "+res);
					}
				}
				else
				{
					System.out.println();
					System.out.println("Index is not under limit");
				}
			
			case 4:
				System.out.println("Thanks for using our app");
				break;
				
			default:
				System.out.println("Please make correct choice");
				break;
			}
			
			
		} while (choice!=4);
	}

}
