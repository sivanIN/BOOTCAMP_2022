package com.example.ecommerceapplication.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ecommerceapplication.entity.Product;

@RepositoryRestResource(path ="prod")
@CrossOrigin("http://localhost:4200/")
public interface ProductDAO extends JpaRepository<Product, Integer> {
	
	List<Product> findByNameContainsIgnoreCase(String name);

}
