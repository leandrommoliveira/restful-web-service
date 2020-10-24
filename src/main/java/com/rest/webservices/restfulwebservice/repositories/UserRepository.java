package com.rest.webservices.restfulwebservice.repositories;

import com.rest.webservices.restfulwebservice.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
