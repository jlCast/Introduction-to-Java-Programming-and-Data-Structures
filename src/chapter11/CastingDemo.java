package chapter11;

public class CastingDemo {

	public static void main(String[] args) {
		Object object1 = new Circle(1);
		Object object2 = new Rectangle(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {
		if (object instanceof Circle) {
			System.out.println("The circle area is "+((Circle)object).getArea());
			System.out.println("The Circle diameter is "+((Circle)object).getDiameter());			
		}
		else if(object instanceof Rectangle) {
			System.out.println("The Rectangle area is "+((Rectangle)object).getArea());		
		}
	}
}
