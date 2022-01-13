package com.bankui.beans;

import org.springframework.stereotype.Component;

@Component
public class Deposit {
    
	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Deposit [amount=" + amount + "]";
	}
	
}