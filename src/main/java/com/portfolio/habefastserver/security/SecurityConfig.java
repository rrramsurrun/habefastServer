package com.portfolio.habefastserver.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import com.portfolio.habefastserver.security.filter.AuthenticationFilter;
import com.portfolio.habefastserver.security.filter.ExceptionHandlerFilter;
import com.portfolio.habefastserver.security.filter.JWTAuthorizationFilter;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SecurityConfig {

  private final CustomAuthenticationManager customAuthenticationManager;

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    AuthenticationFilter authenticationFilter = new AuthenticationFilter(customAuthenticationManager);
    authenticationFilter.setFilterProcessesUrl("/authenticate");
    http
        .csrf(csrf -> csrf.disable())
        .headers(headers -> headers.frameOptions().disable()) // TODO Remove for production, required for H2
        .authorizeHttpRequests(authorizeRequests -> authorizeRequests
            .requestMatchers("/h2/**").permitAll() // TODO Remove for production, required for H2
            .requestMatchers("/user/register").permitAll()
            .anyRequest().authenticated())
        .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
        .addFilter(authenticationFilter)
        .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
        .sessionManagement(
            sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

    return http.build();
  }

}
