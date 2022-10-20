package com.BankAppDemo.pojos;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TransferBalanceRequest {
	
	private int fromAccountNumber;
	private int toAccountNumber;
	BigDecimal amount;
	private String comment;
	@Temporal(TemporalType.DATE)
	private Date date=new Date(System.currentTimeMillis());
	public int getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(int fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public int getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(int toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
