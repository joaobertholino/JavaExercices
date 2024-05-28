package season16.functionalInterfaces.application;

import season16.functionalInterfaces.entities.Product;
import season16.functionalInterfaces.util.MyComparatorProduct;
import season16.functionalInterfaces.util.MyConsumerProduct;
import season16.functionalInterfaces.util.MyFunctionProduct;
import season16.functionalInterfaces.util.MyPredicateProduct;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("IntelliJ IDEA", 16.90));
		productList.add(new Product("Apache NetBeans", 5.00));
		productList.add(new Product("Microsoft Windows 11 PRO", 1600.00));
		productList.add(new Product("Eclipse IDE", 13.40));

//		TODO: Comparator
		Comparator<Product> compWithType = (Product p1, Product p2) -> {
			return p1.getPrice().compareTo(p2.getPrice());
		};

		Comparator<Product> compWithoutType = (p1, p2) -> {
			return p1.getPrice().compareTo(p2.getPrice());
		};

		Comparator<Product> compWithComparing = Comparator.comparing(Product::getPrice);

		productList.sort(new MyComparatorProduct());
		productList.sort(MyComparatorProduct::getCompareStatic);
		productList.sort(compWithType);
		productList.sort(compWithoutType);
		productList.sort((Product p1, Product p2) -> p1.getPrice().compareTo(p2.getPrice()));
		productList.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		productList.sort(Comparator.comparing(Product::getPrice));
		productList.sort(compWithComparing);

//		TODO: Predicate
		Predicate<Product> predicateWithType = (Product p1) -> {
			return p1.getPrice() < 1000.00;
		};

		Predicate<Product> predicateWithoutType = (p1) -> {
			return p1.getPrice() < 1000.00;
		};

		productList.removeIf(new MyPredicateProduct());
		productList.removeIf(MyPredicateProduct::getTestStatic);
		productList.removeIf(Product::getTestNonStatic);
		productList.removeIf(predicateWithType);
		productList.removeIf(predicateWithoutType);
		productList.removeIf((Product p1) -> p1.getPrice() < 1000.00);
		productList.removeIf((p1) -> p1.getPrice() < 1000.00);

//		TODO: Consumer
		Consumer<Product> consumerWithType = (Product p) -> {
			p.setPrice(p.getPrice() * 1.1);
		};

		Consumer<Product> consumerWithoutType = (p) -> {
			p.setPrice(p.getPrice() * 1.1);
		};

		productList.forEach(new MyConsumerProduct());
		productList.forEach(MyConsumerProduct::getAcceptStatic);
		productList.forEach(Product::getAcceptNonStatic);
		productList.forEach(consumerWithType);
		productList.forEach(consumerWithoutType);
		productList.forEach((Product p) -> p.setPrice(p.getPrice() * 1.1));
		productList.forEach((p) -> p.setPrice(p.getPrice() * 1.1));

		productList.forEach(System.out::println);

//		TODO: Function
		Function<Product, String> functionWithType = (Product p) -> {
			return p.getName().toUpperCase();
		};

		Function<Product, String> functionWithoutType = (p) -> {
			return p.getName().toUpperCase();
		};

		List<String> productsNameUpperCaseOne = productList.stream().map(new MyFunctionProduct()).toList();
		List<String> productsNameUpperCaseTwo = productList.stream().map(new MyFunctionProduct()).collect(Collectors.toList());
		List<String> productsNameUpperCaseThree = productList.stream().map(Product::getApplyNonStatic).toList();
		List<String> productsNameUpperCaseFour = productList.stream().map(MyFunctionProduct::getApplyStatic).toList();
		List<String> productsNameUpperCaseFive = productList.stream().map((Product p) -> p.getName().toUpperCase()).toList();
		List<String> productsNameUpperCaseSix = productList.stream().map(p -> p.getName().toUpperCase()).toList();

		productsNameUpperCaseOne.forEach(System.out::println);

	}
}