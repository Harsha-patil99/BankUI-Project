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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.bankui.beans.Balance;
//import com.bankui.beans.Deposit;

@Controller
public class BalanceController {
	
	@Autowired
	private Balance balance;
	
	@RequestMapping("/process-balance")
	public String processTransfer(@ModelAttribute Balance balance, HttpSession session, Model model) {
		//connect to the API
		
		RestTemplate restTemplate= new RestTemplate(); 
		//generate encoded auth_code using username and password and attach it to headers
		HttpHeaders headers = new HttpHeaders();
		String username = (String)session.getAttribute("username"); 
		String password = (String)session.getAttribute("password"); //plain pass
		
		headers.setBasicAuth(username, password);
		
		//attach this header to request Object 
		HttpEntity<Object> request = new HttpEntity<>(balance, headers); 
		
		String url="http://localhost:8181/balance";
		
		try {
			ResponseEntity entity = restTemplate.exchange(url, HttpMethod.GET, request, Balance.class);
//			Balance balance1 = (balance)entity.getBody();
			model.addAttribute("balance", balance);
			return "dashboard/balance";
		}
		catch(Exception e) {
			e.printStackTrace(); 
			model.addAttribute("balance",balance);
			model.addAttribute("msg", "Balance is null");
			return "dashboard/balance";
		}
	}
	

}
