package chapter_10_programming_exercises;

public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	public Triangle2D() {
		p1= new MyPoint(0,0);
		p2= new MyPoint(1,1);
		p3= new MyPoint(2,5);
	}
	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		p1= new MyPoint(x1,y1);
		p2= new MyPoint(x2,y2);
		p3= new MyPoint(x3,y3);	
	}
	public Triangle2D(MyPoint p1, MyPoint p2,MyPoint p3) {
		this.p1=p1;
		this.p2= p2;
		this.p3= p3;	
	}
	public MyPoint getP1() {
		return p1;
	}
	public void setP1(MyPoint p1) {
		this.p1=p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	public void setP2(MyPoint p2) {
		this.p2=p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	public void setP3(MyPoint p3) {
		this.p3=p3;
	}
	public double getPerimeter() {
		return p1.distance(p2)+p2.distance(p3)+p3.distance(p1);
	}	
	public double getArea() {
		double a=p1.distance(p2);
		double b=p2.distance(p3);
		double c=p3.distance(p1);		
		double semiperimeter=(a+b+c)/2;
		double area=Math.sqrt(semiperimeter*(semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c));
		return area;
	}
}
