import java.util.Collections;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing todo1 = new Thing("Get a milk");
    fleet.add(todo1);

    Thing todo2 = new Thing("Remove the Obstacles");


    fleet.add(todo2);

    Thing todo3 = new Thing("Stand up");
    todo3.complete();
    fleet.add(todo3);

    Thing todo4 = new Thing("Eat lunch");
    todo4.complete();
    fleet.add(todo4);

    Thing todo5 = new Thing("Apply job");
    fleet.add(todo5);

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Collections.sort(fleet.getThings());

    System.out.println(fleet);
  }
}