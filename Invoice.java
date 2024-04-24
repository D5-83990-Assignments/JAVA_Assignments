package com.abhi;

public class Invoice {
	private String partNumber;
	private String partDesc;
	private int quantity;
	private double perItemPrice;
	
	
	public Invoice(String partNumber, String partDesc, int quantity, double perItemPrice) {
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.perItemPrice = perItemPrice;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPerItemPrice() {
		return perItemPrice;
	}
	public void setPerItemPrice(double perItemPrice) {
		this.perItemPrice = perItemPrice;
	}
	
	
}
