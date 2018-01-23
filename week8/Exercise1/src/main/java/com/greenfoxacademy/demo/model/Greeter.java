package com.greenfoxacademy.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Greeter {
  String welcome_message;
  @JsonIgnore
  String name;
  @JsonIgnore
  String title;
  public Greeter() {
  }

  public Greeter(String name, String title) {
    this.name = name;
    this.title = title;
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
