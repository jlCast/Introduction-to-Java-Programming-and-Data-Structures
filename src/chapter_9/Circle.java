package chapter_9;

public class Circle {
	double radius=1;
	
	Circle(){//Constructor de la clase Circle sin parametros de entrada
	}
	Circle(double newRadius){//Constructor de la clase Circle con par�metros de entrada
	radius=newRadius;
	}

	//Metodos Getter para obtener el �rea y el per�metro del c�rculo
	double getArea() {
		return radius*radius*Math.PI;		
	}
	double getPerimeter() {
		return 2*Math.PI*radius;
	}
	//M�todo Setter para establecer un nuevo r�dio
	void setRadius(double newRadius) {
		radius=newRadius;
		
	}
}
