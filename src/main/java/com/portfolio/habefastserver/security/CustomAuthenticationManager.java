package com.portfolio.habefastserver.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.portfolio.habefastserver.entity.User;
import com.portfolio.habefastserver.service.UserService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CustomAuthenticationManager implements AuthenticationManager {

  private UserService userServiceImpl;
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    // Retrieve true user entity from verified username
    User user = userServiceImpl.getUser(authentication.getName());
    if (!bCryptPasswordEncoder.matches(authentication.getCredentials().toString(), user.getPassword())) {
      throw new BadCredentialsException("You provided an incorrect password.");
    }

    return new UsernamePasswordAuthenticationToken(authentication.getName(), user.getPassword());
  }
}
