package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String name, String color, double weight) {
		super(name, color, weight);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public String taste() {
		return "sour";
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
