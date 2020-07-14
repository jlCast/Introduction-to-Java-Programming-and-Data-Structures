package chapter_9_programming_exercises;

public class Fan {
	public static final int SLOW=1;
	public static final int MEDIUM=2;
	public static final int FAST=3;
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	String color="blue";
	
	public Fan() {		
	}
	public void setSpeed(int newSpeed) {
		speed=newSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setOn() {
		if(!on)
			on=true;
		else
			on=false;
	}
	public boolean getOn() {
		return on;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
	public String toString() {
		if(on) {
			return "Fan Speed: "+speed+". Color: "+color+". Radius: "+radius;
		}
		else
			return "Fan is off. Color: "+color+". Radius: "+radius;
	}	
}
