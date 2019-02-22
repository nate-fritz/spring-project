package org.wecancodeit.springproject.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.wecancodeit.springproject.models.Product;
import org.wecancodeit.springproject.repositories.ProductRepository;


@Controller
public class HomeController {

	private ProductRepository repo = new ProductRepository(new ArrayList<Product>());
}
