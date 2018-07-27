package com.restaurant.voting_system.repository.mock;

import com.restaurant.voting_system.model.Dish;
import com.restaurant.voting_system.repository.DishRepository;

import java.util.List;

public class InMemoryDishRepository implements DishRepository {
    @Override
    public Dish save(Dish restaurant) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Dish get(int id) {
        return null;
    }

    @Override
    public Dish getByName(String name) {
        return null;
    }

    @Override
    public List<Dish> getAllDish() {
        return null;
    }

    @Override
    public List<Dish> getAllDishByDate() {
        return null;
    }
}
