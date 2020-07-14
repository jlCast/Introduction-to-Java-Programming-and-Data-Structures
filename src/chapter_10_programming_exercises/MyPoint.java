package chapter_10_programming_exercises;

public class MyPoint {
	private double x=0;
	private double y=0;
	
	public MyPoint() {		
	}
	public MyPoint(double x, double y) {	
		this.x=x;
		this.y=y;
	}	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double distance(MyPoint p2) {
		return distance(this,p2);
	}
	public double distance(double x2, double y2) {
		MyPoint p2=new MyPoint(x2,y2);
		return distance(this,p2);		
	}
	public static double distance(MyPoint p1, MyPoint p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)* (p1.y - p2.y));
	}
}
