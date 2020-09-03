package chapter11_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {
	
	public static void main(String[] args) {
		ArrayList <Integer> max1sRow = new ArrayList<>();
		ArrayList <Integer> max1sColumn = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size n: ");
		int n = input.nextInt();		
		int [][] matrix = new int[n][n];	
		
		for(int i=0; i<n ;i++) {
			for(int k=0; k<n; k++) {
				matrix[i][k] = (int)Math.round(Math.random());
				System.out.print(matrix[i][k]+" ");
			}
			System.out.println("\n");								
		}
		/*PARA MEJORAR
		int []rowsSum = new int[n];
		int []columnsSum = new int[n];
		for(int i=0; i<n ;i++) {
			int rowSum=0;
			int columnSum=0;
			for(int k=0; k<n; k++) {
				if (matrix[i][k]==1)
					rowSum++;	
				if (matrix[k][i]==1)
					columnSum++;
				columnsSum[k]=rowSum;
			}
			rowsSum[i]=rowSum;			
		}
		for(int i=0; i<n ;i++){
			System.out.println(rowsSum[i]);
			System.out.println(columnsSum[i]);
		}
		*/
		for(int i=0; i<n ;i++) {
			int rowSum=0;
			int columnSum=0;
			for(int k=0; k<n; k++) {
				if (matrix[i][k]==1)
					rowSum++;	
				if (matrix[k][i]==1)
					columnSum++;
			}
			max1sRow.add(rowSum);	
			max1sColumn.add(columnSum);	
		}
		System.out.println("The largest row index: "+max1sRow.toString());
		System.out.println("The largest column index: "+max1sColumn.toString());
	}
}
