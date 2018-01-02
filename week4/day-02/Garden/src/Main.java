public class Main {
  public static void main(String[] args) {

    Plant daisy = new Flower("red", "daisy");
    Plant dasd = new Tree("green", "dasd");

    Garden tungsGarden = new Garden("tungsGarden");
    tungsGarden.addList(daisy);
    tungsGarden.addList(dasd);

    tungsGarden.getinfo();

    System.out.println(tungsGarden.sorterPlant());
    tungsGarden.watering(20);
    tungsGarden.getinfo();
    tungsGarden.sorterPlant();

  }
}
