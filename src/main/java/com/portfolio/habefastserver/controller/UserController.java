package com.portfolio.habefastserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.portfolio.habefastserver.entity.User;
import com.portfolio.habefastserver.service.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

  UserService userService;

  @GetMapping("/{id}")
  public ResponseEntity<String> findById(@PathVariable Long id) {
    return new ResponseEntity<>(userService.getUser(id).getUsername(), HttpStatus.OK);
  }

  @PostMapping("/register")
  public ResponseEntity<HttpStatus> createUser(@Valid @RequestBody User user) {
    userService.saveUser(user);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

}
