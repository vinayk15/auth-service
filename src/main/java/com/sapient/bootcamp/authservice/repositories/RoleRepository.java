package com.sapient.bootcamp.authservice.repositories;

import com.sapient.bootcamp.authservice.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);
}
