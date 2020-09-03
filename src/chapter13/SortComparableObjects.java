package chapter13;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {

	public static void main(String[] args) {
		String []cities = {"Savannah","Boston","Atlanta","Tampa"};
		Arrays.sort(cities);
		for(String city: cities)	
			System.out.print(city+" ");
		System.out.println();
		
		BigInteger[] hugeNumbers = {new BigInteger("155495985656564545"),
				new BigInteger("558544454546564545"),
				new BigInteger("5585445655645656565")};
		Arrays.sort(hugeNumbers);
		for(BigInteger number: hugeNumbers)	
			System.out.print(number+" ");
		System.out.println();
	}

}
