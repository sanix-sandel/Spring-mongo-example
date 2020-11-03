package com.sanix.SpringMongo.repository;

import com.sanix.SpringMongo.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, BigInteger> {

    @Query("{'lastName':{'$regex':?0}}")
    List<Person> findByLastName(String lastName);

    @Query("{'username':?0}")
    Person findByUsername(String username);
}
