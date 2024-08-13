package com.adithyakasturi.foodiecliapp.repository;

import com.adithyakasturi.foodiecliapp.model.Restaurant;
import com.adithyakasturi.foodiecliapp.util.CsvReader;

import java.util.List;

public class RestaurantRepository {
    private List<Restaurant> restaurantList;

    public RestaurantRepository() {
        CsvReader csvReader =new CsvReader();
        this.restaurantList=csvReader.readRestaurantsFromCsv();
    }

    public List<Restaurant> getRestaurantList(){
        return this.restaurantList;
    }
}
