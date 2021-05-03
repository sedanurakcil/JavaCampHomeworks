
public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("seda", "12345");
		student1.setId(123);

		Student student2 = new Student("lale", "345");

		student2.setId(34);
		
		Student[] students = { student1, student2 };

		Instructor instructor = new Instructor("Engin Demirog", "engindemirog@gmail.com");

		instructor.setId(45);

		
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.profileEdit(student2);
		studentManager.SelectCourse();
		studentManager.exit(student1);
		studentManager.login(student1);
		
		instructorManager.addCourse();
		instructorManager.StudentList(students);
		instructorManager.exit(instructor);
		instructorManager.login(instructor);
		
		

	}

}
