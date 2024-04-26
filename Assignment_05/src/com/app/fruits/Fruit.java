package com.app.fruits;

public class Fruit {
	String color;
	double weight;
	String name;
	boolean Fresh;
	
	public Fruit(String name,String color,double weight)
	{
		this.name = name;
		this.color = color;
		this.weight = weight;
		Fresh = true;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color ="+ color + ", weight =" + weight +" isFresh ="+ Fresh +"]";
	}
	
	public String taste()
	{
		return "no specific taste";
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return Fresh;
	}

	public void setFresh(boolean Fresh) {
		this.Fresh = Fresh;
	}

	
	
}