package chapter11_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList <Double> list = new ArrayList<>();
		System.out.println("Introduzca 5 números: ");
		for(int i=0; i<5;i++) {
			list.add(input.nextDouble());
		}
		SortArrayList.sort(list);
		System.out.println("Sum: "+SortArrayList.sum(list));
		input.close();
	}
	public static void sort (ArrayList<Double>list) {
		Collections.sort(list);
		for(int i=0; i<5;i++) {
			System.out.println(list.get(i));
		}
	}		
	public static double sum (ArrayList<Double>list) {
		double sum=0;
		for(int i=0; i<5;i++) {
			sum+=list.get(i);
		}
		return sum;
	}
}
