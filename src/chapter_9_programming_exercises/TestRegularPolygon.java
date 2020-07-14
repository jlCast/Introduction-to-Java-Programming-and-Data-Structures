package chapter_9_programming_exercises;

public class TestRegularPolygon {

	public static void main(String[] args) {
		RegularPolygon regularPolygon1=new RegularPolygon();
		RegularPolygon regularPolygon2=new RegularPolygon(6,4);
		RegularPolygon regularPolygon3=new RegularPolygon(10,4,5.6,7.8);
		System.out.println("Objeto 1: Perímetro: "+regularPolygon1.getPerimeter()+". Área: "+regularPolygon1.getArea());
		System.out.println("Objeto 2: Perímetro: "+regularPolygon2.getPerimeter()+". Área: "+regularPolygon2.getArea());
		System.out.println("Objeto 3: Perímetro: "+regularPolygon3.getPerimeter()+". Área: "+regularPolygon3.getArea());
	}
}
