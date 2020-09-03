package chapter11_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter a sequence of numbers (ending with 0):");
		int value;
		value = input.nextInt();
		while(value!=0) {		
			list.add(value);
			value = input.nextInt();
		}		
		System.out.println("The largest number in the ouptput is: "+max(list));
		input.close();

	}
	public static Integer max(ArrayList<Integer>list) {
		if(!list.isEmpty() || list==null) {
			Collections.sort(list);
			return list.get(list.size()-1);
		}
		else
			return null;
	}
}
