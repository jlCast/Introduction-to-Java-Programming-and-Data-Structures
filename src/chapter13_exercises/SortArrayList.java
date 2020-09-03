package chapter13_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Number>list = new ArrayList<>();
		System.out.println("Enter the numbers (finish with 0):");
		int value;
		value=input.nextInt();
		while(value!= 0) {
			list.add(value);
			value = input.nextInt();
		}

		shuffle(list);
		for(int i=0;i<list.size();i++) 
			System.out.print(list.get(i)+" ");

		sort(list);
		for(int i=0;i<list.size();i++) 
			System.out.print(list.get(i)+" ");

	}
	public static void sort(ArrayList<Number>list) {
		for(int i=0;i<list.size();i++) {
			for(int k=1;k<list.size();k++) {
				if(list.get(i).doubleValue()>list.get(k).doubleValue()) {
					double aux = list.get(i).doubleValue();
					list.set(i, list.get(k));
					list.set(k, aux);
				}									
			}				
		}
	}
	public static void shuffle(ArrayList<Number>list) {
		for(int i=0;i<list.size();i++) {
			int index= (int)(Math.random()* list.size());
			Number temp=list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}		
	}
}
