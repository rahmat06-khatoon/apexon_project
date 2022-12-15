package com.sheryians.major.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.model.Category;
import com.sheryians.major.model.User;
import com.sheryians.major.repository.CategoryRepository;
import com.sheryians.major.repository.UserRepository;

@Service
public class AdminService {
	
	@Autowired
	CategoryRepository catrepo;
	@Autowired
	UserRepository userrepo;
	
	public void addCategory(Category category) {
		catrepo.save(category);
	}
	
	public List<Category> getAllCategory(){
	
		return (List<Category>)catrepo.findAll();
	}
	
	 public void removeCategoryById(int id) {
		  catrepo.deleteById(id);
	  }
	  
	  public Optional<Category> getCategoryById(int id) {
		  
		  return catrepo.findById(id);
	  }
	  
	  public List<User> getAllUsers(){
			
			return (List<User>)userrepo.findAll();
		}
}
