import java.util.Scanner;

public class printbigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    System.out.println("Give me two numbers and I will show you which one is bigger");
    Scanner scanner = new Scanner(System.in);
    int userInput1 = scanner.nextInt();
    int userInput2 = scanner.nextInt();
    if (userInput1<userInput2){
      System.out.println("The second number is bigger");
    }
    else{
      System.out.println("The first number is bigger");
    }
  }
}

