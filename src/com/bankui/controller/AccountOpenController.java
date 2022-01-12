package com.bankui.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.bankui.beans.Customer;
import com.bankui.beans.UserInfo;

@Controller
public class AccountOpenController {

	@Autowired
	private Customer customer; 
	@Autowired
	private UserInfo user; 
	
	@RequestMapping("/")
	public String showAccountOpenScreen(Model model) {
		model.addAttribute("customer", customer); 
		return "account_open";
	}
	
	@RequestMapping("/create-account")
	public String showLoginScreen(@ModelAttribute Customer customer, Model model) {
		//Call the API and pass this customer object 
		String url ="http://localhost:8181/customer";
		RestTemplate restTemplate = new RestTemplate(); 
		Customer c = restTemplate.postForObject(url, customer, Customer.class);
		model.addAttribute("user", user);
		model.addAttribute("msg", "");
		return "login";
	}
	
	@RequestMapping("/process-login")
	public String processLogin(@ModelAttribute UserInfo user, Model model, HttpSession session) {
		//generate encoded auth_code using username and password and attach it to headers
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth(user.getUsername(), user.getPassword());
		
		//attach this header to request Object 
		HttpEntity<Object> request = new HttpEntity<>(headers); 
		
		//call the api
		RestTemplate restTemplate = new RestTemplate();
		String url="http://localhost:8181/user";
		
		try {
			ResponseEntity<UserInfo> entity = restTemplate.exchange(url, HttpMethod.GET, request, UserInfo.class);
			UserInfo u = entity.getBody();
			session.setAttribute("username", u.getUsername()); //JSESSIONID
			session.setAttribute("password", user.getPassword()); //plain pass
			model.addAttribute("user", u);
			return "dashboard";
		}
		catch(Exception e) {
			model.addAttribute("user", user);
			model.addAttribute("msg", "Invalid Credentials"); 
			return "login";
		}
		
	}
	
	@RequestMapping("/login")
	public String showLogin(Model model) {
		model.addAttribute("user", user);
		model.addAttribute("msg", ""); 
		return "login";
	}
	
	@RequestMapping("/logout")
	public String showLogout(Model model, HttpSession session) {
		model.addAttribute("user", user);
		model.addAttribute("msg", "You are logged out");
		session.invalidate();
		return "login";
	}
}