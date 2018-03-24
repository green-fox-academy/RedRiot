package com.greenfoxacademy.demo.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  User user;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public ToDo() {
  }

  public ToDo(String title, boolean isUrgent, boolean isDone) {

    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;


  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }


}
