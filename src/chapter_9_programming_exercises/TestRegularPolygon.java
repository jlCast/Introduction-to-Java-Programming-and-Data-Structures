package chapter_9_programming_exercises;

public class TestRegularPolygon {

	public static void main(String[] args) {
		RegularPolygon regularPolygon1=new RegularPolygon();
		RegularPolygon regularPolygon2=new RegularPolygon(6,4);
		RegularPolygon regularPolygon3=new RegularPolygon(10,4,5.6,7.8);
		System.out.println("Objeto 1: Per�metro: "+regularPolygon1.getPerimeter()+". �rea: "+regularPolygon1.getArea());
		System.out.println("Objeto 2: Per�metro: "+regularPolygon2.getPerimeter()+". �rea: "+regularPolygon2.getArea());
		System.out.println("Objeto 3: Per�metro: "+regularPolygon3.getPerimeter()+". �rea: "+regularPolygon3.getArea());
	}
}
