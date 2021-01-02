package com.devstudent.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devstudent.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
