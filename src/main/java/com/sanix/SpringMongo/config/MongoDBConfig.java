package com.sanix.SpringMongo.config;

import com.sanix.SpringMongo.document.User;
import com.sanix.SpringMongo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return strings -> {
            userRepository.save(new User(1, "Peter", "Development", 3000L));
            userRepository.save(new User(2, "Sam", "Production", 4000L));
        };
    }

}
