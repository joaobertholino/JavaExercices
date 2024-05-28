package season11.application;

import season11.model.entities.Account;
import season11.model.exceptions.IllegalOperationException;
import season11.model.exceptions.IllegalValueException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter your bank account details");
		Account myAccount = readAccountData(in);

		executeOperation(in, myAccount);
	}

	private static void executeOperation(Scanner in, Account myAccount) {
		int option;
		do {
			option = menuOption(in);
			if (option == 1 && myAccount != null) {
				treatmentDeposit(in, myAccount);
				System.out.printf("Current balance: %.2f%n", myAccount.getBalance());
			} else if (option == 2 && myAccount != null) {
				treatmentWithdraw(in, myAccount);
				System.out.printf("Current balance: %.2f%n", myAccount.getBalance());
			} else if (option == 0) {
				System.out.println("Closing program...");
				in.close();
			}
		} while (option != 0);
	}

	private static void treatmentWithdraw(Scanner in, Account myAccount) {
		try {
			System.out.print("Enter withdrawal amount: ");
			double value = in.nextDouble();
			myAccount.withdraw(value);
		} catch (IllegalOperationException | InputMismatchException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void treatmentDeposit(Scanner in, Account myAccount) {
		try {
			System.out.print("Enter the deposit amount: ");
			double value = in.nextDouble();
			myAccount.deposit(value);
		} catch (IllegalValueException | InputMismatchException e) {
			System.err.println(e.getMessage());
		}
	}

	private static int menuOption(Scanner in) {
		int option = 0;
		try {
			System.out.println("Select the option you want");
			System.out.println("1 - Deposit");
			System.out.println("2 - Withdraw");
			System.out.println("0 - Exit");
			option = in.nextInt();
			if (option < 0 || option > 2) throw new IllegalValueException("Invalid option");
		} catch (IllegalValueException | InputMismatchException e) {
			System.err.println(e.getMessage());
		}
		return option;
	}

	private static Account readAccountData(Scanner in) {
		try {
			System.out.print("Account number: ");
			int number = in.nextInt();
			in.nextLine();

			System.out.print("Holder of the account: ");
			String holder = in.nextLine();

			System.out.print("Account opening balance: ");
			double balance = in.nextDouble();

			System.out.print("Account withdrawal limit: ");
			double withdrawLimit = in.nextDouble();

			return new Account(number, holder, balance, withdrawLimit);
		} catch (InputMismatchException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
}
