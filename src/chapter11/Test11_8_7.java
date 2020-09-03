package chapter11;

public class Test11_8_7 {

	public static void main(String[] args) {
		new A();//i from A is 40
		new B();//i from A is 60 , i from B is 60 ->Constructor chaining
	}
}
class A{
	int i=7;
	
	public A() {
		setI(20);
		System.out.println("i from A is "+i);
	}
	public void setI(int i) {
		this.i=i*2;
	}
}
class B extends A{
	public B() {
		System.out.println("i from B is "+i);
	}
	@Override
	public void setI(int i) {
		this.i=i*3;
	}
}