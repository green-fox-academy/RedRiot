import java.util.Scanner;

public class triangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    for (int i = 0; i < number; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
    for (int i = 0; i < number; i++) {
      for (int j = number - i - 1; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println("");


    }
  }}
