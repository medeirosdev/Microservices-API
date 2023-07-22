package com.devmedeiros.api.controllers;

import com.devmedeiros.api.DTO.UserDTO;
import com.devmedeiros.api.auth.Security;
import com.devmedeiros.api.models.UserModel;
import com.devmedeiros.api.repository.UserRepository;
import com.devmedeiros.api.validations.UserValidations;
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

        UserValidations.ifCredentialsExists(userData);

        String salt = "Aa";
        String HashUser = "aa";
        String hashedEmail = Security.getSHA512hash(userData.getEmail());
        String hashedPassword = Security.getSHA512hash(userData.getPassword() + salt);

        UserModel user = new UserModel(hashedEmail, hashedPassword , salt , HashUser );

        return "ohh yeah boy";
    }
}
