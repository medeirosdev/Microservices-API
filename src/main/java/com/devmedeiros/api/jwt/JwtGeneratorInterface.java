package com.devmedeiros.api.jwt;

import com.devmedeiros.api.models.UserModel;

import java.util.Map;

public interface JwtGeneratorInterface {

    Map<String, String> generateToken(UserModel user);

}
