import java.util.ArrayList;
import java.util.List;

public class CandyShop {
    double sugarAmount;
    double moneyAmount;
    List<Sweets> candyStorage;
    static final Candy CANDY = new Candy();
    static final Lollipop LOLLIPOP = new Lollipop();
    int lollipopCounter;
    int candyCounter;

    public CandyShop(int sugarAmount) {
        candyStorage = new ArrayList<>();
        this.sugarAmount = sugarAmount;
        this.moneyAmount = moneyAmount;
    }

    public void createSweets(Sweets type) {
        if (type instanceof Candy) {
            candyStorage.add(new Candy());
            candyCounter++;
            sugarAmount = sugarAmount - type.sugar;
        }else {
            candyStorage.add(new Lollipop());
            lollipopCounter++;
            sugarAmount = sugarAmount - type.sugar;
        }
    }

  public void sell(Sweets sweets, int amount) {

    if (sweets == CANDY) {
      for (int i = 0; i < amount; i++) {
        candyStorage.remove(CANDY);
      }
      candyCounter--;
      moneyAmount = moneyAmount + sweets.raisedPrice() * amount;
    } else if (sweets != CANDY) {
      for (int i = 0; i < amount; i++) {
        candyStorage.remove(LOLLIPOP);
      }
      lollipopCounter--;
      moneyAmount = moneyAmount + sweets.raisedPrice() * amount;
    }
  }
    public void raise (int raisePercentage){
           Sweets.raisePrice += raisePercentage ;
    }

  public void buySugar(int weightOfSugar) {
    sugarAmount = sugarAmount + weightOfSugar;
    moneyAmount = moneyAmount - weightOfSugar * 0.1;
  }

    @Override
    public String toString() {
        return "Inventory: " + candyCounter + " Candies " + lollipopCounter + " Lollipops, Income:" + moneyAmount + "$, Suger: " + sugarAmount + " gr";
    }
}

