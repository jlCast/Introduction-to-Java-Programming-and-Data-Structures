package chapter_9_programming_exercises;

public class TestStock {

	public static void main(String[] args) {
		Stock stock1= new Stock("ORCL","Oracle Corporation");
		stock1.previousClosingPrice=34.5;
		stock1.currentPrice=34.35;
		System.out.println(stock1.name+" "+stock1.symbol+" "+stock1.getChangePercent());				
	}	
}
