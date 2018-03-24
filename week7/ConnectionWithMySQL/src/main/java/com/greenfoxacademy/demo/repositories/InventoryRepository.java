package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.model.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {
  List<Inventory> findAllByNameContains(String name);
  List<Inventory> findAllByAmountIsLessThan(String name);
}
