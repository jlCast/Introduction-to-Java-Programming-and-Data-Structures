package chapter11_exercises;
	
public class Person {
	private String name;
	private String adress;
	private String phoneNumber;
	private String eMail;

	public Person() {
	}
	public Person(String name) {
		this.name=name;
	}
	public Person(String name, String adress, String phoneNumber, String eMail) {
		this(name);
		this.adress=adress;
		this.phoneNumber=phoneNumber;
		this.eMail=eMail;
	}
	@Override
	public String toString() {
		return "Class Person. Name: "+getName();
	}
	public String getName() {
		return name;
	}
}
class Student extends Person{
	public static int FRESHMAN=1;
	public static int SOPHOMORE=2;
	public static int JUNIOR=3;
	public static int SENIOR=4;
	
	public Student(){		
	}
	public Student(String name){
		super(name);
	}
	@Override
	public String toString() {
		return "Class Student. Name: "+getName();
	}
}
class Employee extends Person{
	private String office;
	private double salary;
	private MyDate dataHired;
	
	public Employee() {		
	}
	public Employee(String name) {	
		super(name);
	}
	public Employee(String office, double salary,int year, int month, int day) {
		this.office=office;
		this.salary=salary;
		MyDate dataHired = new MyDate(year,month,day);
	}
	@Override
	public String toString() {
		return "Class Employee. Name: "+getName();
	}
}
class Faculty extends Employee{
	private int officeHours;
	private int rank;
	
	public Faculty() {
	}
	public Faculty(String name) {
		super(name);
	}
	public Faculty(int officeHours,int rank) {
		this.officeHours=officeHours;
		this.rank=rank;
	}
	@Override
	public String toString() {
		return "Class Faculty. Name: "+getName();
	}
}
class Staff extends Employee{
	private String title;
	
	public Staff() {	
	}
	public Staff (String name) {
		super(name);
	}
	public Staff(String name, String title) {
		this(name);
		this.title=title;
	}
	@Override
	public String toString() {
		return "Class Staff. Name: "+getName();
	}
	
}