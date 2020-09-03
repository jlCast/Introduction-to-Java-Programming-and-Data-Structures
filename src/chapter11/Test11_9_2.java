package chapter11;

public class Test11_9_2 {

	public static void main(String[] args) {
		Circle circle10 = new Circle(1);
		GeometricObject object10 = new GeometricObject();
		
		System.out.println(circle10 instanceof GeometricObject);//true
		System.out.println(object10 instanceof GeometricObject);//true
		System.out.println(circle10 instanceof Circle);//true
		System.out.println(object10 instanceof Circle);//false
		
		Circle circle11 = new Circle(5);
		GeometricObject object11 = circle11;
		
		//No compila ya que un objeto de tipo GeometricObject no es una instancia de Circle
		/*
		GeometricObject object12 = new GeometricObject();
		Circle circle12 = (Circle)object12;
		*/
		//No compila. NO es poible convertir de GeometricObject a Circle;
		/*
		Circle circle12 = new GeometricObject();
		*/
		GeometricObject object12 = new Circle (1);
		
	}

}
