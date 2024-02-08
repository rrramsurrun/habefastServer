package com.portfolio.habefastserver.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.portfolio.habefastserver.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
  Optional<User> findByUsername(String username);
}