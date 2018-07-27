package com.restaurant.voting_system.repository.mock;

import com.restaurant.voting_system.model.Person;
import com.restaurant.voting_system.repository.PersonRepository;

import java.util.List;

public class InMemoryPersonRepositoryImpl implements PersonRepository {
    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Person get(int id) {
        return null;
    }

    @Override
    public Person getByEmail(String email) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }
}
