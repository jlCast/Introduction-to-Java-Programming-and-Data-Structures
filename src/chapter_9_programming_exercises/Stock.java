package chapter_9_programming_exercises;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String newSymbol,String newName){
		symbol=newSymbol;
		name=newName;
	}
	double getChangePercent() {
		return (currentPrice-previousClosingPrice)/previousClosingPrice*100;
	}
}
