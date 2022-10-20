package com.BankAppDemo.transaction.Dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TransferBalanceUsingPhoneDto {
	
	BigDecimal amount;
	private String comments;
	@Temporal(TemporalType.DATE)
	private Date date = new Date(System.currentTimeMillis());
	private String fromPhoneNo;
	private String toPhoneNo;
	public TransferBalanceUsingPhoneDto(BigDecimal amount, String comments, Date date, String fromPhoneNo,
			String toPhoneNo) {
		super();
		this.amount = amount;
		this.comments = comments;
		this.date = date;
		this.fromPhoneNo = fromPhoneNo;
		this.toPhoneNo = toPhoneNo;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFromPhoneNo() {
		return fromPhoneNo;
	}
	public void setFromPhoneNo(String fromPhoneNo) {
		this.fromPhoneNo = fromPhoneNo;
	}
	public String getToPhoneNo() {
		return toPhoneNo;
	}
	public void setToPhoneNo(String toPhoneNo) {
		this.toPhoneNo = toPhoneNo;
	}
	
	
	
	

}
