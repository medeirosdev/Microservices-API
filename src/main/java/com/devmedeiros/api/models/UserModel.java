package com.devmedeiros.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHashUser() {
        return hashUser;
    }

    public void setHashUser(String hashUser) {
        this.hashUser = hashUser;
    }

    public String password;

    public String salt;

    public UserModel(String email, String password, String salt, String hashUser) {
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.hashUser = hashUser;
    }

    public String hashUser;


}
