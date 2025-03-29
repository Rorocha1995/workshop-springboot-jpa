package com.rorocha.course.config;

import com.rorocha.course.entities.User;
import com.rorocha.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null,"Maria brown","maria@gmail.com","199999999","123456");
        User user2 = new User(null,"Alex Green","alex@gmail.com","2133333333","123456");

        userRepository.saveAll(Arrays.asList(user1,user2));

    }

    @Autowired
    private UserRepository userRepository;



}
