package chapter_9_programming_exercises;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		int newRows=1;
		int newColumns=1;
		
		System.out.println("Enter the number of rows and columns in the array");
		Scanner input=new Scanner(System.in);
		newRows=input.nextInt();
		newColumns=input.nextInt();		
		Location [][] array= new Location[newRows][newColumns];
		
		System.out.println("Enter the array:");
		for(int i=0;i<newRows;i++) {
			for (int j=0;j<newColumns;j++) {
				double newMaxValue=input.nextDouble();
				array[i][j]=new Location (i,j,newMaxValue);
			}
		}
		System.out.println(Location.locateLargest(array));
		input.close();
	}	
}
