package chapter13;

import chapter13_exercises.Colorable;

public class Rectangle extends GeometricObject implements Colorable , Comparable <GeometricObject>{
	private double width;
	private double height;
	
	public Rectangle() {		
	}
	public Rectangle(double width, double height) {	
		this.width=width;
		this.height=height;
	}
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color,filled);
		this.width=width;
		this.height=height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return (width+height)*2;
	}
	@Override
	public String toString() {
		return "Width: "+width+". Height: "+height;
	}
	@Override
	public void howToColor() {
		System.out.println("Color both sides x 2");
	}
	public int compareTo(GeometricObject o) {
		if(getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	@Override
	public boolean equals (Object o) {
		if (o instanceof Rectangle)
			return getArea() == ((Rectangle)o).getArea();
		else
			return false;
	}
}

