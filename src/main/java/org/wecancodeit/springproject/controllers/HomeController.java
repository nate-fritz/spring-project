package org.wecancodeit.springproject.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.springproject.models.Product;
import org.wecancodeit.springproject.repositories.ProductRepository;




@Controller
public class HomeController {

	@Resource
	ProductRepository repo;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/products")
	public String getProductForm(Model model) {
		model.addAttribute("products", repo.findAll());
		return "products/add";
	}
	
	@GetMapping("/products/{id}")
	public String getProduct(@PathVariable Long id, Model model) {
		model.addAttribute("product", repo.findById(id).get());
		return "/products/item";
	}
	
	@PostMapping("/products/add")
	public String addProduct(String name, int year, int price, String publisher, String content) {
		repo.save(new Product(name, year, price, publisher, content));
		return "redirect:/products";
	}
}
