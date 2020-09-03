package chapter13_exercises;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the three sides of the triangle: ");
		double side1= input.nextDouble();
		double side2= input.nextDouble();
		double side3= input.nextDouble();
		Triangle triangle1 = new Triangle(side1,side2,side3);
		System.out.println("Enter the color of the triangle: ");
		String color = input.next();
		triangle1.setColor(color);
		System.out.println("Is filled?: ");
		boolean filled = input.nextBoolean();
		triangle1.setFilled(filled);
		input.close();
		
		System.out.println("The area of the triangle is: "+triangle1.getArea());
		System.out.println("The perimeter of the triangle is: "+triangle1.getPerimeter());
		System.out.println("The perimeter of the triangle is: "+triangle1.getPerimeter());
		System.out.println("The color of the triangle is: "+triangle1.getColor());
		System.out.println("The  triangle is filled: "+triangle1.isFilled());
	}
}
