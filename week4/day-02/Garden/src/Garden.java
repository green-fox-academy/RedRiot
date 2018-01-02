import java.util.ArrayList;
import java.util.List;

public class Garden {
  private String GardenName;
  private List<Plant> PlantList = new ArrayList<>();



//constructors

  public Garden(List<Plant> plantList) {
    PlantList = plantList;
  }

  public Garden(String gardenName) {
    GardenName = gardenName;
  }



  //getter and setter

  public String getGardenName() {
    return GardenName;
  }

  public void setGardenName(String gardenName) {
    GardenName = gardenName;
  }


//methods


  public void addList(Plant plant) {
    PlantList.add(plant);

  }



    public void getinfo() {
      for (Plant plant : PlantList) {
        System.out.println("Species is " + plant.getName() + " and the current water level is: " + plant.getWater());
      }
    }

  public Plant getPlant(int i) {
    return PlantList.get(i);
  }


  public List<Plant> getPlantList() {
    return PlantList;
  }

  public int sorterPlant() {
    int number = 0;
    for (int i = 0; i < getPlantList().size(); i++) {
      if (this.getPlant(i).getWater() < 5) {
        number= number+1;
      }
    }
    return number;
  }

  public void watering(int water) {
    int amount = water / sorterPlant();
    for (int i = 0; i < this.getPlantList().size(); i++) {
      if (this.getPlant(i).thirsty(5)) {
        this.getPlant(i).water(amount);
      }
    }
  }


}

