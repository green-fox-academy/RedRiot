package warehouse.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import warehouse.application.models.Item;
import warehouse.application.repositories.ItemRepository;
import warehouse.application.services.ItemService;

@Controller
public class ItemController {
  @Autowired
  ItemService itemService;
  @Autowired
  ItemRepository itemRepository;

  @GetMapping("/warehouse")
  public String mainTable(Model model) {
    model.addAttribute("listOfItems", itemService.listAllItems());
    model.addAttribute("distinctName", itemService.listOfDistinctItemNames());
    model.addAttribute("distninctSize", itemService.listOfDistinctSizes());

    return "index";
  }

  @PostMapping("/warehouse/summary")
  public String showSummary(@RequestParam String distinctName,
                            @RequestParam String distinctSize,
                            @RequestParam int number,
                            Model model) {
    Item item = itemService.getItem(distinctName, distinctSize);
    item.setInStore(number);
    int TotalPrice = item.getUnitPrice() * item.getInStore();
    model.addAttribute("item", item);
    model.addAttribute("totalPrice", TotalPrice);

    return "summary";

  }
}
