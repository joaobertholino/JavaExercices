package season6.exerciseThree.application;

import season6.exerciseThree.entities.Person;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver.
 */
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of people: ");
		int amountPerson = in.nextInt();
		in.nextLine();

		Person[] persons = new Person[amountPerson];
		readPerson(in, persons);

		System.out.printf("Average height: %.2f%n", averageHeight(persons));
		System.out.printf("Percentage under sixteen years old: %.2f%n", percentageBelowSixteen(persons));
		System.out.println("Names of people under sixteen years of age: " + namesBelowSexteen(persons));
	}

	public static void readPerson(Scanner in, Person[] persons){
		for (int i = 0; i < persons.length; i++) {
			System.out.print("Enter the name: ");
			String name = in.nextLine();

			System.out.print("Enter the age: ");
			int age = in.nextInt();

			System.out.print("Enter height in centimeters: ");
			int height = in.nextInt();
			in.nextLine();

			persons[i] = new Person(name, age, height);
		}
	}

	public static double averageHeight(Person[] persons){
		double averageHeight = 0.0;
		for (Person person : persons) {
			averageHeight += person.getHeight();
		}
		return averageHeight / persons.length;
	}

	public static double percentageBelowSixteen(Person[] persons){
		int belowSixteen = 0;
		for (Person person : persons) {
			if (person.getAge() < 16) belowSixteen++;
		}
		return (double) belowSixteen / persons.length * 100;
	}

	public static ArrayList<String> namesBelowSexteen(Person[] persons){
		ArrayList<String> names = new ArrayList<>();
		for (Person person : persons) {
			if (person.getAge() < 16) names.add(person.getName());
		}
		return names;
	}
}
