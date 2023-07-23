package com.devmedeiros.api.controllers;
import java.lang.String;
import java.util.Map;

import com.devmedeiros.api.DTO.UserDTO;
import com.devmedeiros.api.auth.Security;
import com.devmedeiros.api.messagesHttp.JSONResponse;
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

    int SaltLength = 20;
    int HashLength = 50;
    @Autowired
    UserRepository UserRepo;

    @PostMapping(path = "/create")
    public Map<String, Object> createUserAccount(@ModelAttribute UserDTO userData){

        if(UserValidations.ifCredentialsExists(userData)){
            return JSONResponse.createSimple();
        }else{

        }

        String salt = Security.generateSalt(SaltLength);
        String HashUser = Security.generateRandomHash(HashLength);
        String hashedEmail = Security.getSHA512hash(userData.getEmail());
        String hashedPassword = Security.getSHA512hash(userData.getPassword() + salt);

        UserModel user = new UserModel(hashedEmail, hashedPassword , salt , HashUser );

        return "ohh yeah boy";
    }
}
