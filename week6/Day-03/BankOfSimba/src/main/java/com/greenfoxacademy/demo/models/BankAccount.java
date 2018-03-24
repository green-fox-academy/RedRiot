package com.greenfoxacademy.demo.models;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean isKing;
  private boolean isAGuy;

  public BankAccount() {
  }

  public BankAccount(boolean isKing, String name, double balance, String animalType, boolean isAGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
    this.isKing = isKing;
    this.isAGuy = isAGuy;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public void setAGuy(boolean AGuy) {
    isAGuy = AGuy;
  }

  public boolean isKing() {

    return isKing;
  }

  public boolean isAGuy() {
    return isAGuy;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return getName() + " " + getBalance() + "0" + " " + getCurrency() + " " + getAnimalType();
  }
}
