package com.adithyakasturi.foodiecliapp.repository;

import com.adithyakasturi.foodiecliapp.model.Dish;
import com.adithyakasturi.foodiecliapp.util.CsvReader;

import java.util.List;

public class DishesRepository {
    private List<Dish> dishList;

    public DishesRepository() {
        CsvReader csvReader = new CsvReader();
        this.dishList = csvReader.readDishesFromCsv();
    }

    public List<Dish> getDishList(){
        return this.dishList;
    }
}
