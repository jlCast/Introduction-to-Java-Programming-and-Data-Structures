package chapter11;

public class Test11_10_02 {

	public static void main(String[] args) {
		Object circle20 = new Circle1();
		Object circle21 = new Circle1();
		System.out.println(circle20.equals(circle21));
	}
}
class Circle1{
	double radius;
	
	@Override
	public boolean equals(Object circle) {
		return this.radius==((Circle1)circle).radius;		
	}
}