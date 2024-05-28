package season6.exerciseSix.application;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
 * cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
 */
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the amount of integers to be added: ");
		int amountNumbers = in.nextInt();

		System.out.println("Enter the values of the first vector:");
		int[] vectorNumberOne = new int[amountNumbers];
		createVector(in, vectorNumberOne);

		System.out.println("Enter the values of the second vector:");
		int[] vectorNumberTwo = new int[amountNumbers];
		createVector(in, vectorNumberTwo);

		try {
			System.out.println("Sum of the elements of each vector:");
			System.out.println(Arrays.toString(sumVector(vectorNumberOne, vectorNumberTwo)));
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void createVector(Scanner in, int[] numberVector) {
		for (int i = 0; i < numberVector.length; i++) {
			int numbers = in.nextInt();
			numberVector[i] = numbers;
		}
	}

	public static int[] sumVector(int[] vectorOne, int[] vectorTwo) throws RuntimeException {
		if (vectorOne.length > vectorTwo.length || vectorOne.length < vectorTwo.length) {
			throw new RuntimeException("Different size vectors");
		}

		int[] sumVector = new int[vectorOne.length];
		for (int i = 0; i < vectorOne.length; i++) {
			sumVector[i] = vectorOne[i] + vectorTwo[i];
		}
		return sumVector;
	}
}
