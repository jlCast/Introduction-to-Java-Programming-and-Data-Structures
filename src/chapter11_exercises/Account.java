package chapter11_exercises;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	private String customerName;
	private ArrayList <Transaction> transactions = new ArrayList<>();
	
	public Account(){
		dateCreated = new Date();
	}
	public Account(int id, double balance){
		this();
		this.id = id;
		this.balance = balance;	
	}
	public Account(String customerName, int id, double balance){
		this(id,balance);
		this.customerName = customerName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}	
	public double getMonthlyInterestRate() {
		return (annualInterestRate/100)/12;
	}
	public double getMonthlyInterest() {
		return balance*(getMonthlyInterestRate());
	}
	public double withdraw(double amount) {
		balance-=amount;
		transactions.add(new Transaction(dateCreated,'W',amount,balance,"Withdraw"));
		return balance;
	}
	public double deposit(double amount) {
		balance+=amount;
		transactions.add(new Transaction(dateCreated,'D',amount,balance,"Deposit"));
		return balance;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
}
