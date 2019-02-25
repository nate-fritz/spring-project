package org.wecancodeit.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.springproject.models.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	
}

// The following code is no longer necessary thanks to CRUD Repos.
//public class ProductRepository {
//
//	private List<Product> products;
//
//	public ProductRepository(List<Product> inventory) {
//		this.products = inventory;
//	}
//
//	public List<Product> getInventory() {
//		return products;
//	}
//	
//	public void addProduct(Product product) {
//		products.add(product);
//	}
//
//	@Override
//	public String toString() {
//		return "ProductRepository [products=" + products + "]";
//	}
//	
//	
//}
