import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.
    Scanner input = new Scanner(System.in);

    System.out.println("Give a number");
    int  number = input.nextInt();
    recursionCounter(number);

  }

    public static int recursionCounter(int n) {
      if (n == 0) {
        return 0;
      } else {
        System.out.println(n);
        return  recursionCounter(n-1);
      }
    }
}
