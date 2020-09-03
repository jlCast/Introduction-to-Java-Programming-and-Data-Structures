package chapter11;

import java.util.ArrayList;
import java.util.Date;

public class Test11_11_2 {

	public static void main(String[] args) {
		//11.11.2
		/*
		ArrayList <String> list = new ArrayList<>();
		list.add("Denver");
		list.add("Austin");
		//list.add(new Date());
		String city = list.get(0);
		System.out.println(city);
		//list.set(3, "Dallas");
		//System.out.println(list.get(3));
		 */
		//11.11.3
		/*
		ArrayList <String> cities = new ArrayList<>();
		cities.add("Dallas");
		cities.add("Dallas");
		cities.add("Houston");
		cities.add("Dallas");
		
		do {
			cities.remove("Dallas");
		}
		while(cities.contains("Dallas"));
		
		System.out.println(cities.toString());
		*/
		ArrayList <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(1);
		
		for(int value: list)
			System.out.println(value+" ");
	}
}

