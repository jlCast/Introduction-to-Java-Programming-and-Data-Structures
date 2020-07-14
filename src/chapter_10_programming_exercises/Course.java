package chapter_10_programming_exercises;

public class Course {
	private String courseName;
	private String [] students=new String[1];
	private int numberOfStudents=0;
	
	public Course(String courseName) {
		this.courseName=courseName;
	}
	public String getCoursename() {
		return courseName;
	}
	public void addStudent(String student) {
		if(numberOfStudents>=students.length) {
			String[] temp=new String[numberOfStudents+1];	
			System.arraycopy(students, 0, temp, 0, numberOfStudents);
			students=temp;
		}			
		students[numberOfStudents]=student;
		numberOfStudents++;		
	}
	public void dropStudent() {
		numberOfStudents--;	
	}
	public String[] getStudents() {
		String[] temp=new String[numberOfStudents];	
		System.arraycopy(students, 0, temp, 0, numberOfStudents);
		return temp;							
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}	
	public void clear() {
		numberOfStudents=0;
	}
}
