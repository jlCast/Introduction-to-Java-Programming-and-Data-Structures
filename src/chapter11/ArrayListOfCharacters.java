package chapter11;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase;
		System.out.println("Introduzca una frase: ");
		frase = input.nextLine();
		System.out.print("The characters are: ");
		for(int i=0;i<toCharacterArray(frase).size();i++) {
			System.out.print("'"+toCharacterArray(frase).get(i)+"'"+",");
		}
		input.close();
	}
	public static ArrayList<Character> toCharacterArray(String s){
		ArrayList<Character> list = new ArrayList<>();
		char[] chars= s.toCharArray();
		for(int i=0;i<chars.length;i++) {
			list.add(chars[i]);
		}
		return list;
	}
}
