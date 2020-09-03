package chapter11;

public class Test11_8_5 {

	public static void main(String[] args) {
		new Person2().printPerson();//Person2
		new Student2().printPerson();//Student2
	}	
}
class Student2 extends Person2{
	@Override
	public String getInfo() {
		return "Student2";
	}
}
class Person2{
	public String getInfo() {
		return "Person2";
	}
	public void printPerson() {
		System.out.println(getInfo());
	}
}