package com.restaurant.voting_system.service;

import com.restaurant.voting_system.model.Person;
import com.restaurant.voting_system.util.exception.NotFoundException;

import java.util.List;

public interface PersonService {

    Person create(Person person);

    void delete(int id) throws NotFoundException;

    Person get(int id) throws NotFoundException;

    Person getByEmail(String email) throws NotFoundException;

    void update(Person person);

    List<Person> getAll();
}
