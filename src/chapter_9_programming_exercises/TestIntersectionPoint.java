package chapter_9_programming_exercises;

import java.util.Scanner;

public class TestIntersectionPoint {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The two endpoints (x1,y1) and (x2,y2) for the first line segment: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		System.out.println("Enter The two endpoints (x3,y3) and (x4,y4) for the second line segment: ");
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		double x4=input.nextDouble();
		double y4=input.nextDouble();
		
		double a=(y1-y2);
		double b=(-x1+x2);
		double c=(y3-y4);
		double d=(-x3+x4);
		double e=-y1 * (x1 - x2) + (y1 - y2) * x1;;
		double f=-y3 * (x3 - x4) + (y3 - y4) * x3;
		
		LinearEquation linearEquation1=new LinearEquation(a,b,c,d,e,f);
		
		if(linearEquation1.isSolvable())
			System.out.println("X: "+linearEquation1.getX()+". Y: "+linearEquation1.getY());
		
		else
			System.out.println("The equation has no solution.");
		
		input.close();
	}

}
