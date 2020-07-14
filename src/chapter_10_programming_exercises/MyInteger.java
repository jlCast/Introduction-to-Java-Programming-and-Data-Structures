package chapter_10_programming_exercises;

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		return value%2==0;
	}
	public boolean isOdd() {
		return value%2!= 0;
	}
	public boolean isPrime() {
		boolean result=true;
		for(int i=value-1;i>1;i--) {
			if(value%i==0) {
				result=false;
				break;
			}
		}
		return result;
	}
	public static boolean isEven(int value) {
		return value%2==0;
	}
	public static boolean isOdd(int value) {
		return value%2!= 0;
	}
	public static boolean isPrime(int value) {
		boolean result=true;
		for(int i=value-1;i>1;i--) {
			if(value%i==0) {
				result=false;
				break;
			}
		}
		return result;
	}
	
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.value%2==0;
	}
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.value%2!= 0;
	}
	public static boolean isPrime(MyInteger myInteger) {
		boolean result=true;
		for(int i=myInteger.value-1;i>1;i--) {
			if(myInteger.value%i==0) {
				result=false;
				break;
			}
		}
		return result;
	}

	public boolean equals(int value) {
		return this.value==value;
	}
	public boolean equals(MyInteger myInteger) {
		return myInteger.value==value;
	}
	public static int parseInt(char[] charArray) {
		int result=0;
		for(int i=0;i<charArray.length;i++) {
			result=result*10+(charArray[i]-'0');
		}
		return result;
	}

	public static int parseInt(String numericString) {
		int number=Integer.parseInt(numericString);
		return number;
	}
	
}
