package com.sanix.SpringMongo.repository;

import com.sanix.SpringMongo.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
