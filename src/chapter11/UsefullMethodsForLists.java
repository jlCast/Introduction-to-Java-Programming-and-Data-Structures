package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsefullMethodsForLists {

	public static void main(String[] args) {
		//Convertir un Array en un ArrayList
		String[] array = {"Red","Greeen","Blue"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		
		for(String values:list)
			System.out.println(values);
		
		//Convertir un ArrayList en un Array
		String[] array1 = new String[list.size()];
		list.toArray(array1);
		
		//EJEMPLO
		Integer[] array3 = {3,5,95,4,15,34,3,6,5};
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(array3));
		Collections.sort(list3);//Static sort method of class Collections sort the elements on the list
		for(Integer values: list3)
			System.out.println(values);
		System.out.println(Collections.max(list3));
		System.out.println(Collections.min(list3));
		Collections.shuffle(list3);//Reordena aleatoriamentelos elmentos de la lista
		for(Integer values: list3)
			System.out.println(values);
	}

}
