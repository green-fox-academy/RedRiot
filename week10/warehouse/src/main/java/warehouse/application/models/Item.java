package warehouse.application.models;

import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class Item {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String itemName;
  private String manufacturer;
  private String category;
  private String size;
  private int unitPrice;
  private int inStore;

  public Item() {
  }

  public Item(String itemName, String manufacturer, String category, String size, int unitPrice, int inStore) {
    this.itemName = itemName;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.unitPrice = unitPrice;
    this.inStore = inStore;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getInStore() {
    return inStore;
  }

  public void setInStore(int inStore) {
    this.inStore = inStore;
  }
}
