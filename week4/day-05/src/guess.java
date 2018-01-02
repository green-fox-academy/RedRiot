import java.util.Scanner;

public class guess {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess the number");
    for (int i = 0; i <5; i++) {

      int live = 5;
      int input = scanner.nextInt();
      int random = (int) (Math.random() * 100);
      if (input == random && live > 0) {
        System.out.println("You won");
      } else if (input < random && live > 0) {
        live = live - 1;
        if (live == 0) {
          System.out.println("You lost");
        }
        System.out.println("Too low");


      } else if (input > random && live > 0) {
        live = live - 1;
        if (live == 0) {
          System.out.println("YOu lost");
        }
        System.out.println("Too high");
      }
    }
  }
}