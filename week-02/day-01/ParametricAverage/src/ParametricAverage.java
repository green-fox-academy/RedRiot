import java.util.Arrays;
import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    System.out.println("Give me the amount of  numbers");




    Scanner scanner = new Scanner(System.in);777

    int  numbers = scanner.nextInt();
    int arr[] = new int[numbers];

    for (int i = 0; i < numbers; i++){
      System.out.println("Please enter number");
      arr[i] = scanner.nextInt();
    }
    int sum =0;
    for(int j : arr){
      sum+= j;
    }
    int ave = sum /numbers;
    System.out.println("The sum is " + sum  + " The average is " + ave);




  }
}
