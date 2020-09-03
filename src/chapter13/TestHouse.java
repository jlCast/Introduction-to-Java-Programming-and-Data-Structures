package chapter13;

public class TestHouse {

	public static void main(String[] args) {
		House house = new House(1256,12568.95);
		House house1 = (House)house.clone();
	}
}
