package season16.functionalInterfaces.util;

import season16.functionalInterfaces.entities.Product;

import java.util.Comparator;

public class MyComparatorProduct implements Comparator<Product> {
	public static int getCompareStatic(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
}
