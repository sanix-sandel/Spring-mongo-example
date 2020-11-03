package com.sanix.SpringMongo.services;

import com.sanix.SpringMongo.models.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Autowired
    PersonService personService;

    @BeforeEach
    void setUp(){
        assertNotNull(personService);
        init();
    }

    @AfterEach
    void tearDown(){
        personService.deleteAll();
    }

    @Test
    void testFindByLastName(){
        List<Person> persons=personService.findByLastName("Holmes");
        assertEquals(1, persons.size());
    }

    @Test
    void testFindByUsername(){
        Person person=personService.findByUsername("sherlock.holmes");
        assertNotNull(person);
        //logger.info("sherlock {}", person);
    }

    @Test
    void testFindAll(){
        List<Person> persons=personService.findAll();
        assertEquals(2, persons.size());
    }

    void init(){
        Person person=new Person();
        person.setLastName("Ikani");
        person.setUsername("sanick");
        personService.save(person);
        Person person2=new Person();
        person2.setUsername("judith");
        person2.setLastName("NIANGA");
        personService.save(person2);
    }

}