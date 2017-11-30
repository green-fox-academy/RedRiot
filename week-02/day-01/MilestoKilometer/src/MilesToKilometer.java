import java.util.Scanner;

public class MilesToKilometer {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    System.out.println(" Hi! Give me a number and a i convert the value of km to miles. ");
    Scanner scanner = new Scanner(System.in);
    double userinput = scanner.nextInt();
    double conv = userinput * 0.621371192;
    System.out.println("The converted number is " + conv);
  }

}
