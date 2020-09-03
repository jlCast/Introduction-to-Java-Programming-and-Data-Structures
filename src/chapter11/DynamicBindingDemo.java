package chapter11;

public class DynamicBindingDemo {

	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student1());
		m(new Person1());
		m(new Object());	
	}
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}
class Person1 extends Object{
	@Override
	public String toString() {
		return "Person1";
	}		
}
class Student1 extends Person1{
	@Override
	public String toString() {
		return "Student1";
	}
}
class GraduateStudent extends Student1{
}