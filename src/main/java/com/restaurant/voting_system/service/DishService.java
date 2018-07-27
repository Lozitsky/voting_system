package com.restaurant.voting_system.service;

import com.restaurant.voting_system.model.Dish;
import com.restaurant.voting_system.util.exception.NotFoundException;

import java.time.LocalDate;
import java.util.List;

public interface DishService {
    Dish get(int id, int restaurantId, int personId) throws NotFoundException;

    void delete(int id, int restaurantId, int personId) throws NotFoundException;

    List<Dish> getMenu(int restaurantId, int personId);

    List<Dish> getMenuByDate(LocalDate date, int restaurantId, int personId);

    void update(Dish meal, int restaurantId, int personId) throws NotFoundException;

    Dish create(Dish meal, int restaurantId, int personId);
}
