package org.wecancodeit.springproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int price;
	private int year;
	private String publisher;
 

	public Product () {}
	
	public Product(String name, int price, int year, String publisher) {
		super();
		this.name = name;
		this.price = price;
		this.year = year;
		this.publisher = publisher;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getPublisher() {
		return publisher;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", year=" + year + ", publisher=" + publisher + "]";
	}


	
}
