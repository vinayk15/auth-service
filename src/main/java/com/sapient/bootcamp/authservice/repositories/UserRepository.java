package com.sapient.bootcamp.authservice.repositories;

import com.sapient.bootcamp.authservice.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}
