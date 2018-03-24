package com.greenfoxacademy.demo.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String username;
  String password;
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  List<ToDo> Todo;

  public List<ToDo> getTodo() {
    return Todo;
  }

  public void setTodo(List<ToDo> todo) {
    Todo = todo;
  }

  public User() {
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
