package com.restaurant.voting_system.repository;

import com.restaurant.voting_system.model.Person;

import java.util.List;

public interface PersonRepository {
    Person save(Person person);

    // false if not found
    boolean delete(int id);

    // null if not found
    Person get(int id);

    // null if not found
    Person getByEmail(String email);

    List<Person> getAll();
}
