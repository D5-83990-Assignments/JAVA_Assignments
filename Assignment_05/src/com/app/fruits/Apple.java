package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, String color, double weight) {
		super(name, color, weight);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public String taste() {
		return "sweet n sour";
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
