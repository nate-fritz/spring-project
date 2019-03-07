package org.wecancodeit.springproject.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Publisher {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@ManyToMany
	private Collection<Product> products;
	
	public Publisher() {}
	
	public Publisher(String name, Product ...products) {
		this.name = name;
		this.products = Arrays.asList(products);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Product> getProducts() {
		return products;
	}
	
	public void addProductToProducts(Product product) {
		products.add(product);
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
	
	
}
