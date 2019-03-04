package org.wecancodeit.springproject.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.springproject.models.Product;
import org.wecancodeit.springproject.repositories.ProductRepository;




@Controller
public class HomeController {

	private ProductRepository repo = new ProductRepository(new ArrayList<Product>());
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/products/add")
	public String getProductForm(Model model) {
		model.addAttribute("products", repo.getProduct());
		return "products/add";
	}
	
	@PostMapping("/products/add")
	public String addProduct(String name, int year, int price, String publisher, String content) {
		repo.addProduct(new Product(name, year, price, publisher, content));
		return "redirect:/products/add";
	}
}
