package chapter_9_programming_exercises;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle1= new Rectangle(4,40);
		Rectangle rectangle2= new Rectangle(3.5,35.9);
		
		System.out.println("El ancho del rectángulo 1 es "+rectangle1.width);
		System.out.println("El alto del rectángulo 1 es "+rectangle1.height);
		System.out.println("El área del rectángulo 1 es "+rectangle1.getArea());
		System.out.println("El perímetro del rectángulo 1 es "+rectangle1.getPerimeter());
		
		System.out.println("El ancho del rectángulo 2 es "+rectangle2.width);
		System.out.println("El alto del rectángulo 2 es "+rectangle2.height);
		System.out.println("El área del rectángulo 2 es "+rectangle2.getArea());
		System.out.println("El perímetro del rectángulo 2 es "+rectangle2.getPerimeter());
	}

}
