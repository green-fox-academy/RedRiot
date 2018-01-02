public class Animal {
  private int hunger = 50;
 private int thirst = 50;


  public void Eat() {
    hunger -= 1;
  }

  public void Drink() {
    thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }
}