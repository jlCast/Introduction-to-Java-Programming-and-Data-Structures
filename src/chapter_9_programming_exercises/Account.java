package chapter_9_programming_exercises;

import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private String dateCreated;
	
	public Account(){//Constructor 1	
	}
	public Account(int id,double balance){//Constructor 2
		this.id=id;
		this.balance=balance;
		Date dateObject=new Date();
		dateCreated=dateObject.toString();
	}	
	public void setId(int id) {//M�todo seter para id.
		this.id=id;
	}
	public int getId() {//M�todo geter para id.
		return id;
	}
	public void setBalance(double balance) {//M�todo seter para balance.
		this.balance=balance;
	}
	public double getBalance() {//M�todo geter para balance.
		return balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {//M�todo seter para annualInterestRate.
		this.annualInterestRate=annualInterestRate/100;//Para obtenerlo en porcentaje
	}
	public double getAnnualInterestRate() {//M�todo geter para balance.
		return annualInterestRate;
	}
	public String getDateCreated() {//M�todo geter para dateCreated.
		return dateCreated;
	}	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	public void withdraw(double amount) {
		balance-=amount;		
	}
	public void deposit(double amount) {
		balance+=amount;		
	}		
}
