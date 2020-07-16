package chapter_10_programming_exercises;

public class TestMyDate {

	public static void main(String[] args) {		
		MyDate date1= new MyDate();
		MyDate date2= new MyDate(34355555133101L);
		System.out.println("Day: "+date1.getDay()+". Month: "+date1.getMonth()+". Year: "+date1.getYear());
		System.out.println("Day: "+date2.getDay()+". Month: "+date2.getMonth()+". Year: "+date2.getYear());
		date2.setDate(561555550000L);
		System.out.println("Day: "+date2.getDay()+". Month: "+date2.getMonth()+". Year: "+date2.getYear());
	}
}
