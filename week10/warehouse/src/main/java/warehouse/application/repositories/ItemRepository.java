package warehouse.application.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import warehouse.application.models.Item;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
  @Query(value = "SELECT  DISTINCT item_name FROM warehouse ", nativeQuery = true)
  List<String> ListofItemNames();

  @Query(value = "SELECT DISTINCT size FROM  warehouse", nativeQuery = true)
  List<String> ListofSizes();
  Item getByItemNameAndSize(String itemName, String size);
  List<Item> getAllByUnitPriceGreaterThan(int price);
  List<Item> getAllByUnitPriceLessThan(int price);
  List<Item> getAllByUnitPriceEquals(int price);




}
