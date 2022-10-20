package com.BankAppDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankAppDemo.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Integer, Transaction> {

	List<Transaction> getCustomerStatement(int accNo, Integer year, Integer month);

}
