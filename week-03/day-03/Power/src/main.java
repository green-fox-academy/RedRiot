import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give a number");
    int number = input.nextInt();
    System.out.println("GIve a power");
    int n = input.nextInt();

    System.out.println(power(number,n));

  }

  private static int power(int x, int y) {
    if (y==0) {
      return 1;
    } else {
      return x * power(x,y-1);
    }
  }
}
