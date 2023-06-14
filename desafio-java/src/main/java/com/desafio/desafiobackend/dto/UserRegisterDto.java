package com.desafio.desafiobackend.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class UserRegisterDto {

    @Id
    private String id;
    public String email;
    public String name;
    public String phone;

    public UserRegisterDto(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
