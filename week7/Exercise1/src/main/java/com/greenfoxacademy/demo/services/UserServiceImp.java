package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService  {
  @Autowired
  User user;

  boolean access = false;
  @Override
  public boolean access(String username, String password) {

    if (username.equals("Tung") && password.equals("123ASD")) {
      access = true;
  }
    return access;
  }
}