import java.util.Scanner;
// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The seconf represents the number of pigs the farmer has
// It should print how many legs all the animals have

public class AnimalsandLegs {
  public static void main(String[] args) {

    System.out.println("How many chickens does the farmer has?");
    Scanner userInput = new Scanner(System.in);
    int chicken = (int)userInput.nextInt();

    System.out.println("How many pig does the farmer has?");
    Scanner userInput1 = new Scanner(System.in);
    int pig = (int)userInput1.nextInt();

    int legs = chicken * 2 + pig * 4;
    System.out.println("There are " + legs + " legs");
  }
}
