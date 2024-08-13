package com.adithyakasturi.foodiecliapp.service;

import com.adithyakasturi.foodiecliapp.exceptions.CustomerAlreadyExistException;
import com.adithyakasturi.foodiecliapp.model.Customer;

public interface CustomerService {
    public Customer save(Customer customer) throws CustomerAlreadyExistException;
}
