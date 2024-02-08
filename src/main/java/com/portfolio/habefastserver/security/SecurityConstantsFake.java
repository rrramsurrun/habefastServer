package com.portfolio.habefastserver.security;

public class SecurityConstantsFake {
  public static final String SECRET_KEY = "Generate a number";
  public static final int TOKEN_EXPIRATION = 7200000; // 7200000 milliseconds = 7200 seconds = 2 hours.
  public static final String BEARER = "Bearer "; // Authorization : "Bearer " + Token
  public static final String AUTHORIZATION = "Authorization"; // "Authorization" : Bearer Token
  public static final String REGISTER_PATH = "/user/register"; // Public path that clients can use to register.
}
