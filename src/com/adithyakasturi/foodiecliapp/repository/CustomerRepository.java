package com.adithyakasturi.foodiecliapp.repository;

import com.adithyakasturi.foodiecliapp.model.Customer;
import com.adithyakasturi.foodiecliapp.util.CsvReader;

import java.util.List;
import java.util.Optional;

public class CustomerRepository {
    private List<Customer> customerList;

    public CustomerRepository() {
        CsvReader csvReader = new CsvReader();
        this.customerList=csvReader.readCustomersFromCsv();
    }

    public List<Customer> getCustomerList(){
        return this.customerList;
    }

    public Customer save(Customer customer){
        this.customerList.add(customer);
        return customer;
    }

    public Optional<Customer> getElementById(String id){
        return this.customerList.stream().filter(customer -> customer.getId().equals(id)).findFirst();
    }
}
