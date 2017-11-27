import java.util.Scanner;

public class AverageOfInput {
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
  public static void main(String[] args) {
    System.out.println("Give me 5 numbers and  I will calculate the sum and the average.");
    Scanner  scanner = new Scanner(System.in);
    int userInput1 = scanner.nextInt();
    int userInput2 = scanner.nextInt();
    int userInput3 = scanner.nextInt();
    int userInput4 = scanner.nextInt();
    int userInput5 = scanner.nextInt();

    int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
      System.out.println("THe sum is " + sum);

    int average  =  sum / 5;
      System.out.println("THe average is " + average);
  }

}
