package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.model.Inventory;
import com.greenfoxacademy.demo.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService {

  @Autowired
  InventoryRepository inventoryRepository;

  @Override
  public List<Inventory> getAllProdutcts() {
    List<Inventory> inventories = new ArrayList<>();
    inventoryRepository.findAll().forEach(inventories::add);
    return inventories;
  }

  @Override
  public Inventory getProduct(long id) {
    return inventoryRepository.findOne(id);
  }

  @Override
  public void create(Inventory inventory) {
    inventoryRepository.save(inventory);

  }

  @Override
  public void save(Inventory inventory) {
    inventoryRepository.save(inventory);

  }

  @Override
  public void delete(long id) {
    inventoryRepository.delete(id);

  }
}
