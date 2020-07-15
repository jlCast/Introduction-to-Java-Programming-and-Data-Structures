package chapter_10_programming_exercises;

public class Circle2D {
	private double x=0;
	private double y=0;
	private double radius=1;
	
	public Circle2D() {
		this(0,0,1);
	}
	public Circle2D(double x, double y, double radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}	
	public boolean contains(double pointX, double pointY) {
		double centersDistance=Math.sqrt(Math.pow(pointX-x,2)+Math.pow(pointY-y,2));
		return (radius>=centersDistance);		
	}
	public boolean contains(Circle2D circle) {//La distancia entre los centros es mayor que cero y menor que la diferencia entre los radios.
		double centersDistance=Math.sqrt(Math.pow(circle.x-x,2)+Math.pow(circle.y-y,2));
		return(centersDistance<0 && centersDistance<radius-circle.radius);
	}
	public boolean overlaps(Circle2D circle) {//La distancia d entre sus centros es menor que la suma de los radios y mayor que su diferencia.
		double centersDistance=Math.sqrt(Math.pow(circle.x-x,2)+Math.pow(circle.y-y,2));
		return(centersDistance<radius+circle.radius && centersDistance>radius-circle.radius);
	}
}
