package com.devmedeiros.api.Enums;

public enum UserStatus {

    CredentialsNoExists( "Credenciais não vieram corretamente, verifique-as."),

    UserCreated("Usuário Criado com Sucesso!");

    private final String Message;

    UserStatus(String Message) {
        this.Message = Message;
    }
}
