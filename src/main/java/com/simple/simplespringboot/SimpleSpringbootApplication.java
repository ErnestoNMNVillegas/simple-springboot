package com.simple.simplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.simple.simplespringboot.repository")
@EntityScan("com.simple.simplespringboot.model")
@SpringBootApplication
public class SimpleSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringbootApplication.class, args);
    }

}
