package com.desafio.desafiobackend.repository;

import com.desafio.desafiobackend.dto.UserRegisterDto;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<UserRegisterDto, String> {

}
