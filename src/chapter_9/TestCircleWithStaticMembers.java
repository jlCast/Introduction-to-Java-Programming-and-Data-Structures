package chapter_9;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("Antes de crear los objetos");
		System.out.println("El n�mero de objetos es "+CircleWithStaticMembers.numberOfObjects);

		CircleWithStaticMembers c1= new CircleWithStaticMembers();//Creamos el primer objeto de la clase
		System.out.println("Despu�s de crear c1");
		System.out.println("El radio de c1 es: "+c1.radius+" y el n�mero de obejtos es: "+c1.numberOfObjects);//accedemos a la variable est�tica desde el objeto creado.
	
		CircleWithStaticMembers c2= new CircleWithStaticMembers(5);//Creamos el segundo objeto de la clase con el otro constructor
		
		c1.radius=9;//Modificamos el valor del radio del objeto c1 (variable no encapsulada)
		
		System.out.println("Despu�s de modificar c1 y de crear c2");
		System.out.println("El radio de c1 es: "+c1.radius+" y el n�mero de objetos es: "+c1.numberOfObjects);
		System.out.println("El radio de c2 es: "+c2.radius+" y el n�mero de objetos es: "+c1.numberOfObjects);
	}

}
