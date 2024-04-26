package com.app.fruits;

public class Mango extends Fruit {
	
	public Mango(String name, String color, double weight) {
		super(name, color, weight);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public String taste() {
		return "sweet";
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isFresh() {
		return super.isFresh();
	}

	public void setFresh(boolean Fresh) {
		this.Fresh = Fresh;
	}
}
