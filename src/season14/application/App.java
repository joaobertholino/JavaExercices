package season14.application;

import season14.model.entities.Course;
import season14.model.entities.Instructor;
import season14.model.entities.Student;

import java.util.*;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of courses: ");
		int coursesAmount = in.nextInt();
		in.nextLine();

		Instructor instructorA = createInstructor(in, createCourse(in, coursesAmount));

		Set<Student> listStudents = new HashSet<>();
		for (Course obj : instructorA.getCourseList()){
			listStudents.addAll(obj.getStudents());
		}
		System.out.println(listStudents.size());
	}

	public static Instructor createInstructor(Scanner in, List<Course> courseList){
		System.out.print("Enter the instructor ID code: ");
		int idCode = in.nextInt();
		in.nextLine();

		System.out.print("Enter the instructor's name: ");
		String name = in.nextLine();

		return new Instructor(idCode, name, courseList);
	}

	public static List<Course> createCourse(Scanner in, int coursesAmount){
		List<Course> courseList = new ArrayList<>();
		for (int i = 0; i < coursesAmount; i++) {
			System.out.print("Enter the course title: ");
			String title = in.nextLine();

			courseList.add(new Course(title, createStudents(in)));
		}
		return courseList;
	}

	public static Set<Student> createStudents(Scanner in){
		System.out.print("Enter the number of students: ");
		int amountStudents = in.nextInt();
		in.nextLine();

		Set<Student> listStudents = new HashSet<>();
		for (int i = 0; i < amountStudents; i++) {
			System.out.print("Enter the student ID code: ");
			int idCode = in.nextInt();
			in.nextLine();

			System.out.print("Enter the student's name: ");
			String name = in.nextLine();

			listStudents.add(new Student(idCode, name));
		}
		return listStudents;
	}
}
