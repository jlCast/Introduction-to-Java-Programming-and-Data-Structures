package chapter_10_programming_exercises;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint point1=new MyPoint(0,0);
		MyPoint point2=new MyPoint(10,30.5);	
		System.out.println(point1.distance(point2));
		System.out.println(point1.distance(10,30.5));
		System.out.println(point2.distance(0,0));
		System.out.println(MyPoint.distance(point1,point2));
	}
}
