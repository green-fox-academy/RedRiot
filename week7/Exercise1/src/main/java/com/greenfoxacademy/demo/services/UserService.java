package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService  {
  void save(User user);
  List<User> getAllUser();
  User getUsername(long id);
  void editAssignee(User user);
  void delete(long id);
  User findByName(String name);
  User findByPassword(String password);

}
