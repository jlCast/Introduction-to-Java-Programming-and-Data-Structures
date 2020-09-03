package chapter13_exercises;

import chapter13.Circle;
import chapter13.GeometricObject;

public class ComparableCircle extends Circle implements Comparable<GeometricObject> {

	public ComparableCircle(double radius) {
		super(radius);
	}
	@Override
	public int compareTo(GeometricObject c) {
		if(getArea()>c.getArea())
			return 1;
		else if (getArea()<c.getArea())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return super.toString()+". Area: "+getArea();
	}
}
