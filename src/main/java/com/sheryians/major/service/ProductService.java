package com.sheryians.major.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.model.Category;
import com.sheryians.major.model.Product;
import com.sheryians.major.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository prodrepo;
	
	public List<Product> getAllProducts(){
		
		return (List<Product>)prodrepo.findAll();
	}
	
	public void addProduct(Product product) {
		prodrepo.save(product);
	}
	
	public void removeProductById(long id) {
		prodrepo.deleteById(id);
	}
	
	public Optional<Product> getProductById(long id){
		
		return prodrepo.findById(id);
	}
	
	public List<Product> getAllProductsByCategoryId(int id){
		
		return prodrepo.findAllByCategory_Id(id);
	}
}
