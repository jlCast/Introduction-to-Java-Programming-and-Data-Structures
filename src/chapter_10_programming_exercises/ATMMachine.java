package chapter_10_programming_exercises;

import java.util.Scanner;
import chapter_9_programming_exercises.Account;

public class ATMMachine {
	public static void main(String[] args) {
		Account [] acountsArray=new Account[10];//Creamos un array con 10 cuentas
		for(int i=0;i<acountsArray.length;i++) {//Rellenamos cada posición del array con un objeto de tipo cuenta con valores iniciales de id y saldo.
			acountsArray[i]=new Account(i,100);
		}		
		boolean start=true;;
		while (start) {
			Scanner input=new Scanner(System.in);
			System.out.print("Enter an id: ");
			int id=input.nextInt();
			while(id<0||id>9){
				Scanner input2=new Scanner(System.in);
				System.out.print("Please, enter a correct id: ");
				id=input2.nextInt();
				input2.close();
			}
			input.close();
			boolean exit=false;
			do {
				switch(election()) {
				case 1:
					System.out.print("The balance is "+acountsArray[id].getBalance()+"\n");
					break;
				case 2:
					System.out.print("Enter a amount to withdraw: ");
					Scanner input2=new Scanner(System.in);
					double withdraw=input2.nextInt();
					acountsArray[id].withdraw(withdraw);
					break;
				case 3:
					System.out.print("Enter a amount to deposit: ");
					Scanner input3=new Scanner(System.in);
					double deposit=input3.nextInt();
					acountsArray[id].deposit(deposit);
					break;
				case 4:
					exit=true;
					break;
				}
			}while(!exit);	
		}		
	}
	public static int election() {
		System.out.println("\nMain Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n");
		int choice;
		do {
			System.out.print("Enter a Choice: ");
			Scanner input=new Scanner(System.in);
			choice=input.nextInt();
			input.close();
			}
		while (choice<0&&choice>4);
		return choice;
	}
}
