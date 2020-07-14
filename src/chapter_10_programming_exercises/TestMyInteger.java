package chapter_10_programming_exercises;

public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger myInteger1=new MyInteger(19);
		System.out.println("Is Even? "+myInteger1.isEven());
		System.out.println("Is Odd? "+myInteger1.isOdd());
		System.out.println("Is Prime? "+myInteger1.isPrime());
		
		System.out.println("Is Even? "+MyInteger.isEven(55));
		System.out.println("Is Odd? "+MyInteger.isOdd(55));
		System.out.println("Is Prime? "+MyInteger.isPrime(55));
		
		MyInteger myInteger2=new MyInteger(11985);
		System.out.println("Is Even? "+MyInteger.isEven(myInteger2));
		System.out.println("Is Odd? "+MyInteger.isOdd(myInteger2));
		System.out.println("Is Prime? "+MyInteger.isPrime(myInteger2));
		
		System.out.println("Is Equal? "+myInteger2.equals(55));
		System.out.println("Is Equal? "+myInteger2.equals(myInteger1));
		
		System.out.println(MyInteger.parseInt("1256987"));
		char []a={'1','2','5','6','9','8','7'};
		System.out.println(MyInteger.parseInt(a));		
	}
}
