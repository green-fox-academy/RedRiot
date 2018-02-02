package com.greenfox.demo.Controlller;

import com.greenfox.demo.model.Item;
import com.greenfox.demo.model.OwneRepo;
import com.greenfox.demo.model.Owner;
import com.greenfox.demo.model.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  @Autowired
  OwneRepo owneRepo;

  @Autowired
  WarehouseRepository warehouseRepository;


  @PostMapping("/item")
  public void  sadasd(@RequestBody(required = false) Item item) {

      Item item1 = new Item();
      item1.setItemName(item.getItemName());
      item1.setOwner(item.getOwner());
      warehouseRepository.save(item1);

  }

    @PostMapping("/owner")
  public Owner owner(@RequestBody (required = false) Owner owner) {
      Owner owner1 = new Owner();
      owner1.setName(owner.getName());
      owneRepo.save(owner1);
  return owner1;
  }
}
