package chapter_10;

public class MyString1 {
	private String string;
	
	public MyString1(char[]chars) {	//Constructor
		string = new String(chars);
	}
	public char charAt(int index) {
		return string.charAt(index);
	}
	public int length(){
		return string.length();
	}
	public MyString1 Substring(int begin, int end) {
		return string.getChars(begin, end, string, 0);
	}
	public MyString1 toLowerCase() {
		return string.toLowerCase();
	}
	public boolean equals(MyString1 s) {
		return string.equals(s);
	}
	public static MyString1 valueOf(int i) {
		return string.valueOf();
	}
	
	
	public static void main(String[] args) {
		MyString1 newstring = new MyString1(new char[]{'W','e','l','c','o','m','e',' ','t','o',' ','J','a','v','a'});
		System.out.println(newstring.charAt(5));
		System.out.println(newstring.length());
		
		
	}
	
}
