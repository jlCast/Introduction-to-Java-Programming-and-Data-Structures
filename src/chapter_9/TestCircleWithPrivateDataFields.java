package chapter_9;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle os radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius()*1.1);//Increase myCircle´s radius by 10%
		System.out.println("The area of the circle os radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		System.out.println("The number of objects created is "+CircleWithPrivateDataFields.getNumberOfObjects());

	}

}
