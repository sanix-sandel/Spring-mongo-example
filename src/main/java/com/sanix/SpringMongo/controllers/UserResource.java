package com.sanix.SpringMongo.controllers;


import com.sanix.SpringMongo.models.Person;
import com.sanix.SpringMongo.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private PersonRepository personRepository;

    public UserResource(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/all")
    public List<Person> getAll(){
        return personRepository.findAll();
    }
}
