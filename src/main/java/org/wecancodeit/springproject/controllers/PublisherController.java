package org.wecancodeit.springproject.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.springproject.models.Product;
import org.wecancodeit.springproject.models.Publisher;
import org.wecancodeit.springproject.repositories.ProductRepository;
import org.wecancodeit.springproject.repositories.PublisherRepository;

@Controller
@RequestMapping("/publishers")
public class PublisherController {

	@Resource
	PublisherRepository publisherRepo;

	@Resource
	ProductRepository productRepo;

	@GetMapping("")
	public String getPublishers(Model model) {
		model.addAttribute("publishers", publisherRepo.findAll());
		return "publishers/add";
	}

	@GetMapping("/{id}")
	public String getPublisher(@PathVariable Long id, Model model) {
		model.addAttribute("publisher", publisherRepo.findById(id).get());
		model.addAttribute("allProducts", productRepo.findAll());
		return "/publishers/company";
	}

	@PostMapping("/{publisherId}/add")
	public String addProductToPublisher(@PathVariable Long publisherId, Long productId) {
		Publisher publisherToAddTo = publisherRepo.findById(publisherId).get();
		Product productToAdd = productRepo.findById(productId).get();
		publisherToAddTo.addProductToProducts(productToAdd);
		publisherRepo.save(publisherToAddTo);
		return "redirect:/publishers/" + publisherId;
	}
}
