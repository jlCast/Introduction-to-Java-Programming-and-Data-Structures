package chapter11_exercises;

public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person("Daniel");
		Student student = new Student("Pedro");
		Employee employee = new Employee("Ramón");
		Faculty faculty = new Faculty("Juan");
		Staff staff = new Staff("Fernando");
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
	}
}
