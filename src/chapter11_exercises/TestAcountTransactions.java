package chapter11_exercises;

import java.util.ArrayList;

public class TestAcountTransactions {

	public static void main(String[] args) {
		Account account1 = new Account("George",1122,1000);
		account1.setAnnualInterestRate(1.5);
		account1.deposit(30);
		account1.deposit(40);
		account1.deposit(50);
		account1.withdraw(5);
		account1.withdraw(4);
		account1.withdraw(2);
		
		System.out.println("Account Summary: ");
		System.out.println("Customer name: "+account1.getCustomerName());
		System.out.println("Interest rate: "+account1.getAnnualInterestRate());
		System.out.println("Balance: "+account1.getBalance());
		System.out.println("Transactions: ");
		
		ArrayList <Transaction> list = account1.getTransactions();
		
		for(Transaction t:list)
			System.out.println("Date: "+t.getDate()+". Type: "+t.getType()+". Amount: "+t.getAmount()+". Balance: "+t.getBalance());
	}

}
