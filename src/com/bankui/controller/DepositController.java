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

import com.bankui.beans.Deposit;
import com.bankui.beans.Transaction;
import com.bankui.beans.Transfer;

@Controller
public class DepositController {
	
	@Autowired
	private Deposit deposit;
	
	@RequestMapping("/process-deposit")
	public String processTransfer(@ModelAttribute Deposit deposit, HttpSession session, Model model,
			@RequestParam("amount")double amount) {
		//connect to the API
		
		RestTemplate restTemplate= new RestTemplate(); 
		//generate encoded auth_code using username and password and attach it to headers
		HttpHeaders headers = new HttpHeaders();
		String username = (String)session.getAttribute("username"); 
		String password = (String)session.getAttribute("password"); //plain pass
		
		headers.setBasicAuth(username, password);
		
		//attach this header to request Object 
		HttpEntity<Object> request = new HttpEntity<>(deposit, headers); 
	
		
		String url="http://localhost:8181/deposit/"+amount;
		try {
			ResponseEntity entity = restTemplate.exchange(url, HttpMethod.POST, request, Deposit.class);
			Deposit deposit1 = (Deposit)entity.getBody();
			model.addAttribute("deposit", deposit);
			return "dashboard/deposit_confirm";
		}
		catch(Exception e) {
			e.printStackTrace(); 
			model.addAttribute("deposit",deposit);
			model.addAttribute("msg", "Deposite process is failed");
			return "dashboard/deposit";
		}
	}
}
