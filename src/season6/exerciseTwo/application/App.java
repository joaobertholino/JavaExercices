package season6.exerciseTwo.application;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * <p>
 * Imprimir todos os elementos do vetor
 * <p>
 * Mostrar na tela a soma e a média dos elementos do vetor
 */
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How many integers do you want to enter?");
		int n = in.nextInt();
		int[] vect = new int[n];
		createVect(in, vect);

		System.out.println(STR."Vector values: \{printVect(vect)}");
		System.out.println(STR."Vector sum: \{sumVect(vect)}");
		System.out.println(STR."Vector mean: \{averageVect(vect)}");
	}

	public static void createVect(Scanner in, int[] vect){
		for (int i = 0; i < vect.length; i++) {
			int number = in.nextInt();
			vect[i] = number;
		}
	}

	public static String printVect(int[] vect){
		return Arrays.toString(vect);
	}

	public static int sumVect(int[] vect){
		int sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		return sum;
	}

	public static int averageVect(int[] vect){
		return sumVect(vect) / vect.length;
	}
}
