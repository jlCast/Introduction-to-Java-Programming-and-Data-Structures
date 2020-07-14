package chapter_10_programming_exercises;

import java.util.Scanner;
import chapter_10.StackOfIntegers;

public class DisplayThePrimeFactors {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int integer=input.nextInt();
		input.close();
		StackOfIntegers primeFactors =new StackOfIntegers();
		for(int i=2;i<=integer;i++) {
			while(integer%i==0) {
				primeFactors.push(i);				
				integer=integer/i;	
			}
		}
		int size=primeFactors.getSize();
		for(int i=0;i<size;i++) {
			if(i==size-1)
				System.out.println(primeFactors.pop());
			else
				System.out.print(primeFactors.pop()+", ");				
		}
	}
}
