package com.adithyakasturi.foodiecliapp.service;

import com.adithyakasturi.foodiecliapp.exceptions.CustomerAlreadyExistException;
import com.adithyakasturi.foodiecliapp.model.Customer;
import com.adithyakasturi.foodiecliapp.repository.CustomerRepository;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{

    //adding customer repository as dependency
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) throws CustomerAlreadyExistException {
        //if customer already exists then throw customer already exit exception
        //else save in repository
        Optional<Customer> customerById =this.customerRepository.getElementById(customer.getId());
        if(customerById.isPresent()){
            throw new CustomerAlreadyExistException("Customer Already Exists with this Id: " + customer.getId());
        }
        return this.customerRepository.save(customer);
    }
}
