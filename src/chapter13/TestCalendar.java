package chapter13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println("Current time is  "+new Date());
		System.out.println("YEAR: "+calendar.get(calendar.YEAR));
		System.out.println("MONTH: "+calendar.get(calendar.MONTH));
		System.out.println("DATE: "+calendar.get(calendar.DATE));
		System.out.println("HOUR: "+calendar.get(calendar.HOUR));
		System.out.println("HOUR OF DAY: "+calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: "+calendar.get(calendar.MINUTE));
		System.out.println("SECOND: "+calendar.get(calendar.SECOND));
		System.out.println("DAY OF WEEK: "+calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("DAY OF MONTH: "+calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("DAY OF YEAR: "+calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("WEEK OF MONTH: "+calendar.get(calendar.WEEK_OF_MONTH));
		System.out.println("WEEK OF YEAR: "+calendar.get(calendar.WEEK_OF_YEAR));
		System.out.println("AM_PM: "+calendar.get(calendar.AM_PM));

		Calendar calendar1 = new GregorianCalendar(1997,12,25);
		String [] dayNameOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
		System.out.println("December 25, 1997 is a "+dayNameOfWeek[calendar1.get(calendar.DAY_OF_WEEK)-1]);
	}

}
