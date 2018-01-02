public class Flower extends Plant {
  public Flower() {
  }

  public Flower( String color, String name) {
    super( color, name);
  }




  public void water(int water) {
    super.water((int)(water*0.75));
  }


  public boolean thirsty(int num) {
    return super.thirsty(num);
  }
}