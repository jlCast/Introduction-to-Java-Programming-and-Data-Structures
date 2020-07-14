package chapter_9;

public class CircleWithStaticMembers {
	double radius;
	static int numberOfObjects=0;//variable est�tica para controlar el n�mero de objetos creados
	
	CircleWithStaticMembers() {//Constructor de un c�rculo de radio 1 por defecto
		radius=1;
		numberOfObjects++;//Incremento de la variable est�tica tras la creaci�n de cada objeto				
	}
	CircleWithStaticMembers(double newRadius){//Construcotr de circulos dado un radio
		radius=newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {//M�todo geter para obtener el n�mero de objetos creados
		return numberOfObjects;				
	}	
	double getArea() {//M�todo geter para obtener el �ra del c�rculo
		return Math.PI*Math.pow(radius, 2);	
	}
}
