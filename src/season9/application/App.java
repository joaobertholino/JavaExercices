package season9.application;

import season9.model.Company;
import season9.model.Physical;
import season9.model.TaxPayer;
import season9.model.enums.TaxType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int amount = in.nextInt();
		in.nextLine();

		List<TaxPayer> payers = new ArrayList<>();
		createPayer(in, amount, payers);

		System.out.println();
		System.out.println("TAXES PAID:");
		taxesPaid(payers);
		System.out.println();

		System.out.printf("TOTAL TAXES: %.2f%n", totalTaxes(payers));
	}

	public static void createPayer(Scanner in, int amount, List<TaxPayer> payers) {
		for (int i = 0; i < amount; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (PHYSICAL/COMPANY)? ");
			TaxType taxType = TaxType.valueOf(in.next());
			in.nextLine();

			System.out.print("Name: ");
			String name = in.nextLine();

			System.out.print("Anual income: ");
			double anualIncome = in.nextDouble();

			if (taxType == TaxType.PHYSICAL) {
				System.out.print("Health expenditures: ");
				double healthSpending = in.nextDouble();
				in.nextLine();

				payers.add(new Physical(name, anualIncome, taxType, healthSpending));
			} else if (taxType == TaxType.COMPANY) {
				System.out.print("Number of employees: ");
				int numberOfEmployees = in.nextInt();
				in.nextLine();

				payers.add(new Company(name, anualIncome, taxType, numberOfEmployees));
			}
		}
	}

	public static void taxesPaid(List<TaxPayer> payers) {
		for (TaxPayer payer : payers) {
			System.out.printf("%s: $%.2f%n", payer.getName(), payer.taxPayment());
		}
	}

	public static double totalTaxes(List<TaxPayer> payers) {
		double total = 0.0;
		for (TaxPayer payer : payers) {
			total += payer.taxPayment();
		}
		return total;
	}
}
