package chapter_9;

public class CircleWithStaticMembers {
	double radius;
	static int numberOfObjects=0;//variable estática para controlar el número de objetos creados
	
	CircleWithStaticMembers() {//Constructor de un círculo de radio 1 por defecto
		radius=1;
		numberOfObjects++;//Incremento de la variable estática tras la creación de cada objeto				
	}
	CircleWithStaticMembers(double newRadius){//Construcotr de circulos dado un radio
		radius=newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {//Método geter para obtener el número de objetos creados
		return numberOfObjects;				
	}	
	double getArea() {//Método geter para obtener el ára del círculo
		return Math.PI*Math.pow(radius, 2);	
	}
}
