package chapter_10_programming_exercises;

import chapter_10.StackOfIntegers;

public class DisplayThePrimeNumbers {

	public static void main(String[] args) {
		StackOfIntegers primeNumbers =new StackOfIntegers();
		int num=120;
		for(int i=num; i>1;i--) {
			if(isPrime(i))			
				primeNumbers.push(i);	
		}	
		int size=primeNumbers.getSize();
		for(int i=0;i<size;i++) {
			if(i==size-1)
				System.out.println(primeNumbers.pop());
			else
				System.out.print(primeNumbers.pop()+", ");				
		}
	}
	public static boolean isPrime(int value) {
		boolean result=true;
		for(int i=value-1;i>1;i--) {
			if(value%i==0) {
				result=false;
				break;
			}
		}
		return result;
	}
}