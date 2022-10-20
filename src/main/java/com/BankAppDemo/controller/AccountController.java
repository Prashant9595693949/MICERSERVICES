package com.BankAppDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BankAppDemo.entity.Transaction;
import com.BankAppDemo.pojos.TransferBalanceRequest;
import com.BankAppDemo.service.AccountService;
import com.BankAppDemo.transaction.Dto.TransactionResponseDto;
import com.BankAppDemo.transaction.Dto.TransferBalanceUsingPhoneDto;

@RestController
@RequestMapping("/Transactions")
public class AccountController {
	@Autowired
	private AccountService accservice;
	@PostMapping("/viaAccount")
	public TransactionResponseDto fundTransfer(@RequestBody TransferBalanceRequest transaferbalancerequest) {
		
		return accservice.sendMoney(transaferbalancerequest);
		
	}
	
	@PostMapping TransactionResponseDto transferfundThroughPhone(@RequestBody TransferBalanceUsingPhoneDto transferbalanceusingphonedto) {
		return accservice.sendMoneyUsingPhoneNumber(transferbalanceusingphonedto);
	}
	
	@GetMapping("/Statements")
	public List<Transaction> getStatement(@RequestParam int accNo, Integer year , Integer month){
		return accservice.getstatement(accNo,year,month);
	}

}
