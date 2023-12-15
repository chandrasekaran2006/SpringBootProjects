package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Customer;

public interface ICustomerService {
	
	List<Customer> fetchAll();
	
	Optional<Customer> fetch(String customerId);
	
	void insert(Customer customer);

	void delete(String customerId);
	
	void update(String customerId, Customer newCustomer);
}
