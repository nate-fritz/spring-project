package org.wecancodeit.springproject.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
