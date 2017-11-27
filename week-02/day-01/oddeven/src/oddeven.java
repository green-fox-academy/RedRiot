import java.util.Scanner;

public class oddeven {
  public static void main(String[] args) {
    System.out.println("Write a number.");
    Scanner scanner = new Scanner(System.in);
      int userinput = scanner.nextInt();

    if (userinput % 2 == 0) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }
  }
}
