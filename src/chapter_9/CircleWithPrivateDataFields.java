package chapter_9;

public class CircleWithPrivateDataFields {
	private double radius=1;
	private static int numberOfObjects=0;
	
	public CircleWithPrivateDataFields() {		
	}
	public CircleWithPrivateDataFields(double newRadius) {
		radius=newRadius;
		numberOfObjects++;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius){
		radius=(newRadius >=0) ? newRadius : 0;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
