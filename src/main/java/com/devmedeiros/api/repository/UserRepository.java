package com.devmedeiros.api.repository;

import com.devmedeiros.api.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    public UserModel findByUser(String HashUser);
    public UserModel findByUserNameAndPassword(String userName, String password);
}

