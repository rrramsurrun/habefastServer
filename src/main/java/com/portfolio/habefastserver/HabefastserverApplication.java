package com.portfolio.habefastserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.portfolio.habefastserver.entity.User;
import com.portfolio.habefastserver.service.UserServiceImpl;

@SpringBootApplication
public class HabefastserverApplication {

  public static void main(String[] args) {
    SpringApplication.run(HabefastserverApplication.class, args);
  }

  @Bean
  WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*").allowedMethods("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
            .allowedOrigins("http://127.0.0.1:5173/")
            .allowCredentials(true)
            .allowedHeaders("*");
      }

    };
  }

  @Autowired
  private UserServiceImpl userServiceImpl;

  @EventListener(ApplicationReadyEvent.class)
  public void addStarterData() {
    User user = new User("Admin", "123");
    userServiceImpl.saveUser(user);
  }

}
