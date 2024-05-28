package season6.exerciseOne.application;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um
 * vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of integers to be read: ");
		int n = in.nextInt();
		int[] vect = new int[n];

		printNegative(createVect(vect, in));
	}

	public static int[] createVect(int[] vect, Scanner in) {
		for (int i = 0; i < vect.length; i++) {
			int number = in.nextInt();
			vect[i] = number;
		}
		in.close();
		return vect;
	}

	public static void printNegative(int[] vect) {
		System.out.println("Negative numbers:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) System.out.println(vect[i]);
		}
	}
}
