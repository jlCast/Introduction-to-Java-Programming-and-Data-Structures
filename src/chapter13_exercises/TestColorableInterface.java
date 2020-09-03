package chapter13_exercises;

import chapter13.Circle;
import chapter13.ComparableRectangle;
import chapter13.GeometricObject;
import chapter13.Rectangle;

public class TestColorableInterface {

	public static void main(String[] args) {
		GeometricObject [] geometricobjectslist = new GeometricObject[5];
		geometricobjectslist[0] = new Circle(3.5);
		geometricobjectslist[1] = new Rectangle(5.2, 2.1);
		geometricobjectslist[2] = new Square(1.75);
		geometricobjectslist[3] = new ComparableCircle(1.5);
		geometricobjectslist[4] = new ComparableRectangle(3.2, 4.1);
		
		for(GeometricObject o: geometricobjectslist) {
			System.out.println("Object: "+o.toString()+". Area :"+o.getArea());
			if(o instanceof Colorable) {
				System.out.print("How to color?: ");
				((Colorable)o).howToColor();
			}
		}		
	}
}
