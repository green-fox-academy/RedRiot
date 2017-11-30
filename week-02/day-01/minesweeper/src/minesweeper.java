import java.util.Scanner;

public class minesweeper {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number");
    int input = scanner.nextInt();
    if (input%2==0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }

  }

