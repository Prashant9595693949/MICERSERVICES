package com.BankAppDemo.serviceImpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankAppDemo.entity.Account;
import com.BankAppDemo.entity.Transaction;
import com.BankAppDemo.pojos.TransferBalanceRequest;
import com.BankAppDemo.repository.AccountRepository;
import com.BankAppDemo.repository.TransactionRepository;
import com.BankAppDemo.service.AccountService;
import com.BankAppDemo.transaction.Dto.TransactionResponseDto;
import com.BankAppDemo.transaction.Dto.TransferBalanceUsingPhoneDto;
@Service
public class AccountsServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accrepo;
	@Autowired
	private TransactionRepository trrepo;
	@Override
	public TransactionResponseDto sendMoney(TransferBalanceRequest transaferbalancerequest) {
		Transaction transaction = new Transaction();
		BeanUtils.copyProperties(transaferbalancerequest, transaction);
		int fromAccountNumber=transaferbalancerequest.getFromAccountNumber();
		int toAccountNumber=transaferbalancerequest.getToAccountNumber();
		BigDecimal amount=transaferbalancerequest.getAmount();
		Account fromAccount=accrepo.findByAccNo(fromAccountNumber);
		Account toAccount=accrepo.findByAccNo(toAccountNumber);
		if(fromAccount.getBalance().compareTo(BigDecimal.ONE)==1 && fromAccount.getBalance().compareTo(amount)==1) {
			fromAccount.setBalance(fromAccount.getBalance().subtract(transaferbalancerequest.getAmount()));
			accrepo.save(fromAccount);
			toAccount.setBalance(toAccount.getBalance().add(amount));
			accrepo.save(toAccount);
			
			Transaction DBTransaction =new Transaction();
			TransactionResponseDto transactionresponsedto=new TransactionResponseDto();
			BeanUtils.copyProperties(DBTransaction, transactionresponsedto);
			return transactionresponsedto;
			
			
		}
		
		
		
		
		return null;
	}

	@Override
	public TransactionResponseDto sendMoneyUsingPhoneNumber(TransferBalanceUsingPhoneDto transferbalanceusingphonedto) {
		String fromPhoneNo=transferbalanceusingphonedto.getFromPhoneNo();
		String toPhoneno=transferbalanceusingphonedto.getToPhoneNo();
		BigDecimal amount=transferbalanceusingphonedto.getAmount();
		
	Account fromAccount=accrepo.findByPhoneNo(fromPhoneNo);
	Account toAccount=accrepo.findByPhoneNo(toPhoneno);
	if(fromAccount.getBalance().compareTo(BigDecimal.ONE)==1&& fromAccount.getBalance().compareTo(amount)==1) {
	    fromAccount.setBalance(fromAccount.getBalance().subtract(transferbalanceusingphonedto.getAmount()));
	    toAccount.setBalance(toAccount.getBalance().add(amount));
	    
	    accrepo.save(toAccount);
	    
		TransactionResponseDto transactionresponsedto=new TransactionResponseDto();
		return transactionresponsedto;
		
		
		
	}
		
		return null;
	}

	@Override
	public List<Transaction> getstatement(int accNo, Integer year, Integer month) {
		
		return trrepo.getCustomerStatement(accNo,year,month);
	}

}
