package season13.application;

import season13.model.entities.Contract;
import season13.model.services.ContractService;
import season13.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		Contract myContract = readContractData(in);
		readInstallments(in, myContract);

		System.out.println(myContract);
		in.close();
	}

	public static void readInstallments(Scanner in, Contract contract){
		System.out.print("Number of installments: ");
		try {
			int installmentsAmount = in.nextInt();
			contract.getContractService().processContract(contract, installmentsAmount);
		} catch (InputMismatchException e){
			System.out.println(e.getMessage());
		}
	}

	public static Contract readContractData(Scanner in){
		try {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			System.out.println("Enter contract details:");
			System.out.print("Number: ");
			int number = in.nextInt();
			in.nextLine();

			System.out.print("Date (dd/MM/yyyy): ");
			LocalDate date = LocalDate.parse(in.next(), fmt);

			System.out.print("Contract value: ");
			double value = in.nextDouble();

			return new Contract(number, date, value, new ContractService(new PaypalService()));
		} catch (IllegalArgumentException | InputMismatchException | DateTimeParseException e){
			return new Contract();
		}
	}
}
