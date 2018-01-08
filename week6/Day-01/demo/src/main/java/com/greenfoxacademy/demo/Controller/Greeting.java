package com.greenfoxacademy.demo.Controller;


public class Greeting {
  private long id;
  private String content;

  public Greeting(long ID,String content) {
    this.id = ID;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
  }

