package com.restaurant.voting_system.repository;

import com.restaurant.voting_system.model.Dish;

import java.util.List;

public interface DishRepository {

    Dish save(Dish restaurant);

    // false if not found
    boolean delete(int id);

    // null if not found
    Dish get(int id);

    // null if not found
    Dish getByName(String name);

    List<Dish> getAllDish();

    List<Dish> getAllDishByDate();
}
