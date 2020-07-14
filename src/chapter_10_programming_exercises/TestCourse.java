package chapter_10_programming_exercises;

public class TestCourse {
	public static void main(String[]args) {
		
	Course course1=new Course("Data Structures");
	
	course1.addStudent("Peter Jackson");
	course1.addStudent("Quentin Tarantino");
	course1.addStudent("Esteven Spielberg");
	
	course1.dropStudent();
	
	System.out.println("Number of students in course1: "+course1.getNumberOfStudents());
	String[]students=course1.getStudents();
	for(int i=0;i<students.length;i++) {
		if(i+1<students.length)
			System.out.print(students[i]+", ");
		else
			System.out.print(students[i]);
		}	
	}	
}

