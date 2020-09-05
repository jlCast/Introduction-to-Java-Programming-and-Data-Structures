package chapter13_exercises;

public class TestOctagon {

	public static void main(String[] args) {
		Octagon octagon1 = new Octagon(5);
		System.out.println("Octagon area: "+octagon1.getArea());
		System.out.println("Octagon perimeter: "+octagon1.getPerimeter());
		Octagon octagon2 = (Octagon)octagon1.clone();
		System.out.println(octagon1.compareTo(octagon2));
	}
}
