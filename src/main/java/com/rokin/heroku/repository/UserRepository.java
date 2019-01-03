package com.rokin.heroku.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rokin.heroku.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
