public class Tree extends Plant {


  public Tree( String color, String name) {
    super(color, name);
  }


  public void water(int number) {
    super.water((int)( 0.4*number));
  }

  public boolean thirsty(int num) {
    return super.thirsty(num);
  }
}

