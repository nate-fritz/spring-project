package org.wecancodeit.springproject.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
