import java.util.Scanner;

public class DividebyZero {
  public static void main(String[] args) {

// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0
    Scanner input = new Scanner(System.in);
    System.out.println("Write a number");
    int number = input.nextInt();
    System.out.println(div(number));


  }

  private static int div(int numb1) {
    int result = 0;
    try {
      result = 10 /numb1 ;
    } catch (ArithmeticException e) {
      System.out.println("Fail");
    }
    return result;
  }




}

