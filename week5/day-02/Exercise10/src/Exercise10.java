import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxList = new ArrayList<>();
    foxList.add( new Fox("1 fox ","asd", "green" ));
    foxList.add( new Fox("2 fox ","dsa", "grey" ));
    foxList.add( new Fox("3 fox ","pallida", "green" ));
    foxList.add( new Fox("4 fox ","klkl", "red" ));
    foxList.add( new Fox("5 fox ","jicsd", "yellow" ));
    foxList.add( new Fox("6 fox ","corsac", "green" ));
    foxList.stream()
            .filter(f -> f.color == "green")
            .forEach(f -> System.out.println(f.getName()));


    foxList.stream()
            .filter(f -> f.color.equals("green") &&  f.type.equals("pallida"))
            .forEach(f -> System.out.println(f.getName()));



  }


}
