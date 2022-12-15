package com.sheryians.major.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.sheryians.major.global.GlobalData;
//import com.sheryians.major.kafka.KafkaProducer;
import com.sheryians.major.model.Product;
import com.sheryians.major.service.ProductService;

@Controller
public class CartController {
	//@Autowired
	//KafkaProducer kafkaProducer;
	@Autowired
	ProductService prodSer;
	@GetMapping("/addToCart/{id}")
	public String addToCart(@PathVariable int id) {
		GlobalData.cart.add(prodSer.getProductById(id).get());
		return "redirect:/shop";
	}
	@GetMapping("/cart")
	public String cartGet(Model model) {
		model.addAttribute("cartCount", GlobalData.cart.size());
		model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
		model.addAttribute("cart", GlobalData.cart);
		
		return "cart";
	}
	
	@GetMapping("/cart/removeItem/{index}")
	public String cartItemRemove(@PathVariable int index) {
		GlobalData.cart.remove(index);
		return "redirect:/cart";
	}
	
	@GetMapping("/checkout")
	
	public String checkout(Model model) {
		model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
		return "checkout";
	}

	/*@PostMapping("/checkout")
	@Profile("checkout")
	public String postMessage(@RequestBody String message) {
		
		kafkaProducer.sendMessage(message);
		return "Message Published";
	}*/
}
