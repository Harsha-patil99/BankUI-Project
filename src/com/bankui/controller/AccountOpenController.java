package com.bankui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.bankui.beans.Customer;

@Controller
public class AccountOpenController {

	@Autowired
	private Customer customer; 
	
	@RequestMapping("/")
	public String showAccountOpenScreen(Model model) {
		model.addAttribute("customer", customer); 
		return "account_open";
	}
	
	@RequestMapping("/create-account")
	public String showLoginScreen(@ModelAttribute Customer customer) {
		//Call the API and pass this customer object 
		String url ="http://localhost:8181/customer";
		RestTemplate restTemplate = new RestTemplate(); 
		Customer c = restTemplate.postForObject(url, customer, Customer.class);
		return "login";
	}
}