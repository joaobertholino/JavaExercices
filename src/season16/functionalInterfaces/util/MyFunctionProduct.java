package season16.functionalInterfaces.util;

import season16.functionalInterfaces.entities.Product;

import java.util.function.Function;

public class MyFunctionProduct implements Function<Product, String> {
	public static String getApplyStatic(Product product) {
		return product.getName().toUpperCase();
	}

	@Override
	public String apply(Product product) {
		return product.getName().toUpperCase();
	}
}
