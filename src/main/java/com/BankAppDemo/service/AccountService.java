package com.BankAppDemo.service;

import java.util.List;

import com.BankAppDemo.entity.Transaction;
import com.BankAppDemo.pojos.TransferBalanceRequest;
import com.BankAppDemo.transaction.Dto.TransactionResponseDto;
import com.BankAppDemo.transaction.Dto.TransferBalanceUsingPhoneDto;

public interface AccountService {

	TransactionResponseDto sendMoney(TransferBalanceRequest transaferbalancerequest);

	TransactionResponseDto sendMoneyUsingPhoneNumber(TransferBalanceUsingPhoneDto transferbalanceusingphonedto);

	List<Transaction> getstatement(int accNo, Integer year, Integer month);

}
