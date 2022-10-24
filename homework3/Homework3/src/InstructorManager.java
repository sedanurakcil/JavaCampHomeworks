
public class InstructorManager extends UserManager {

	public void addCourse() {
		System.out.println("Kurs eklendi");
	}

	public void StudentList(Student[] students) {
		System.out.println(" Student List");
		for (Student student : students) {
			System.out.println(student.getName());

		}
	}
}
