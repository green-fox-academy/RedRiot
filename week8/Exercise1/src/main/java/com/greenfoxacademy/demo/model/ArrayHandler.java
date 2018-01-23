package com.greenfoxacademy.demo.model;

public class ArrayHandler {
  private String what;
  private int[] number;

  public ArrayHandler() {
  }

  public ArrayHandler(String what, int[] number) {
    this.what = what;
    this.number = number;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumber() {
    return number;
  }

  public void setNumber(int[] number) {
    this.number = number;
  }
}


