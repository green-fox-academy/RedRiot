public class FleetOfThings {

    public static void main(String[] args) {
      Fleet fleet = new Fleet();
      // Create a fleet of things to have this output:
      // 1. [ ] Get milk
      // 2. [ ] Remove the obstacles
      // 3. [x] Stand up
      // 4. [x] Eat lunch
      Thing task = new Thing("Get Milk");
      Thing task2 = new Thing("Remove the obstacles");
      Thing task3 = new Thing("Stand Up");
      Thing task4 = new Thing("Eat Lunch");

      task3.complete();
      task4.complete();

      fleet.add(task);
      fleet.add(task2);
      fleet.add(task3);
      fleet.add(task4);
      System.out.println(fleet);
    }

}
