package com.sanix.SpringMongo.services;

import com.sanix.SpringMongo.models.Person;
import com.sanix.SpringMongo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person findByUsername(String username){
        return personRepository.findByUsername(username);
    }

    public List<Person> findByLastName(String lastname){
        return personRepository.findByLastName(lastname);
    }


    public void save(Person person){
        personRepository.save(person);
    }

    public void deleteAll(){
        personRepository.deleteAll();
    }
}
