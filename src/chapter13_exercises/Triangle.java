package chapter13_exercises;

import chapter13.GeometricObject;

public class Triangle extends GeometricObject{
	private double side1=0;
	private double side2=0;
	private double side3=0;
		
	public Triangle() {
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;		
	}
	public double getArea() {
		double s = (side1+side2+side3)/2;//Semiper�metro
		return Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));//F�rmula de Her�n
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
}
