package chapter_10_programming_exercises;

import java.math.BigDecimal;

public class DivisibleBy2Or3 {
	
	public static void main(String[]args) {
		BigDecimal number= new BigDecimal ("0.00001");
		BigDecimal divisor1= new BigDecimal("2");
		BigDecimal divisor2= new BigDecimal("3");
		System.out.println(number.remainder(divisor1));
		System.out.println(number.remainder(divisor2));
		int counter=0;
		/*
		while(counter<=10) {			
			if (number.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO) || 
					number.remainder(new BigDecimal(3)).equals(BigDecimal.ZERO)) {
				System.out.printf("%.5f",number);
				counter++;
			}
			System.out.println(number);
			number=number.add(new BigDecimal("0.00001"));
		}
		*/
	}
}
