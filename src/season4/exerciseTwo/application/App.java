package season4.exerciseTwo.application;

import season4.exerciseTwo.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the employee’s name");
		String name = in.nextLine();

		System.out.println("Enter the gross salary amount");
		double grossSalary = in.nextDouble();

		System.out.println("Enter the taxPayment amount");
		double tax = in.nextDouble();

		Employee myEmployee = new Employee(name, grossSalary, tax);
		System.out.println(myEmployee);

		myEmployee.increaseSalary(0.1);

		System.out.println(myEmployee);
	}
}
