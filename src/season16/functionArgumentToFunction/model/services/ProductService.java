package season16.functionArgumentToFunction.model.services;


import season16.functionArgumentToFunction.model.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
	public static Double filteredSum(List<Product> list, Predicate<Product> criteria) {
		Double sum = 0.0;
		for (Product p : list) if (criteria.test(p)) sum += p.getPrice();
		return sum;
	}
}
