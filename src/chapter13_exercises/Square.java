package chapter13_exercises;

import chapter13.GeometricObject;

public class Square extends GeometricObject implements Colorable {
	private double side;
	
	public Square() {
		this(0);
	}
	public Square(double side) {
		this.side = side;	
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}
	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}
	@Override
	public double getPerimeter() {
		return side*4;
	}
}
