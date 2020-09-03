package chapter11_exercises;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first side of the triangle: ");	
		double side1 = sc.nextDouble();
		System.out.println("Enter the second side of the triangle: ");	
		double side2 = sc.nextDouble();
		System.out.println("Enter the third side of the triangle: ");	
		double side3 = sc.nextDouble();
		System.out.println("Enter the color of the triangle: ");	
		String color = sc.next();
		System.out.println("is filled?(True/False): ");	
		boolean filled = sc.nextBoolean();
		
		Triangle triangle = new Triangle(side1,side2,side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println("The area of the triangle is: "+triangle.getArea());
		System.out.println("The perimeter of the triangle is: "+triangle.getPerimeter());
		System.out.println("The color of the triangle is: "+triangle.getColor());
		System.out.println("The triangle is filled : "+triangle.isFilled());	
		sc.close();
	}
}
