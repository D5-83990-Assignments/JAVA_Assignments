package com.sunbeam;

import java.util.Arrays;

public class Que_01 {

	public static void main(String[] args) {
		
		Student[] arr = {
				new Student(5,"Puneet",549.5),
				new Student(3,"Mahesh",540.5),
				new Student(1,"Abhishek",550),
				new Student(4,"Rushikesh",545.5),
				new Student(2,"Hemant",548.5)
		};
		
		System.out.println("BEFORE SORTING --> ");
		for(Student ele : arr)
			System.out.println(ele);
		
		Arrays.sort(arr);
		
		System.out.println("AFTER SORTING --> ");
		for(Student ele : arr)
			System.out.println(ele);
	}

}
