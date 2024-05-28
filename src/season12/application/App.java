package season12.application;

import season12.model.entities.Product;
import season12.model.exceptions.CreatePathException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		createFile(createFolder(in), createListProduct(in));
	}

	public static String createFolder(Scanner in) {
		String folderPath = "";
		try {
			System.out.print("Enter the folder path: ");
			folderPath = in.next() + "\\" + "out";

			File newFolder = new File(folderPath);
			boolean status = newFolder.mkdir();
			if (!status) throw new CreatePathException("Folder creation failed");
		} catch (InputMismatchException | SecurityException | CreatePathException e) {
			System.err.println(e.getMessage());
			createFolder(in);
		}
		return folderPath;
	}

	public static void createFile(String folderPath, List<Product> productList) {
		folderPath += "\\" + "summary.csv";
		try (BufferedWriter br = new BufferedWriter(new FileWriter(folderPath, true))) {
			for (Product product : productList) {
				br.write(product.getName() + ", " + product.totalPrice());
				br.newLine();
			}
		} catch (InputMismatchException | NullPointerException | IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public static List<Product> createListProduct(Scanner in) {
		System.out.print("Enter the number of products you want: ");
		int amountProduct = in.nextInt();
		in.nextLine();

		List<Product> products = new ArrayList<>();
		for (int i = 0; i < amountProduct; i++) {
			System.out.print("Product's name " + (i + 1) + ": ");
			String name = in.nextLine();

			System.out.print("Price of the product " + (i + 1) + ": ");
			double price = in.nextDouble();

			System.out.print("Quantity of this product " + (i + 1) + ": ");
			int amount = in.nextInt();
			in.nextLine();

			products.add(new Product(name, price, amount));
		}
		return products;
	}
}
