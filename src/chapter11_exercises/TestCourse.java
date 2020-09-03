package chapter11_exercises;

public class TestCourse {
	public static void main(String[]args) {
		
	Course course1=new Course("Data Structures");
	Course course2=new Course("Database Systems");
	
	course1.addStudent("Peter Jackson");
	course1.addStudent("Quentin Tarantino");
	course1.addStudent("Esteven Spielberg");
	
	course2.addStudent("Peter Jones");
	course2.addStudent("Steve Smith");
	
	System.out.println("Number of students in course1: "+course1.getNumberOfStudents());
	System.out.println(course1.getStudents());
	System.out.println();
	System.out.println("Number of students in course2: "+course2.getNumberOfStudents());
	System.out.println(course2.getStudents());
	}	
}
