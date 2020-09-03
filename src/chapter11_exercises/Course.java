package chapter11_exercises;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList <String> students=new ArrayList<>();
	
	public Course(String courseName) {
		this.courseName=courseName;
	}
	public String getCoursename() {
		return courseName;
	}
	public void addStudent(String student) {
		students.add(student);
	}
	public String getStudents() {
		return students.toString();							
	}
	public int getNumberOfStudents() {
		return students.size();
	}	
}
