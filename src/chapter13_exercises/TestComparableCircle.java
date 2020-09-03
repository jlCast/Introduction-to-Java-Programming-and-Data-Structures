package chapter13_exercises;

import chapter13.ComparableRectangle;
import chapter13.GeometricObject;

public class TestComparableCircle {

	public static void main(String[] args) {
		GeometricObject comparableCircle1 = new ComparableCircle(5.89);
		GeometricObject comparableCircle2 = new ComparableCircle(7.58);
		System.out.println(max(comparableCircle1,comparableCircle2));
		GeometricObject comparableRectangle = new ComparableRectangle(20.58,10.25); 
		System.out.println(max(comparableCircle1,comparableRectangle));

	}
	public static String max(GeometricObject o1, GeometricObject o2) {
		if(o1.compareTo(o2) == 1)
			return "El objeto geométrico mayor es: "+o1.toString();
		else if(o1.compareTo(o2) == -1)
			return "El objeto geométrico mayor es: "+o2.toString();
		else
			return "Los objetos son iguales";
	}

}
