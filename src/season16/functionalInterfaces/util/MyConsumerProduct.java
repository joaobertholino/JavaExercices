package season16.functionalInterfaces.util;

import season16.functionalInterfaces.entities.Product;

import java.util.function.Consumer;

public class MyConsumerProduct implements Consumer<Product> {
	public static void getAcceptStatic(Product product) {
		product.setPrice(product.getPrice() * 1.1);
	}

	@Override
	public void accept(Product product) {
		product.setPrice(product.getPrice() * 1.1);
	}
}
