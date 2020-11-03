package com.sanix.SpringMongo.services;

import com.sanix.SpringMongo.models.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();
    Person findByUsername(String username);
    List<Person> findByLastName(String name);
    void deleteAll();
    void save(Person person);
}
