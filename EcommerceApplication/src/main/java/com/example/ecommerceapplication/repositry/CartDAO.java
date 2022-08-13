package com.example.ecommerceapplication.repositry;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ecommerceapplication.entity.Cart;

@RepositoryRestResource(path="cart")
@CrossOrigin("http://localhost:4200/")
public interface CartDAO extends JpaRepository<Cart, Integer> {
	
	

}
