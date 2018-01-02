public class Plant {
  private int water;
  private String color;
  private String name;


  public Plant( String color, String name) {

    this.water = (int) (Math.random() * 5);
    this.color = color;
    this.name = name;
  }


  public Plant() {
    this.water = (int) (Math.random() * 5);
    this.color = color;
  }


  public int getWater() {
    return water;
  }

  public void setWater(int water) {
    this.water = water;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void water(int number) {
    this.water = water + number;
  }

  public boolean thirsty(int num) {
    boolean isIT;
    if (this.water < num) {
      isIT = true;
    } else {
      isIT = false;
    }
    return isIT;
  }

}



