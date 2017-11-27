import java.util.Scanner;
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

public class COunt {
  public static void main(String[] args) {
    int num1, num2;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Type two numbers:");
    num1 = keyboard.nextInt();
    num2 = keyboard.nextInt();

    if (num1 < num2) {
      int counter = num1;
      while (counter <= num2) {
        System.out.print(counter + " ");
        counter = counter + 1;
      }
    } else {
      System.out.print("Error: the second number must be bigger than the first");
    }

  }
}




