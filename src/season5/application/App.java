package season5.application;

import season5.entities.AccountBank;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your account number: ");
		int accountNumber = in.nextInt();
		in.nextLine();

		System.out.print("Enter the name of the account holder: ");
		String cardholderName = in.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char option = in.next().charAt(0);
		double depositValue = 0.0;

		if (option == 'y') {
			System.out.print("Enter the amount of the first deposit: ");
			depositValue = in.nextDouble();
		}
		AccountBank myAccountBank = new AccountBank(accountNumber, cardholderName, depositValue);

		System.out.println(myAccountBank);

		System.out.print("Is there an withdraw (y/n)? ");
		option = in.next().charAt(0);
		double withdrawValue = 0.0;

		if (option == 'y') {
			System.out.println("Enter a withdrawal amount");
			withdrawValue = in.nextDouble();
		}
		try {
			myAccountBank.withdraw(withdrawValue);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(myAccountBank);
	}
}
