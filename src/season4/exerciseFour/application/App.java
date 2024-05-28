package season4.exerciseFour.application;

import season4.exerciseFour.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		double dollarPrice = in.nextDouble();
		CurrencyConverter.setCountin(dollarPrice);

		System.out.println("How many dollars will be bought?");
		double dollarsToBuy = in.nextDouble();

		System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.convert(dollarsToBuy));
	}
}
