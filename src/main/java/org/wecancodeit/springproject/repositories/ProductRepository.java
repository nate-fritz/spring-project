package org.wecancodeit.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.springproject.models.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	
}

