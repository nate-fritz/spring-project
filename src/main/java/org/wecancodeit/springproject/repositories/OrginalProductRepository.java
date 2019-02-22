package org.wecancodeit.springproject.repositories;

import java.util.List;

import org.wecancodeit.springproject.models.Product;

public class OrginalProductRepository {

	private List<Product> products;

	public OrginalProductRepository(List<Product> inventory) {
		this.products = inventory;
	}

	public List<Product> getInventory() {
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
