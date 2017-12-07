import java.util.Scanner;

public class d {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an odd integer number: ");
    int number = scanner.nextInt();
    int half = number /2;
    int a = 0;
    while (a < (half + 1)) {
      for (int i = a; i < half; i++) {
        System.out.print(" ");
      }
      for (int ii = 0; ii < (a * 2); ii++) {
        System.out.print("*");
      }
      System.out.println("*");
      a++;
    }
    int b = 1;
    int c = number - 2;
    while ((half + 1) < number) {
      for (int i = 0; i < b; i++) {
        System.out.print(" ");
      }
      for (int ii = 1; ii < c; ii++) {
        System.out.print("*");
      }
      System.out.println("*");
      b++;
      c-=2;
      half++;
    }

  }
}
