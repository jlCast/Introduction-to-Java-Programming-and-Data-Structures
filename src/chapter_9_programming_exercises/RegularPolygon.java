package chapter_9_programming_exercises;

public class RegularPolygon {
	public RegularPolygon(){		
	}
	public RegularPolygon(int newN,double newSide){	
		n=newN;
		side=newSide;
	}
	public RegularPolygon(int newN,double newSide, double newX, double newY){	
		n=newN;
		side=newSide;
		x=newX;
		y=newY;
	}
	
	public void setN(int newN) {
		n=newN;
	}
	public int getN() {
		return n;
	}
	public void setSide(double newSide) {
		side=newSide;
	}
	public double getSide() {
		return side;
	}
	public void setX(double newX) {
		x=newX;
	}
	public double getX() {
		return x;
	}
	public void setY(double newY) {
		y=newY;
	}
	public double getY() {
		return y;
	}
	public double getPerimeter() {
		return n*side;
	}
	public double getArea() {
		return (n*Math.pow(side, 2))/(4*Math.tan(Math.PI/n));
	}	
	
	private int n=3;
	private double side=0;
	private double x=0;
	private double y=0;
	
}
