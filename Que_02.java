package com.sunbeam;

import java.util.Arrays;

public class Que_02 {

	public static void main(String[] args) {
		Product[] arr = {
				new Product(5,"Java Book","Books",540),
				new Product(3,"Harry Potter","Novel",500),
				new Product(1,"Choco","Ice Cream",50),
				new Product(6,"Charger","Electronics",2500),
				new Product(2,"Sofa","Furniture",25000),
				new Product(4,"RO","Home Appliance",5000),
				new Product(10,"Perfume","Cosmetics",250),
				new Product(7,"Tubelight","Electrical",350),
				new Product(8,"Tomato","Vegetables",30),
				new Product(9,"Wheat","Grocery",300),
		};
		
		
		System.out.println("BEFORE SORTING --->");
		for(Product ele : arr)
			System.out.println(ele);

		Arrays.sort(arr);
		
		System.out.println("AFTER SORTING --->");
		for(Product ele : arr)
			System.out.println(ele);
	}

}
