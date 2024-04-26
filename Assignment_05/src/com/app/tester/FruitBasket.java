package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		int num,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many fruits you want :- ");
		num = sc.nextInt();
		Fruit[] basket = new Fruit[num];
		int counter=0;
		String n;
		String c;
		double w;
		
		do {
			System.out.println();
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display all fruits name");
			System.out.println("5. Display all details of fresh fruits");
			System.out.println("6. Mark a fruit as stale");
			System.out.println("7. Display tastes of all stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.println();
			System.out.println("0. EXIT");
			System.out.println();
			System.out.println("Enter your choice :- ");
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 0:
				System.out.println();
				System.out.println("Thanks !!!!");
				break;
			
			case 1:
				if(counter<num)
				{
					System.out.print("Enter the name of fruit :- ");
					n = sc.next();
					System.out.print("Enter the color of "+n+" :- ");
					c = sc.next();
					System.out.print("Enter the weight of "+n+" :- ");
					w = sc.nextDouble();
					basket[counter++] = new Mango(n, c, w);
				}
				else
				{
					System.out.println("Your basket limit exceeded !!!");
					
				}
				break;
				
			case 2:
				if(counter<num)
				{
					System.out.print("Enter the name of fruit :- ");
					n = sc.next();
					System.out.print("Enter the color of "+n+" :- ");
					c = sc.next();
					System.out.print("Enter the weight of "+n+" :- ");
					w = sc.nextDouble();
					basket[counter++] = new Orange(n, c, w);
				}
				else
				{
					System.out.println("Your basket limit exceeded !!!");
					
				}
				break;
				
			case 3:
				if(counter<num)
				{
					System.out.print("Enter the name of fruit :- ");
					n = sc.next();
					System.out.print("Enter the color of "+n+" :- ");
					c = sc.next();
					System.out.print("Enter the weight of "+n+" :- ");
					w = sc.nextDouble();
					basket[counter++] = new Apple(n, c, w);
				}
				else
				{
					System.out.println("Your basket limit exceeded !!!");
					
				}
				break;
				
			case 4:
				for(Fruit f : basket)
					if(f == null)
						break;
					else
						System.out.println(f.getName());
				break;
				
			case 5:
				for(Fruit f : basket)
					if(f!=null )
					{
						if(f.isFresh() == true)
						{
							System.out.println(f.toString());
							System.out.println("taste : "+f.taste());
						}
					}
					else
						break;
				break;
				
			case 6:
				int index;
				System.out.print("Enter the index of stale fruit :- ");
				index = sc.nextInt();
				if(index>=0 && index<counter)
				{
					basket[index].setFresh(false);
				}
				else
				{
					System.out.println("Invalid index");
				}
				break;
				
			case 7:
				for (int i = 0; i < counter; i++) {
					if(basket[i].isFresh()==false)
					{
						System.out.println(basket[i].taste());
					}
				}
				break;
				
			case 8:
				for(Fruit f : basket)
					if(f!=null)
					{
						if(f.taste() == "sour")
							f.setFresh(false);
					}
					else
						break;
				break;

			default:
				System.out.println("Enter valid choice");
				break;
			}
		} while (choice!=0);
	}

}
