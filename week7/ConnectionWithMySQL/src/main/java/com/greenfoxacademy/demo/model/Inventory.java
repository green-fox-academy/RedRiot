package com.greenfoxacademy.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  private String name;
  private int amount;
  private int price;
  private boolean isSelected;

  public Inventory() {

  }

  public Inventory(String name, int amount, int price, boolean isSelected) {
    this.name = name;
    this.amount = amount;
    this.price = price;
    this.isSelected = false;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public boolean isSelected() {
    return isSelected;
  }

  public void setSelected(boolean selected) {
    isSelected = selected;
  }

  public void sellInventory(Inventory inventory,int amountToSell) {
    inventory.amount = inventory.amount - amountToSell;
  }
}
