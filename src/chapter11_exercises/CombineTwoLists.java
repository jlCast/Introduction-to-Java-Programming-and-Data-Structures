package chapter11_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList <Integer> list1 = new ArrayList<>();
		System.out.println("Enter five integers for list1: ");
		for(int i=0; i<5;i++) {
			list1.add(input.nextInt());
		}
		ArrayList <Integer> list2 = new ArrayList<>();
		System.out.println("Enter five integers for list2: ");
		for(int i=0; i<5;i++) {
			list2.add(input.nextInt());
		}
		System.out.print("The combined list is ");
		for(int i=0;i<union(list1,list2).size();i++) {
			System.out.print(union(list1,list2).get(i)+" ");
		}
		input.close();
	}
	public static ArrayList<Integer>union (ArrayList<Integer>list1,ArrayList<Integer>list2){
		ArrayList<Integer>union= new ArrayList<>();
		for(int i=0;i<list1.size();i++)
			union.add(list1.get(i));
		for(int i=0;i<list2.size();i++)
			union.add(list2.get(i));
		return union;
	}
}
