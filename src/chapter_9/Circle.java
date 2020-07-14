package chapter_9;

public class Circle {
	double radius=1;
	
	Circle(){//Constructor de la clase Circle sin parametros de entrada
	}
	Circle(double newRadius){//Constructor de la clase Circle con parámetros de entrada
	radius=newRadius;
	}

	//Metodos Getter para obtener el área y el perímetro del círculo
	double getArea() {
		return radius*radius*Math.PI;		
	}
	double getPerimeter() {
		return 2*Math.PI*radius;
	}
	//Método Setter para establecer un nuevo rádio
	void setRadius(double newRadius) {
		radius=newRadius;
		
	}
}
