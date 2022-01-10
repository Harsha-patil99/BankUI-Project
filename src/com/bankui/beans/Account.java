package com.bankui.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Account {
	private Long id;
	private String accountNumber;
	private Date dateOfOpening;
	private double balance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}