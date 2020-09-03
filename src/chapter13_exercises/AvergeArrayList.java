package chapter13_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class AvergeArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer>list = new ArrayList<>();
		System.out.println("Enter the integers (finish with 0):");
		int value;
		value=input.nextInt();
		while(value!= 0) {
			list.add(value);
			value = input.nextInt();
		}
		input.close();
		average(list);
	}
	public static void average (ArrayList<Integer>list) {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
		}
		System.out.println("The average of the list is: "+sum/list.size());
	}
}
