package com.restaurant.voting_system.service;

import com.restaurant.voting_system.model.Restaurant;
import com.restaurant.voting_system.util.exception.NotFoundException;

import java.util.List;

public interface RestaurantService  {
    Restaurant create(Restaurant user);

    void delete(int id) throws NotFoundException;

    Restaurant get(int id) throws NotFoundException;

    Restaurant getByName(String name) throws NotFoundException;

    void update(Restaurant restaurant);

    List<Restaurant> getAll();
}
