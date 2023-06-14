package com.desafio.desafiobackend;

import com.desafio.desafiobackend.repository.IUserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = IUserRepository.class)
public class DesafiobackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiobackendApplication.class, args);
	}
}
