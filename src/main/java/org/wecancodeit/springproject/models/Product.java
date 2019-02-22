package org.wecancodeit.springproject.models;

public class Product {

	private String name;
	private String id;
	private int price;
	private int year;
	private String publisher;
 

	public Product(String name, String id, int price, int year, String publisher) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.year = year;
		this.publisher = publisher;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
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
		return "InventoryItem [name=" + name + ", id=" + id + ", price=" + price + ", year=" + year + ", publisher="
				+ publisher + "]";
	}
	
	
}
