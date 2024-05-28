package season10.application;

import season10.model.ImportedProduct;
import season10.model.Product;
import season10.model.UsedProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int amount = in.nextInt();
		in.nextLine();

		List<Product> products = new ArrayList<>();
		createListProduct(in, amount, products);

		System.out.println("PRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
	}

	public static void createListProduct(Scanner in, int amount, List<Product> products) {
		for (int i = 0; i < amount; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, Used or Imported (C/U/I)? ");
			char status = in.next().charAt(0);
			in.nextLine();

			System.out.print("Name: ");
			String name = in.nextLine();

			System.out.print("Price: ");
			double price = in.nextDouble();

			if (status == 'I') {
				System.out.print("Customs fee: ");
				double customsFee = in.nextDouble();

				products.add(new ImportedProduct(name, price, customsFee));
			} else if (status == 'U') {
				System.out.print("Manufacture date (dd/MM/yyyy): ");
				String stringDate = in.next();
				LocalDate date = LocalDate.parse(stringDate, UsedProduct.dateFormatter);

				products.add(new UsedProduct(name, price, date));
			} else if (status == 'C') {
				products.add(new Product(name, price));
			}
		}
	}
}
