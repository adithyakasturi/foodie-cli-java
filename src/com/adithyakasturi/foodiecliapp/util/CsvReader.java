package com.adithyakasturi.foodiecliapp.util;

import com.adithyakasturi.foodiecliapp.model.Customer;
import com.adithyakasturi.foodiecliapp.model.Dish;
import com.adithyakasturi.foodiecliapp.model.Restaurant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {

    /*
        it should read from csv file and create a List of objects
     */
    // ctrl+alt+o to delete unused imports
    public List<Customer> readCustomersFromCsv(){
        String customerCsvPath="D:\\Adithya\\Java\\Foodie-cli-app-java\\data\\customers.csv";
        List<Customer> customerList=new ArrayList<>();
        //java io class (FilerReader ,BufferReader)
        //try with resource
        String line;
        try (BufferedReader br= new BufferedReader(new FileReader(customerCsvPath))){
            String SplitBy = ",";
            br.readLine();
            while((line=br.readLine())!=null){
                String[] data = line.split(SplitBy);
                Customer customer=new Customer();
                customer.setId(data[0])
                        .setName(data[1])
                        .setEmail(data[2])
                        .setPassword(data[3]);
                customerList.add(customer);
            }
        }
        catch(IOException e){
            System.out.println("File not found in the given path: " + customerCsvPath);
            System.exit(0);
            e.printStackTrace();
        }
        return customerList;
    }

    public List<Dish> readDishesFromCsv(){
        String customerCsvPath="D:\\Adithya\\Java\\Foodie-cli-app-java\\data\\dishes.csv";
        List<Dish> disheslist=new ArrayList<>();
        //java io class (FilerReader ,BufferReader)
        //try with resource
        String line;
        try (BufferedReader br= new BufferedReader(new FileReader(customerCsvPath))){
            String SplitBy = ",";
            br.readLine();
            while((line=br.readLine())!=null){
                String[] data = line.split(SplitBy);
                Dish dish=new Dish();
                dish.setId(data[0])
                        .setName(data[1])
                        .setDescription(data[2])
                        .setPrice(Double.parseDouble(data[3]));
                disheslist.add(dish);
            }
        }
        catch(IOException e){
            System.out.println("File not found in the given path: " + customerCsvPath);
            System.exit(0);
            e.printStackTrace();
        }
        return disheslist;
    }

    public List<Restaurant> readRestaurantsFromCsv(){
        String customerCsvPath="D:\\Adithya\\Java\\Foodie-cli-app-java\\data\\restaurants.csv";
        List<Restaurant> restaurantList=new ArrayList<>();
        //java io class (FilerReader ,BufferReader)
        //try with resource
        String line;
        try (BufferedReader br= new BufferedReader(new FileReader(customerCsvPath))){
            String SplitBy = ",";
            br.readLine();
            while((line=br.readLine())!=null){
                String[] data = line.split(SplitBy);
                Restaurant restaurant=new Restaurant();
                restaurant.setId(data[0])
                        .setName(data[1])
                        .setAddress(data[2])
                        .setMenu(Arrays.asList(data[3].split(":")));
                restaurantList.add(restaurant);
            }
        }
        catch(IOException e){
            System.out.println("File not found in the given path: " + customerCsvPath);
            System.exit(0);
            e.printStackTrace();
        }
        return restaurantList;
    }


}
