package season8.application;

import season8.entities.Client;
import season8.entities.Order;
import season8.entities.OrderItem;
import season8.entities.Product;
import season8.entities.enums.OrderStatus;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Order order = new Order(Instant.now(), readClientData(in), readOrderStatus(in));
		readOrderData(in, order);

		System.out.println(showSummary(order));
	}

	private static Client readClientData(Scanner in) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = in.nextLine();

		System.out.print("E-mail: ");
		String email = in.nextLine();

		System.out.print("Birth Date: ");
		String date = in.next();

		LocalDate birthDate = LocalDate.parse(date, dateFormatter);
		return new Client(name, email, birthDate);
	}

	private static OrderStatus readOrderStatus(Scanner in) {
		System.out.println("Enter order data:");

		System.out.print("Status: ");
		return OrderStatus.valueOf(in.next());
	}

	private static void readOrderData(Scanner in, Order order) {
		System.out.print("How many items to this order ?: ");
		int amount = in.nextInt();
		in.nextLine();
		order.setDate(Instant.now());

		for (int i = 0; i < amount; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");

			System.out.print("Product Name: ");
			String name = in.nextLine();

			System.out.print("Product Price: ");
			double price = in.nextDouble();

			System.out.println("Quantity: ");
			int quantity = in.nextInt();
			in.nextLine();

			order.getItens().add(new OrderItem(quantity, new Product(name, price)));
		}
	}

	private static String showSummary(Order order) {
		return "Order moment: " + order.getDate() + "\n"
				+ "Order status: " + order.getStatus() + "\n"
				+ "Client: " + order.getClient() + "\n"
				+ "Order items: " + order.showItems() + "\n"
				+ "Total price: " + order.subTotal();
	}
}
