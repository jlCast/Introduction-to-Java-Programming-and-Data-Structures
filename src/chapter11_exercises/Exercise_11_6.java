package chapter11_exercises;

import java.util.ArrayList;
import java.util.Date;

import chapter11.Circle;

public class Exercise_11_6 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		//list.add(new Loan());
		list.add(new Date());
		list.add(new String());
		list.add(new Circle());

		for(Object o:list)
			o.toString();
	}

}
