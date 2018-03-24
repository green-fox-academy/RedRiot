import java.util.ArrayList;
import java.util.List;

public class Inventory {
  List<Product> productList = new ArrayList<>();

  public Inventory(List<Product> productList) {
    this.productList = productList;
  }

  public  void addProduct(Product product) {
    productList.add(product);

  }

  public void sumProdPrice() {


  }
}


