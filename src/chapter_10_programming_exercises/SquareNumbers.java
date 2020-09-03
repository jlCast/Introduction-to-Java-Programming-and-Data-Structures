package chapter_10_programming_exercises;

import java.math.BigInteger;

public class SquareNumbers {

	public static void main(String[] args) {
		BigInteger number=BigInteger.valueOf(Long.MAX_VALUE);	
		int count=0;
		while(count<10) {
			if(Math.sqrt(number)==0) {
				System.out.println(number);			
				count++;
			}
			number.add(BigInteger.ONE);
		}
	}
}
