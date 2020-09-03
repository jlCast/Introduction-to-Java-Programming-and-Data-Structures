package chapter11_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<>();
		System.out.println("Introduzca 10 números: ");
		for(int i=0; i<10;i++) {
			list.add(input.nextInt());
		}
		removeDuplicates(list);
		System.out.print("The distincst integers are: ");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		input.close();
	}
	public static void removeDuplicates(ArrayList<Integer>list) {
		for(int i=0;i<list.size();i++) {
			for(int k=0; k<list.size();k++) {
					if(list.get(i)==list.get(k) && i!=k)
						list.remove(k);				
			}
		}
	}
}
