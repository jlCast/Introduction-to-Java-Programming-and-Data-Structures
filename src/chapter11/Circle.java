package chapter11;

public class Circle extends GeometricObject{
	private double radius;
	
	public Circle() {
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public double getDiameter() {
		return 2*radius;
	}
	public void printCircle() {
		System.out.println("The Circle is created "+getDateCreated()+" and the radius is "+radius);
	}
	public String toString() {
		return super.toString()+"\nradius is "+radius;
	}
	@Override
	public boolean equals (Object o) {
		if (o instanceof Circle)
			return radius==((Circle)o).radius;
		else
			return false;
	}
}
