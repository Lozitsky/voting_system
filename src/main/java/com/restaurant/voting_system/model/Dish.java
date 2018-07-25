package com.restaurant.voting_system.model;

import com.restaurant.voting_system.repository.RestaurantRepository;

public class Dish extends AbstractNamedEntity{
    private RestaurantRepository restaurantRepository;

    public Dish() {
    }
    private String dishName;
    private int price;

    public Dish(String dishName, int price) {
        this.dishName = dishName;
        this.price = price;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getRestaurant(int id) {
        restaurantRepository.get(id);
    }

    public void getRestaurant(String name) {
        restaurantRepository.getByName(name);
    }
}
