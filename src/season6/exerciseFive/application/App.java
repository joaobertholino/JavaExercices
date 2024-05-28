package season6.exerciseFive.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do
 * vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0
 * (zero).
 */
public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the amount numbers to be added: ");
		int amountNumbers = in.nextInt();
		double[] numbersVector = new double[amountNumbers];
		createNumberVector(in, numbersVector);

		System.out.println("Largest real number added: " + showTheLargestNumber(numbersVector));
		System.out.println("Index of the largest number added: " + indexOfTheLargestNumber(numbersVector));
	}

	public static void createNumberVector(Scanner in, double[] numberVector) {
		System.out.println("Enter the real numbers: ");
		for (int i = 0; i < numberVector.length; i++) {
			double number = in.nextDouble();
			numberVector[i] = number;
		}
	}

	public static double showTheLargestNumber(double[] numberVector) {
		double largestNumber = 0;
		for (double number : numberVector) {
			if (number > largestNumber) {
				largestNumber = number;
			}
		}
		return largestNumber;
	}

	public static int indexOfTheLargestNumber(double[] numberVector) {
		double largestNumber = showTheLargestNumber(numberVector);
		for (int i = 0; i < numberVector.length; i++) {
			if (numberVector[i] == largestNumber) {
				return i;
			}
		}
		return -1;
	}
}
