package com.sunbeam;

import java.util.Scanner;

public class Que_03 {

	public static void main(String[] args) {
		String s;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :- ");
		s = sc.nextLine();
		String[] arr = s.split(" ");
		for(String ele : arr)
		{
			count++;
		}
		System.out.println("The number of words in string :- "+count);
	}

}
