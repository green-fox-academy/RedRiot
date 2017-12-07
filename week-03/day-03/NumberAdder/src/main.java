import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    Scanner input = new Scanner(System.in);
    System.out.println("Give a number");
    int number = input.nextInt();
    System.out.println(numberAdder(number));

    
  }

  private static int numberAdder(int n) {
    int sum = 0;
      if (n == 0) {
        return 0;
      } else {

        return  numberAdder(n-1)+n;


      }

  }
}
