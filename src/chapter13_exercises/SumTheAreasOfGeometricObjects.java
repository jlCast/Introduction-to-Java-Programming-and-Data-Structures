package chapter13_exercises;

import chapter13.Circle;
import chapter13.GeometricObject;

public class SumTheAreasOfGeometricObjects {

	public static void main(String[] args) {
		GeometricObject[] geometricObjectArray = new GeometricObject[4];
		geometricObjectArray[0] = new Circle(3);
		geometricObjectArray[1] = new Circle(7);
		geometricObjectArray[2] = new Rectangle(7.1,5.3);
		geometricObjectArray[3] = new Rectangle(5.1,1.3);
		
		System.out.println("The total area is: "+sumArea(geometricObjectArray));
	}
	public static double sumArea(GeometricObject [] oList) {
		double sumArea=0;
		for(GeometricObject objects: oList)
			sumArea += objects.getArea();
		return sumArea;
	}
}
