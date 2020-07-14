package chapter_9_programming_exercises;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a:");
		double a=input.nextDouble();
		System.out.println("Enter b:");
		double b=input.nextDouble();
		System.out.println("Enter c:");
		double c=input.nextDouble();
		input.close();
		QuadraticEquation quadraticEquation1=new QuadraticEquation(a,b,c);
		if(quadraticEquation1.getDiscriminant()>0) {
			System.out.println("The roots are "+quadraticEquation1.getRoot1()+" y "+quadraticEquation1.getRoot2());
		}else if(quadraticEquation1.getDiscriminant()==0){
			System.out.println("The root is "+quadraticEquation1.getRoot1());
		}
		else
			System.out.println("The equation has no roots.");
	}
}
