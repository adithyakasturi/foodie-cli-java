package com.adithyakasturi.foodiecliapp.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    private String id;
    private Customer customer;
    private Restaurant restaurant;
    private List<Dish> dishes;
    private double price;
    private Date orderdate;

    public Order() {
    }

    public String getId() {
        return id;
    }

    public Order setId(String id) {
        this.id = id;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Order setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        return this;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Order setDishes(List<Dish> dishes) {
        this.dishes = dishes;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Order setPrice(double price) {
        this.price = price;
        return this;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public Order setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(price, order.price) == 0 && Objects.equals(id, order.id) && Objects.equals(customer, order.customer) && Objects.equals(restaurant, order.restaurant) && Objects.equals(dishes, order.dishes) && Objects.equals(orderdate, order.orderdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, restaurant, dishes, price, orderdate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", restaurant=" + restaurant +
                ", dishes=" + dishes +
                ", price=" + price +
                ", orderdate=" + orderdate +
                '}';
    }
}
