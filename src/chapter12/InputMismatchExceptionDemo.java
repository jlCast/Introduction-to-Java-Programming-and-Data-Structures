package chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.println("Enter an integer:");
				int number = input.nextInt();
				System.out.println("The number entered is "+number);
				continueInput = false;
			}
			catch(InputMismatchException ex){
				System.out.println("Try again. (incorrect input: an integer is requiered)");
				input.nextLine();
			}
		}
		while(continueInput);
	}

}
