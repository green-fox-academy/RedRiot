package warehouse.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import warehouse.application.models.DTO.Response;
import warehouse.application.models.Item;
import warehouse.application.repositories.ItemRepository;
import warehouse.application.services.ItemServiceImp;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  ItemServiceImp itemServiceImp;
  @Autowired
  ItemRepository itemRepository;

  @GetMapping("/warehouse/query")
  public Response gimme(@RequestParam String type,
                        @RequestParam Integer price) {
    return itemServiceImp.result(price,type);
  }

}
