package com.devmedeiros.api.validations;

import com.devmedeiros.api.DTO.UserDTO;

public class UserValidations {


    public static boolean ifCredentialsExists(UserDTO user){
        if(user.getEmail() == null){
            return false;
        } else if (user.getPassword() == null) {
            return false;
        }


        return true;
    }
}
