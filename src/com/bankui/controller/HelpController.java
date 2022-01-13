package com.bankui.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.bankui.beans.Balance;
import com.bankui.beans.Deposit;
import com.bankui.beans.Help;

public class HelpController {
	
	@Autowired
	private Help help;
	
	@RequestMapping("/process-help")
	public String processTransfer(@ModelAttribute Help help, HttpSession session, Model model) {
		//connect to the API
		
		RestTemplate restTemplate= new RestTemplate(); 
		//generate encoded auth_code using username and password and attach it to headers
		HttpHeaders headers = new HttpHeaders();
		String username = (String)session.getAttribute("username"); 
		String password = (String)session.getAttribute("password"); //plain pass
		
		headers.setBasicAuth(username, password);
		
		//attach this header to request Object 
		HttpEntity<Object> request = new HttpEntity<>(help, headers); 
		
		String url="http://localhost:8181/help";
		
		try {
			ResponseEntity entity = restTemplate.exchange(url, HttpMethod.GET, request, Help.class);
			Help help1 = (Help)entity.getBody();
			model.addAttribute("help", help);
			return "dashboard/help";
		}
		catch(Exception e) {
			e.printStackTrace(); 
			model.addAttribute("help",help);
			model.addAttribute("msg", "Dont know ");
			return "dashboard/help";
		}
	}
	}
