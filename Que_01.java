package com.abhi;

public class Que_01 {

	public static void main(String[] args) {
		
		Invoice I1 = new Invoice("456", "Arduino", 2, 350);
		double result = 0;
		
		if(I1.getQuantity() < 0 || I1.getPerItemPrice() < 0)
		{
			I1.setQuantity(0);
			I1.setPerItemPrice(0);
		}
		else
		{
			result = I1.getQuantity()*I1.getPerItemPrice();
		}
		System.out.println("Your bill is :- "+result);	

	}

}
