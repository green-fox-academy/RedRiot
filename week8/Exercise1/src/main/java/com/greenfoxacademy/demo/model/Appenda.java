package com.greenfoxacademy.demo.model;

public class Appenda {
  String appended;

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

  public Appenda(String appended) {
    this.appended = appended+"a";
  }
}
