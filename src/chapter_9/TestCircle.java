package chapter_9;

public class TestCircle {
	//Pag 348 Listing 9.1 y 9.2
	public static void main(String[] args) {
		//Creamos un c�rculo con radio 1
		Circle circle1= new Circle(1);//Invocamos al constructor de la clase Circle pasando por par�metros el valor del radio
		//Sacamos por consola los datos de �rea y per�metro correspondientes a este objeto creado
		System.out.println("El �rea del c�rculo con radio: "+circle1.radius+" es"+circle1.getArea());
		//Creamos un nuevo c�rculo con radio 25
		Circle circle2=new Circle(25);
		System.out.println("El �rea del c�rculo con radio: "+circle2.radius+" es"+circle2.getArea());
		//Creamos un nuevo c�rculo con radio 125
		Circle circle3=new Circle(125);
		System.out.println("El �rea del c�rculo con radio: "+circle3.radius+" es"+circle3.getArea());
		//Modificamos el radio del c�rculo mediante el m�todo setter creado
		circle2.radius=100;//podemos modificar el valor del radio al no estar definida la variable como private
		System.out.println("El �rea del c�rculo con radio: "+circle2.radius+" es"+circle2.getArea());
		//Lo correcto ser�a estalecer la variable radius como private y modificarla desde el m�todo main mediante el m�todo setRadius creado
		circle2.setRadius(100);
		System.out.println("El �rea del c�rculo con radio: "+circle2.radius+" es"+circle2.getArea());
	}

}
