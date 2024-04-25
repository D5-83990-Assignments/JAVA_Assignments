package com.app.geometry;

public class Point2D {
	private int x;
	private int y ;
	
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDetails()
	{
		String stringX = String.valueOf(x);
		String stringY = String.valueOf(y);
		String detail = "The point is (" + stringX +","+ stringY + ")";
		return detail;
	}
	
	public boolean isEqual(Point2D P1)
	{
		if((P1.getX() == this.x) && (P1.getY() == this.y))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double calculateDistance(Point2D P2)
	{
		double dis = Math.pow((P2.getX()-this.x), 2) + Math.pow((P2.getY()-this.y), 2);
		return Math.sqrt(dis);
	}
	
}
