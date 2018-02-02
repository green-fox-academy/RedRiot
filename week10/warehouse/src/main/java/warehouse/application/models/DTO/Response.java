package warehouse.application.models.DTO;

import warehouse.application.models.Item;

import java.util.List;

public class Response {
  private String result;
  private List<Item> items;

  public Response() {
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }
}
