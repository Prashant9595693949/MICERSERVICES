package com.BankAppDemo.account.Dto;

import java.math.BigDecimal;

public class AccountRequestDto {
	
	private BigDecimal balance;

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public AccountRequestDto(BigDecimal balance) {
		super();
		this.balance = balance;
	}
	
	
	

}
