package season16.functionArgumentToFunction.application;

import season16.functionArgumentToFunction.model.entities.Product;
import season16.functionArgumentToFunction.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Product> listProduct = new ArrayList<>();
		listProduct.add(new Product("Tv", 1250.00));
		listProduct.add(new Product("Mouse", 125.00));
		listProduct.add(new Product("Tablet", 500.00));
		listProduct.add(new Product("HD Case", 80.00));

		double sum = ProductService.filteredSum(listProduct, p -> p.getName().charAt(0) == 'T');
		System.out.println("Soma dos preços dos produtos iniciados em 'T': " + sum);
	}
}
