package chapter11_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class BinPackingUsingFirstFit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the number of objects: ");
		int numberOfObjects = input.nextInt();
		System.out.println("Enter the weight of the objects: ");
		ArrayList <Integer> list = new ArrayList<>();
		for(int i=0; i<numberOfObjects;i++) {
			list.add(input.nextInt());
		}
		input.close();
		int containerNum=1;
		while(list.size()>0) {
			ArrayList <Integer> container = new ArrayList<>();
			container.add(list.get(0));
			list.remove(0);
			for(int k=0;k<list.size();k++) {
				int containerWeight=0;
				for(int j=0;j<container.size();j++)
					containerWeight+=container.get(j);
				if((containerWeight+list.get(k))<=10) {
					container.add(list.get(k));
					list.remove(k);
				}
			}
			System.out.print("Container "+containerNum+" contains objects with weight: ");
			for(int i=0;i<container.size();i++) {
				System.out.print(container.get(i)+" ");
			}
			System.out.println();
			containerNum++;
		}
	}
}
