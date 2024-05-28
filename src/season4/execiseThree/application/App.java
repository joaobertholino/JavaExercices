package season4.execiseThree.application;

import season4.execiseThree.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the student's name: ");
		String name = in.nextLine();

		System.out.print("Enter the first note: ");
		double gradeOne = in.nextDouble();

		System.out.print("Insert the second note: ");
		double gradeTwo = in.nextDouble();

		System.out.print("Insert the third note: ");
		double gradeThree = in.nextDouble();

		Student myStudent = new Student(name, gradeOne, gradeTwo, gradeThree);

		System.out.printf("Grade Final: %.2f%nIs Approved: %s", myStudent.gradeFinal(), myStudent.isApproved());
	}
}
