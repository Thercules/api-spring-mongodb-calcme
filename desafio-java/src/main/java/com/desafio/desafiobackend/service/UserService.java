package com.desafio.desafiobackend.service;

import com.desafio.desafiobackend.dto.UserRegisterDto;
import com.desafio.desafiobackend.repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired()
    private IUserRepository userRepository;

    public UserRegisterDto save(String name, String email, String phone) {
        return userRepository.save(new UserRegisterDto(name, email, phone));
    }
}
