package com.greenfox.demo.model;

import javax.lang.model.element.NestingKind;
import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class Item {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String itemName;
  String manufacturer;
  String category;
  String size;
  int unitPrice;
  int inStore;
  @OneToOne
  @JoinColumn(name = "itemID")
  Owner owner;


  public Item() {
  }

  public Item(String itemName, Owner owner) {
    this.itemName = itemName;
    this.owner = owner;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getInStore() {
    return inStore;
  }

  public void setInStore(int inStore) {
    this.inStore = inStore;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }
}
