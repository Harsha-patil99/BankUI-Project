package com.bankui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

	String path="dashboard/"; 
	
	@RequestMapping("/dashboard")
	public String showDashboard(Model model) {
		return "dashboard";
	}
	
	@RequestMapping("/transfer")
	public String showTransferScreen(Model model) {
		return path+"transfer";
	}
	
	@RequestMapping("/deposit")
	public String showDepositScreen(Model model) {
		return path+"deposit";
	}
	
	@RequestMapping("/statement")
	public String showStatementScreen(Model model) {
		return path+"statement";
	}
	
	@RequestMapping("/balance")
	public String showBalanceScreen(Model model) {
		return path+"balance";
	}
	
	@RequestMapping("/settings")
	public String showSettingsScreen(Model model) {
		return path+"settings";
	}
	
	@RequestMapping("/help")
	public String showHelpScreen(Model model) {
		return path+"help";
	}
	
	 
}