package org.wecancodeit.springproject.repositories;

import java.util.List;

import org.wecancodeit.springproject.models.Product;




//@Repository
//public interface ProductRepository extends CrudRepository<Product, Long> {
//	
//	
//}

public class ProductRepository {
	
	private List<Product> products;

	public ProductRepository(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProduct() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public String toString() {
		return "ProductRepository [products=" + products + "]";
	}
	
}