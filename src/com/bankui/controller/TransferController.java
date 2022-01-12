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

import com.bankui.beans.Transaction;
import com.bankui.beans.Transfer;
import com.bankui.beans.UserInfo;

@Controller
public class TransferController {

	@Autowired
	private Transfer transfer; 
	
	
	@RequestMapping("/process-transfer")
	public String processTransfer(@ModelAttribute Transfer transfer, HttpSession session, Model model) {
		//connect to the API
		
		RestTemplate restTemplate= new RestTemplate(); 
		//generate encoded auth_code using username and password and attach it to headers
		HttpHeaders headers = new HttpHeaders();
		String username = (String)session.getAttribute("username"); 
		String password = (String)session.getAttribute("password"); //plain pass
		
		headers.setBasicAuth(username, password);
		
		//attach this header to request Object 
		HttpEntity<Object> request = new HttpEntity<>(transfer, headers); 
		
		String url="http://localhost:8181/transfer";
		try {
			ResponseEntity<Transaction> entity = restTemplate.exchange(url, HttpMethod.POST, request, Transaction.class);
			Transaction transaction = entity.getBody();
			model.addAttribute("transaction", transaction);
			return "dashboard/transfer_confirm";
		}
		catch(Exception e) {
			e.printStackTrace(); 
			model.addAttribute("transfer",transfer);
			model.addAttribute("msg", "Transfer could not be processed, please try later or contact support");
			return "dashboard/transfer";
		}
		
		
	}
}