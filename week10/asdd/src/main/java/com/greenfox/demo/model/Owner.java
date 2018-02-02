package com.greenfox.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "owner")
public class Owner {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String Name;
  @OneToOne(mappedBy = "owner")
  Item item;

  public Owner() {

  }

  public Owner(String name) {
    Name = name;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }
}
