package org.wecancodeit.springproject.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.springproject.models.Product;
import org.wecancodeit.springproject.repositories.ProductRepository;
import org.wecancodeit.springproject.repositories.TagRepository;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Resource
	ProductRepository productRepo;

	@Resource
	TagRepository tagRepo;

	@GetMapping("")
	public String getProductForm(Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "products/add";
	}
	
	@GetMapping("/all")
	public String getProductsAll(String product, Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "/products/all";
	}

	@GetMapping("/{id}")
	public String getProduct(@PathVariable Long id, Model model) {
		model.addAttribute("product", productRepo.findById(id).get());
		return "/products/item";
	}

	@PostMapping("/add")
	public String addProduct(String name, int year, int price, String publisher, String content) {
		productRepo.save(new Product(name, year, price, publisher, content));
		return "redirect:/products";
	}
}
