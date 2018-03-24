package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.Inventory;
import com.greenfoxacademy.demo.repositories.InventoryRepository;
import com.greenfoxacademy.demo.services.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InventoryController {

  @Autowired
  InventoryServiceImpl inventoryService;

  @Autowired
  InventoryRepository inventoryRepository;

  @GetMapping("/")
  public String list(Model model) {
    List<Inventory> inventories = inventoryService.getAllProdutcts();
    List<Inventory> inventoryList = new ArrayList<>();

    for (Inventory inventory : inventories) {
        inventoryList.add(inventory);
      }

    model.addAttribute("inventoryList", inventoryList);
    return "index1";

  }
}
