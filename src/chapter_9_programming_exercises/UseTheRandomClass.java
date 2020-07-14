package chapter_9_programming_exercises;

import java.util.Random;

/*(Use the Random class) Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the nextInt(
100) method.*/

public class UseTheRandomClass {

	public static void main(String[] args) {
		Random random1=new Random(1000);
		
		for(int i=0;i<50;i++) {
			
			System.out.println(random1.nextInt(100));
		}
	}
}
