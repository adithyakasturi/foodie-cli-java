package com.adithyakasturi.foodiecliapp;

import com.adithyakasturi.foodiecliapp.repository.CustomerRepository;
import com.adithyakasturi.foodiecliapp.repository.DishesRepository;
import com.adithyakasturi.foodiecliapp.repository.RestaurantRepository;
import com.adithyakasturi.foodiecliapp.util.CsvReader;

public class Main {
    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();
        System.out.println(csvReader.readCustomersFromCsv());
        CustomerRepository customerRepository =  new CustomerRepository();
        System.out.println(customerRepository.getCustomerList());
        DishesRepository dishesRepository = new DishesRepository();
        System.out.println(dishesRepository.getDishList());
        RestaurantRepository restaurantRepository = new RestaurantRepository();
        System.out.println(restaurantRepository.getRestaurantList());
    }
}
