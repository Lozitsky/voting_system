package com.restaurant.voting_system.web.person;

import com.restaurant.voting_system.model.Person;
import com.restaurant.voting_system.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class PersonRestController {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    PersonService service;

    public List<Person> getAll() {
        log.info("getAll");
        return service.getAll();
    }

    public Person get(int id) {
        log.info("get {}", id);
        return service.get(id);
    }

    public Person create(Person person) {
        log.info("create {}", person);
//        checkNew(person);
        return service.create(person);
    }

    public void delete(int id) {
        log.info("delete {}", id);
        service.delete(id);
    }

    public void update(Person person, int id) {
        log.info("update {} with id={}", person, id);
//        assureIdConsistent(person, id);
        service.update(person);
    }

    public Person getByMail(String email) {
        log.info("getByEmail {}", email);
        return service.getByEmail(email);
    }


}
