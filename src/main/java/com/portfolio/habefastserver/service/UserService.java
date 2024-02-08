package com.portfolio.habefastserver.service;

import com.portfolio.habefastserver.entity.User;

public interface UserService {
  User getUser(Long id);

  User getUser(String username);

  User saveUser(User user);
}
