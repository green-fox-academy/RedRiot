package com.greenfoxacademy.demo.models;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private String currency;

  public BankAccount(String name, float balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
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

  @Override
  public String toString() {
    return getName() + " " + getBalance() + "0" + " " + getCurrency() + " " + getAnimalType();
  }
}
