package chapter13;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>{
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new Date();
	}
	protected GeometricObject(String color, boolean filled) {	
		dateCreated = new Date();
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "Created on "+dateCreated+"\nColor: "+color+" and filled: "+filled;
	}	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	@Override
	public int compareTo(GeometricObject o) {
		if(getArea()>o.getArea())
			return 1;
		else if (getArea()<o.getArea())
			return -1;
		else
			return 0;
	}
	public static GeometricObject max(GeometricObject o1,GeometricObject o2) {
		if(o1.compareTo(o2) > 1)
			return o1;
		else
			return o2;
	}
}
