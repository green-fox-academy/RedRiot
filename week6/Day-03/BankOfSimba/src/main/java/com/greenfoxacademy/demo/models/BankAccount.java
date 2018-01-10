package com.greenfoxacademy.demo.models;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean isKing;
  private boolean isAGuy;

  public BankAccount(boolean isAGuy,String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
    this.isKing = false;
    this.isAGuy = isAGuy;
  }

  public BankAccount(boolean isAGuy,String name, double balance, String animalType, boolean isKing) {
    this.isAGuy = isAGuy;
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
    this.isKing = true;

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

  public boolean isKing() {
    return isKing;
  }

  public boolean isAGuy() {
    return isAGuy;
  }

  @Override
  public String toString() {
    return getName() + " " + getBalance() + "0" + " " + getCurrency() + " " + getAnimalType();
  }
}
