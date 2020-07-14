package chapter_10;

import java.util.Scanner;

public class TestLoanClass {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate=input.nextDouble();
		System.out.println("Enter number of years as an integer: ");
		int numberOfYears=input.nextInt();
		System.out.println("Enter loan amount, for example, 120000.95: ");
		double loanAmount=input.nextDouble();
		
		Loan myLoan=new Loan(annualInterestRate, numberOfYears, loanAmount);
		System.out.printf("The loan was created on %s\n"+"The monthly payment is %.2f\nThe total payment is %.2f\n",
				myLoan.getLoanDate().toString(),myLoan.getMonthlyPayment(),myLoan.getTotalPayment());
		input.close();
	}
}
