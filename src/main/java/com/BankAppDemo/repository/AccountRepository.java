package com.BankAppDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankAppDemo.entity.Account;

public interface AccountRepository extends JpaRepository<Integer,Account> {

	Account findByAccNo(int toAccountNumber);

	void save(Account fromAccount);

	Account findByPhoneNo(String fromPhoneNo);


}
