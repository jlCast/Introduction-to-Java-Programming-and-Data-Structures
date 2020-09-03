package chapter11_exercises;

import java.util.Date;

public class Transaction {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(Date date,char type,double amount, double balance,String description) {
		this.date=date;
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setType(char type) {
		this.type = type;
	}
	public char getType() {
		return type;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getdDescription() {
		return description;
	}
	
}
