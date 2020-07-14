package chapter_9_programming_exercises;

import java.util.Date;

/*(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively*/

public class UseTheDateClass {

	public static void main(String[] args) {
		long time=1000;
		Date date1=new Date(time);
		
		for(int i=0;i<8;i++) {			
			System.out.println(date1.toString());
			time*=1000;
			date1.setTime(time);
		}				
	}
}
