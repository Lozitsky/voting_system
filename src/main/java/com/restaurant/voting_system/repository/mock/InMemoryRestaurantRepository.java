package com.restaurant.voting_system.repository.mock;

import com.restaurant.voting_system.model.Restaurant;
import com.restaurant.voting_system.repository.RestaurantRepository;

import java.util.List;

public class InMemoryRestaurantRepository implements RestaurantRepository {
    @Override
    public Restaurant save(Restaurant restaurant) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Restaurant get(int id) {
        return null;
    }

    @Override
    public Restaurant getByName(String name) {
        return null;
    }

    @Override
    public List<Restaurant> getMenu() {
        return null;
    }

    @Override
    public List<Restaurant> getMenuByDate() {
        return null;
    }
}
