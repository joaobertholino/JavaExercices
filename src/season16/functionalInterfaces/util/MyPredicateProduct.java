package season16.functionalInterfaces.util;

import season16.functionalInterfaces.entities.Product;

import java.util.function.Predicate;

public class MyPredicateProduct implements Predicate<Product> {
	public static boolean getTestStatic(Product product) {
		return product.getPrice() < 1000.00;
	}

	@Override
	public boolean test(Product product) {
		return product.getPrice() < 1000.00;
	}
}
