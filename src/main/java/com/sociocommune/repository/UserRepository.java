package com.sociocommune.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.sociocommune.model.User;

public interface UserRepository extends MongoRepository<User, String>,UserRepositoryCustom {

}