package chapter_9_programming_exercises;

public class TestAccount {

	public static void main(String[] args) {
		Account acount1=new Account(1122,20000);
		acount1.setAnnualInterestRate(4.5);
		acount1.withdraw(2500);
		acount1.deposit(3000);
		System.out.println("Balance: "+acount1.getBalance()+". Monthly Interest: "+
		acount1.getMonthlyInterest()+". Date: "+acount1.getDateCreated());
	}
}
