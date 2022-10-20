package com.BankAppDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankAppDemo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Integer, Customer> {

}
