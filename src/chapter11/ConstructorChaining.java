package chapter11;

public class ConstructorChaining extends Employee{
	
	public static void main(String[] args) {
		new ConstructorChaining();
	}
	public ConstructorChaining() {
		System.out.println("(4) Performs Faculty큦 tasks");
	}
}
class Employee extends Person{
	public Employee(String s) {
		System.out.println(s);
	}
	public Employee() {
		this("(2) Invoke Employee큦 overloaded constructor.");
		System.out.println("(3) Performs Employee큦 tasks.");
	}
}
class Person{
	public Person() {
		System.out.println("(1) Performs Person큦 tasks.");
	}
}