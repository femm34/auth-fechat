package com.microservice.userAuthService.models.dao;

import com.microservice.userAuthService.models.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer > {
}
