package com.greenfoxacademy.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface UserService  {
  boolean access(String username, String password);

}
