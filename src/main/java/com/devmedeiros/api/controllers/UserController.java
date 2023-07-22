package com.devmedeiros.api.controllers;

import com.devmedeiros.api.DTO.UserDTO;
import com.devmedeiros.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository UserRepo;

    @PostMapping(path = "/create")
    public String createUserAccount(@ModelAttribute UserDTO userData){


        return "ohh yeah boy";
    }
}
