package com.restaurant.voting_system.repository;

import com.restaurant.voting_system.model.Dish;

import java.time.LocalDate;
import java.util.List;

public interface DishRepository {

    Dish save(Dish dish, int restaurantId);

    // false if not found
    boolean delete(int id, int restaurantId);

    // null if not found
    Dish get(int id, int restaurantId);

    // null if not found
    Dish getByName(String name, int restaurantId);

    List<Dish> getMenu(int restaurantId);

    List<Dish> getMenuByDate(LocalDate date, int restaurantId);
}
