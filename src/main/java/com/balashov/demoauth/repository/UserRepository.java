package com.balashov.demoauth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.balashov.demoauth.model.AppUser;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Integer> {
    AppUser findByUsername(String username);
}

