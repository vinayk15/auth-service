package com.sapient.bootcamp.authservice.repositories;

import com.sapient.bootcamp.authservice.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	@Override
    void delete(Product deleted);
}
