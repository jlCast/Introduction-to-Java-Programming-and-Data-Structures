package chapter11;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList <String> cityList = new ArrayList<>();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("París");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("List size? "+cityList.size());
		System.out.println("Is Miami in the list? "+cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? "+cityList.indexOf("Denver"));
		System.out.println("Is the list empty? "+cityList.isEmpty());
		
		cityList.add(2, "Xian");
		cityList.remove("Miami");
		cityList.remove(1);
		
		System.out.println(cityList.toString());
		for (int i=cityList.size()-1;i>=0;i--)
			System.out.println(cityList.get(i)+" ");
		System.out.println();
		
		ArrayList<Circle> circleList = new ArrayList<>();
		circleList.add(new Circle(2));
		circleList.add(new Circle(3));
		System.out.println("The area of the circle is "+circleList.get(0).getArea());

	}

}
