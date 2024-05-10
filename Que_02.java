package com.sunbeam;

import java.util.Scanner;

public class Que_02 {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :- ");
		s = sc.next();
		char[] charS = s.toCharArray();
		String revS = String.valueOf(charS[s.length()-1]);
		for(int i=s.length()-2;i>=0;i--)
		{
			revS = revS + charS[i]; 
		}
		if(revS.equals(s))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}

}
