package chapter13;

import java.util.ArrayList;

public class CloneArrayList {
	public static void main(String[]args) {
		ArrayList<Double>list1 = new ArrayList<>();
		list1.add(1.5);
		list1.add(2.5);
		list1.add(3.5);
		ArrayList<Double>list2 =(ArrayList<Double>)list1.clone();
		ArrayList<Double>list3 =list1;
		list2.add(4.5);
		list3.remove(1.5);
		System.out.println("list1 is "+list1);//1.5,2.5
		System.out.println("list2 is "+list2);//1.5,2.5,3.5,4,5
		System.out.println("list3 is "+list3);//1.5,2.5
		
	}
}
