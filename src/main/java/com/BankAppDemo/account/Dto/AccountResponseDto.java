package com.BankAppDemo.account.Dto;

public class AccountResponseDto {
	private int accNo;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public AccountResponseDto(int accNo) {
		super();
		this.accNo = accNo;
	}
	

}
