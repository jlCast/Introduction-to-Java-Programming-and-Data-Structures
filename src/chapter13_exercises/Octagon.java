package chapter13_exercises;

import chapter13.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<GeometricObject>, Cloneable   {
	private double side;
	
	public Octagon() {
		this(0);
	}	
	public Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getArea() {
		return (2+4/Math.sqrt(2))*Math.pow(side, 2);
	}
	public double getPerimeter() {
		return 8*side;
	}
	@Override
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;	
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Octagon)
			return getArea() == ((Octagon)o).getArea();
		else
			return false;
	}
	@Override
	public Object clone() {
		try {
			return super.clone();				
		}
		catch(CloneNotSupportedException ex) {
			return null;
		}		
	}
}
