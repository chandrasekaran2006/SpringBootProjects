package com.example.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.model.Customer;

@Component
public class CustomerService implements ICustomerService {

	// in memory data
	private List<Customer> customerDBList = new ArrayList<>();

	@Override
	public List<Customer> fetchAll() {
		Customer customer = new Customer();
		customer.setBirthday(new Date());
		customer.setCustomerId("1234");
		customer.setName("chandra");
		customer.setSurname("kand");
		
		customerDBList.add(customer);
		
		return customerDBList;
	}

	@Override
	public Optional<Customer> fetch(String customerId) {
		return customerDBList.stream().filter(item -> Objects.equals(item.getCustomerId(), customerId)).findAny();
	}

	@Override
	public void insert(Customer customer) {
		customerDBList.add(customer);
	}

	@Override
	public void delete(String customerId) {
		customerDBList.removeIf(item -> Objects.equals(item.getCustomerId(), customerId));
	}

	@Override
	public void update(String customerId, Customer newCustomer) {
		Optional<Customer> data = customerDBList.stream().filter(item -> Objects.equals(item.getCustomerId(), customerId)).findAny();
		if (!data.isPresent()) {
			throw new IllegalArgumentException("Data Not Found.");
		}
		customerDBList.removeIf(item -> Objects.equals(item.getCustomerId(), customerId));
		Customer model = newCustomer;
		model.setCustomerId(customerId);
		customerDBList.add(model);
	}

	
}
