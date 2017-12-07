import java.util.Scanner;

public class sumDigit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give a number");
    int number = input.nextInt();
    System.out.println(sumNumber(number));

  }

  private static int sumNumber(int n) {
    if (n == 0) {

      return 0;

    } else {

      return sumNumber(n / 10) + n % 10;
    }


  }
}
