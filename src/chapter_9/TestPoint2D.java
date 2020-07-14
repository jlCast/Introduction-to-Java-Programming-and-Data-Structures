package chapter_9;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class TestPoint2D {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Introduce x e y del punto 1.");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		
		System.out.println("Introduce x e y del punto 2.");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		Point2D p1=new Point2D.Double(x1,y1);
		Point2D p2=new Point2D.Double(x2,y2);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println("La distancia entre el punto 1 y el 2 es: "+p1.distance(p2)+".");
		
		/*
		System.out.println("El punto medio entre el punto 1 y el 2 es: "+p1.midpoint(p2)+".");
		*/
		
		input.close();
	}

}
