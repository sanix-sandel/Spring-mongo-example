package com.sanix.SpringMongo.config;

import com.sanix.SpringMongo.models.Person;
import com.sanix.SpringMongo.services.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.sanix.SpringMongo.repository")
public class AppConfig {

    private final PersonService personService;

    public AppConfig(PersonService personService) {
        this.personService = personService;
    }

    @Bean
    CommandLineRunner commandLineRunner(PersonService personService){
        Person person=new Person();
        person.setLastName("ikani");
        person.setUsername("sanick");
        return strings->{
            personService.save(person);
        };
    }
}
