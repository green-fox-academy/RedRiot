package warehouse.application.services;

import org.springframework.stereotype.Service;
import warehouse.application.models.DTO.Response;
import warehouse.application.models.Item;

import java.util.List;

@Service
public interface ItemService {
  List<Item> listAllItems();
  List<String> listOfDistinctItemNames();
  List<String> listOfDistinctSizes();
  Item getItem(String itemName, String size);
  public Response result (Integer number, String type);

}
