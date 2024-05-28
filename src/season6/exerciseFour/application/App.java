package season6.exerciseFour.application;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of integers to be added: ");
		int amountNumbers = in.nextInt();
		int[] integersNumbers = new int[amountNumbers];
		readNumbers(in, integersNumbers);

		System.out.println("Even integers: " + printEvenNumbers(integersNumbers));
		System.out.println("Amount of whole numbers: " + printEvenNumbers(integersNumbers).size());
	}
	
	public static void readNumbers(Scanner in, int[] integers) {
		System.out.println("Enter " + integers.length + " whole numbers:");
		for (int i = 0; i < integers.length; i++) {
			int number = in.nextInt();
			integers[i] = number;
		}
	}

	public static ArrayList<Integer> printEvenNumbers(int[] integers){
		ArrayList<Integer> pairNumbers = new ArrayList<>();
		for (int integer: integers){
			if (integer % 2 == 0) pairNumbers.add(integer);
		}
		return pairNumbers;
	}
}
