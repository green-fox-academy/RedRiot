package com.greenfoxacademy.demo.models;

public class BankAccount {
  private String name;
  private float balance;
  private String animalType;

  public String getName() {
    return name;
  }

  public float getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public BankAccount(String name, float balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  @Override
  public String toString() {

    return getName() + " " + getBalance() + " " + getAnimalType();
  }
}
