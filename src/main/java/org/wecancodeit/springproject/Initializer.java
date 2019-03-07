package org.wecancodeit.springproject;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.springproject.models.Product;
import org.wecancodeit.springproject.models.Tag;
import org.wecancodeit.springproject.repositories.ProductRepository;
import org.wecancodeit.springproject.repositories.TagRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	ProductRepository productRepo;

	@Resource
	TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {
		Tag funny = tagRepo.save(new Tag("funny"));
		Tag sad = tagRepo.save(new Tag("sad"));
		Tag epic = tagRepo.save(new Tag("epic"));

		productRepo.save(new Product("Secret Warriors Omnibus", 2012, 145, "Marvel",
				"Great story with some very surprising twists!  Not the usual super-hero fare of the Marvel Universe, Secret Warriors is instead a spy thriller revolving around S.H.I.E.L.D. and their nemesis, HYDRA."));

	}
}
