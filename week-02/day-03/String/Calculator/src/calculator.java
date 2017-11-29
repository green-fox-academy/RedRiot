import java.util.Scanner;

public class calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    System.out.println("Please write two number");
    Scanner scanner = new Scanner(System.in);
    double number1 = scanner.nextInt();
    double number2 = scanner.nextInt();
    System.out.println("Choose between the operation  + , -, / , *");
    String exp;
    exp = scanner.next();
    switch (exp){
      case "+":
        double van = number1 + number2;
        System.out.println(van);
        break;
      case "-":
        double two = number1 - number2;
        System.out.println(two);
        break;
      case "/":
        double three = number1 / number2;
        System.out.println(three);
        break;
      case "*":
        double four = number1 * number2;
        System.out.println(four);


    }


  }
}
