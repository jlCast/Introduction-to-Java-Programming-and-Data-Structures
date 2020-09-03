package chapter_10;

public class section10_10 {
	public static void main(String[] args) {
		
	//10.10.1 Constructing a String
	String message = new String("Welcome to Java");
	//Equivale a 
	String message1 ="Welcome to Java";//Java trata un string literal como un objeto de tipo String
	//También posible
	char[] charArray = {'W','e','l','c','o','m','e',' ','t','o',' ','J','a','v','a'};
	String message2= new String(charArray);
	
	//10.10.2 Inmutable Strings and Interned Strings
	String s = "Java";
	//s = "HTML";Esta asignación no cambia el valor almacenado, crea un nuevo objeto string y asigna su referencia a s.
	//El primer string todvía existe pero ya no es accesible.
	String s1="Welcome to Java";
	String s2= new String ("Welcome to Java");
	String s3="Welcome to Java";
	/*JVM usa una única instancia para literales de Strings con la misma secuencia de caracteres, de manera 
	que s1 y s3 apuntan a una misma única instancia*/
	System.out.println("s1 == s2 is "+(s1==s2));//False- Se refieren a difentes objetos String aunque tengan el mismo contenido
	System.out.println("s1 == s3 is "+(s1==s3));//True. Se refieren al mismo objeto String
	
	//10.10.3 Replacing and Spliting Strings
	/*Métodos replace, replaceFirst and replaceAll de la clase String. Dado que una vez un string es creado
	 * su contenido no puede ser cambiado estos métodos devuelven un nuevo string derivado del contenido del original(sin
	 * modificar el original)*/
	System.out.println("Welcome".replace('e','a'));
	System.out.println("Welcome".replaceFirst("e","AB"));
	System.out.println("Welcome".replace("e","AB"));
	System.out.println("Welcome".replace("el","AB"));
	//El método split sirve para extraer tokens de un String a partir de delimitadores
	String[]tokens="Java#HTML#Per1".split("#");
	for(int i=0;i<tokens.length;i++)
		System.out.print(tokens[i]+" ");
	
	//10.10.4 Matching, Replacing and Splitting by Patterns
	//Metodo matches de la clase String. Evalua si elcontenido de un string se corresponde con un patron dado
	"Java is fun".matches("Java.*");//true
	"Java is cool".matches("Java.*");//true
	"Java is powerfull".matches("Java.*");//true
	//Java.* representa un patrón que comienza por Java seguido de cualesquiera cero o más caracteres.
	"440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}");
	//\\d representa un dígito \\d{3} representa 3 dígitos
	String s4="a+b$#c".replaceAll("[$+#]", "NNN");
	System.out.println(s4);
	//La expresión regular [$+#] especifica un patrón
	String[] tokens1 = "Java,C?C#,C++".split("[.,:;?]");
	for(int i=0;i<tokens1.length;i++)
		System.out.println(tokens1[i]);
	//La expresión regular [.,:;?] especifica un patrón que son los caracteres usados como delimitadores para partir el String
	
	//10.10.5 Conversion betwen Arrays y String
	//Un String no es un Array -> toCharArray
	char[] chars="Java".toCharArray();//Convertir String en un Array
	//Método getChars->copia un substring de un string
	char[]dst= {'J','A','V','A','1','3','0','1'};
	//copiamos el string "CS3720" desde el índie 2 al 6 en el string dst empezando por el índice 4 -> JAVA3720
	"CS3720".getChars(2, 6, dst, 4);
	//Convertir un array de carcteres en un String->String(char[]) constructor
	String str = new String(new char[] {'J','A','V','A'});
	//Convertir un array de carcteres en un String-> método valueOf
	String str2=String.valueOf(new char[] {'J','A','V','A'});
	
	//10.10.6 Converting characters and numeric values to Strings
	//Método valueOf->convierte un caracter o un aray de caracteres en un String
	String.valueOf(5.44);//Ejemplo de un valor double
	
	//10.10.7 Fomatting Strings
	//Método format de la clase String -> similar a printf
	String str3 = String.format("%7.2f%6d%-4s", 45.556,14,"AB");
	System.out.println(str3);
	
	//EX10.10.1
	String ss1 = "Welcome to Java";
	String ss2 = ss1;
	String ss3 = new String ("Welcome to Java");
	String ss4 = "Welcome to Java";	
	System.out.println(ss1==ss2);//True
	System.out.println(ss1==ss3);//False
	System.out.println(ss1==ss4);//True
	System.out.println(ss1.equals(ss3));//True
	System.out.println(ss1.equals(ss4));//True
	System.out.println("Welcome to Java".replace("Java", "HTML"));//Welcome to HTML
	System.out.println(ss1.replace('o', 'T'));//WelcTme tT Java
	System.out.println(ss1.replaceAll("o", "T"));//WelcTme tT Java
	System.out.println(ss1.replaceFirst("o", "T"));//WelcTme to Java
	System.out.println(ss1.toCharArray());//Welcome to Java
	
	//EX10.10.3	
	String s10 = "Welcome to Java";
	String s11 = s10.replace("o", "abc");
	System.out.println(s10);//Welcome to Java
	System.out.println(s11);//Welcabcme tabc Java
	
	//EX10.10.4	
	String s12= new String ("Welcome");
	String s13= new String ("welcome");
	String s14 = s12.replaceAll("e", "E");
	System.out.println(s14);
	String []tokens2 = "Welcome to Java and HTML".split(" ");
	String s15 = tokens2[0];
	System.out.println(s15);
	String s16 = tokens2[1];
	System.out.println(s16);
	
	//EX10.10.6
	String s17 = new String();
	System.out.println(s17.length());//0
	
	//EX10.10.10
	System.out.println("Hi, ABC, good".matches("ABC "));//FALSE
	System.out.println("Hi, ABC, good".matches(".*ABC.*"));//TRUE
	System.out.println("A,B;C".replaceAll(",;","#"));//A,B;C
	System.out.println("A,B;C".replaceAll("[,;]","#"));//A#B#C
	String [] tokens4 = "A,B;C".split("[,;]");
	for(int i=0;i<tokens4.length;i++)
		System.out.println(tokens4[i]+" ");
	
	//10.11 The StringBuilder and StringBuffer Classes
	//Lo dejo para otro momento

	
	
	
	
	
	}							
}
