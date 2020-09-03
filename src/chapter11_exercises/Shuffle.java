package chapter11_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter a sequence of numbers (enging with 0):");
		int value;
		value = input.nextInt();
		while(value!=0) {		
			list.add(value);
			value = input.nextInt();
		}
		Shuffle.shuffle(list);
		for(int o:list)
			System.out.println(o);

	}
	public static void shuffle(ArrayList <Integer> list) {
		Collections.shuffle(list);
	}

}
