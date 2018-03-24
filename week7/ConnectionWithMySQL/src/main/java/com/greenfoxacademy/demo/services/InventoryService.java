package com.greenfoxacademy.demo.services;


import com.greenfoxacademy.demo.model.Inventory;

import java.util.List;

public interface InventoryService {
  List<Inventory> getAllProdutcts();
  Inventory getProduct(long id);
  void create(Inventory inventory);
  void save(Inventory inventory);
  void delete(long id);
}
