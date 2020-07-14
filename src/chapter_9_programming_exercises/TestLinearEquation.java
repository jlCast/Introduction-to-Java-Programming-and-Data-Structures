package chapter_9_programming_exercises;

import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, and f:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		input.close();
		LinearEquation linearEquation1=new LinearEquation(a,b,c,d,e,f);
		if(linearEquation1.isSolvable())
			System.out.println("X: "+linearEquation1.getX()+". Y: "+linearEquation1.getY());
		
		else
			System.out.println("The equation has no solution.");
	}

}
