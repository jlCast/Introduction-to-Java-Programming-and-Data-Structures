package chapter_10_programming_exercises;

import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		GregorianCalendar today= new GregorianCalendar();
		year=today.get(GregorianCalendar.YEAR);
		month=today.get(GregorianCalendar.MONTH);
		day=today.get(GregorianCalendar.DAY_OF_MONTH);
	}
	public MyDate(long elapsedTime) {
		GregorianCalendar gregorianCalendar1=new GregorianCalendar();
		gregorianCalendar1.setTimeInMillis(elapsedTime);
		year=gregorianCalendar1.get(GregorianCalendar.YEAR);
		month=gregorianCalendar1.get(GregorianCalendar.MONTH);
		day=gregorianCalendar1.get(GregorianCalendar.DAY_OF_MONTH);		
	}
	public MyDate(int year, int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setDate(long elapsedTime) {
		GregorianCalendar gregorianCalendar1=new GregorianCalendar();
		gregorianCalendar1.setTimeInMillis(elapsedTime);
		year=gregorianCalendar1.get(GregorianCalendar.YEAR);
		month=gregorianCalendar1.get(GregorianCalendar.MONTH);
		day=gregorianCalendar1.get(GregorianCalendar.DAY_OF_MONTH);	
	}
}
