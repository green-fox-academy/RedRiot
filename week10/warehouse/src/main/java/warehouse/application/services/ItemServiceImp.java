package warehouse.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.application.models.DTO.Response;
import warehouse.application.models.Item;
import warehouse.application.repositories.ItemRepository;

import java.util.List;

@Service
public class ItemServiceImp implements ItemService {
  @Autowired
  ItemRepository itemRepository;

  @Override
  public List<Item> listAllItems() {
    return (List<Item>) itemRepository.findAll();
  }

  @Override
  public List<String> listOfDistinctItemNames() {
    return itemRepository.ListofItemNames();
  }

  @Override
  public List<String> listOfDistinctSizes() {
    return itemRepository.ListofSizes();
  }

  @Override
  public Item getItem(String itemName, String size) {
    return itemRepository.getByItemNameAndSize(itemName, size);
  }

  @Override
  public Response result(Integer number, String type) {
    Response response = new Response();
    response.setResult("ok");
    if (!type.equals(null) || number != null) {
      if (type.equals("lower")) {
        response.setResult("ok");
        response.setItems(itemRepository.getAllByUnitPriceLessThan(number));
        return response;
      } else if (type.equals("higher")) {
        response.setResult("ok");
        response.setItems(itemRepository.getAllByUnitPriceGreaterThan(number));
        return response;
      } else if (type.equals("equal")) {
        response.setResult("ok");
        response.setItems(itemRepository.getAllByUnitPriceEquals(number));
        return response;
      }else {
        response.setResult("Not ok");
        return response;
      }
    }else {
      response.setResult("not ok");
      return response;
    }
  }
}