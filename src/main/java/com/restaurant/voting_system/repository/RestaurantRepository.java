package com.restaurant.voting_system.repository;

import com.restaurant.voting_system.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    Restaurant save(Restaurant restaurant);

    // false if not found
    boolean delete(int id, int userId);

    // null if not found
    Restaurant get(int id);

    // null if not found
    Restaurant getByName(String name);

    List<Restaurant> getMenu();

    List<Restaurant> getMenuByDate(int userId);
}
