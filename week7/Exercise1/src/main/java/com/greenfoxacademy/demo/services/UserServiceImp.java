package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService  {
  @Autowired
  UserRepository userRepository;


  @Override
  public void save(User user) {
    userRepository.save(user);
  }

  @Override
  public List<User> getAllUser() {

    List<User> users =  new ArrayList<User>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

  @Override
  public User getUsername(long id) {
    return userRepository.findOne(id);
  }

  @Override
  public void editAssignee(User user) {
    userRepository.save(user);

  }

  @Override
  public void delete(long id) {
    userRepository.delete(id);
  }

  @Override
  public User findByName(String name) {
    return userRepository.findByUsername(name);
  }


  @Override
  public User findByPassword(String password) {
    return userRepository.findByPassword(password);
  }
}
