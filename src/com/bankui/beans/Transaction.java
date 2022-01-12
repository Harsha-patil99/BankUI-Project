package com.bankui.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Transaction {

	private Long id;
	private String accountFrom;
	private String accountTo;
	private String operationType;
	private double amount;
	private Date dateOfTransaction;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}

	public String getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(String accountTo) {
		this.accountTo = accountTo;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", accountFrom=" + accountFrom + ", accountTo=" + accountTo
				+ ", operationType=" + operationType + ", amount=" + amount + ", dateOfTransaction=" + dateOfTransaction
				+ "]";
	}

}