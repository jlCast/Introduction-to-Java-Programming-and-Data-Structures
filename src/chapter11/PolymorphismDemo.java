package chapter11;

public class PolymorphismDemo {
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on: "+object.getDateCreated()+". Color: "+object.getColor());			
}
	public static void main(String[] args) {
		displayObject(new Circle(1,"Red",false));
		displayObject(new Rectangle(1,1,"Black",true));
	}
}
