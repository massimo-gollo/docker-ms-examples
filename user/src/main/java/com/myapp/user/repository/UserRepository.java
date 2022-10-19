package com.myapp.user.repository;

import java.util.List;

import com.myapp.user.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends  MongoRepository<User, String>{
    User findByFirstName(String firstName);
    List<User> findByLastName(String lastName);
}

