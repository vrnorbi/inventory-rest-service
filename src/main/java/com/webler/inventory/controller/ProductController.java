package com.webler.inventory.controller;

import com.webler.inventory.model.Product;
import com.webler.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@GetMapping(path="/id/{id}")
	public @ResponseBody Product getProductById(@PathVariable("id") int id) {
		return productRepository
				.findById(id)
				.orElse(new Product());
	}

	@GetMapping(path="/name/{name}")
	public @ResponseBody Iterable<Product> getProductByName(@PathVariable("name") String name) {
		return productRepository.findByNameContaining(name);
	}

}
