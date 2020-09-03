package chapter11_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class AditionalQuiz {

	public static void main(String[] args) {
		int num1= (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		ArrayList<Integer> listOfAnswers = new ArrayList<>();
		Scanner input = new Scanner (System.in);
		System.out.println("What is "+num1+" + "+num2+"?");
		int answer = input.nextInt();		
		while(answer!= (num1+num2)){
				if(listOfAnswers.contains(answer))
					System.out.println("You already entered "+answer);
				listOfAnswers.add(answer);
				System.out.println("Wrong answer. Try again. What is "+num1+" + "+num2+"?");
				answer = input.nextInt();
		}
		System.out.println("You got it!");
		input.close();
	}

}
