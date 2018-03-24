package com.greenfoxacademy.demo;

import com.greenfoxacademy.demo.model.Inventory;
import com.greenfoxacademy.demo.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	InventoryRepository inventoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); }

	public void run(String... args) throws Exception {
		inventoryRepository.save(new Inventory("apple",60,300,false));



	}
}
