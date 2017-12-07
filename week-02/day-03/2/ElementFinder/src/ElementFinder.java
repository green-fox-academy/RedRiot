import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    ArrayList<Integer> two = new ArrayList<Integer>(Arrays.asList(7));

    // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
    // Do this again with a different solution using different list functions!
    if (arrayList.contains(7)) {
      System.out.println("Horray");
    } else {
      System.out.println("Nooooo");
    }
    if (arrayList.containsAll(two)) {
      System.out.println("Horray");
    } else {
      System.out.println("Nooooo");
    }

  }
}
