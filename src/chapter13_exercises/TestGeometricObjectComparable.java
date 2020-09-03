package chapter13_exercises;

import chapter13.Circle;
import chapter13.GeometricObject;
import chapter13.Rectangle;

public class TestGeometricObjectComparable {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(12.5,15.8);
		Rectangle rectangle1 = new Rectangle (15.8,5.4);
		System.out.println("The larguest is the rectangle with "+GeometricObject.max(rectangle,rectangle1));
		Circle circle = new Circle(12.5);
		Circle circle1 = new Circle(15.8);
		System.out.println("The larguest is the circle with "+GeometricObject.max(circle,circle1));
	}

}
