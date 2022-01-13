package com.bankui.beans;

import org.springframework.stereotype.Component;

@Component
public class Balance {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Balance [balance=" + balance + "]";
	}
	
	

}
