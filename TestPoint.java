package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		int x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the point x1 :- ");
		x1 = sc.nextInt();
		System.out.print("Enter the point y1 :- ");
		y1 = sc.nextInt();
		System.out.print("Enter the point x2 :- ");
		x2 = sc.nextInt();
		System.out.print("Enter the point y2 :- ");
		y2 = sc.nextInt();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		
		if(p1.isEqual(p2))
		{
			System.out.println("p1 and p2 located at same position");
		}
		else
		{
			double result = p1.calculateDistance(p2);
			System.out.println("The distance between p1 and p2 :- "+result);
		}
	}

}
