package com.bankui.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.bankui.beans.Transaction;

@Controller
public class StatementController {

	@RequestMapping("/process-statement")
	public String processStatement(@RequestParam("startDate") String startDate, 
			@RequestParam("endDate") String endDate, HttpSession session, Model model) {
		/*
		 * call api and pass startDate and endDate
		 * 1. path variable : localhost:8181/statement/startDate/endDate
		 * 2. query params : localhost:8181/statement?startDate=<startDate>&endDate=<endDate>
		 * 3. body: { startDate : "<startDate>", endDate: "<endDate>"}
		 * 
		 */
		RestTemplate restTemplate= new RestTemplate(); 
		//generate encoded auth_code using username and password and attach it to headers
		HttpHeaders headers = new HttpHeaders();
		String username = (String)session.getAttribute("username"); 
		String password = (String)session.getAttribute("password"); //plain pass
		
		headers.setBasicAuth(username, password);
		
		//attach this header to request Object 
		HttpEntity<Object> request = new HttpEntity<>(headers); 
		
		String url="http://localhost:8181/statement/"+ startDate +"/" + endDate;
		
		try {
			ResponseEntity<List> entity = restTemplate.exchange(url, HttpMethod.GET, request, List.class);
			List<Transaction> list = (List<Transaction>) entity.getBody();
			
			model.addAttribute("list", list);
			model.addAttribute("msg", "Scroll down for statement"); 
			return "dashboard/statement";
		}
		catch(Exception e) {
			e.printStackTrace(); 
			model.addAttribute("msg", "Statement could not be generated, please check dates or contact support");
			return "dashboard/statement";
		}
	}
}