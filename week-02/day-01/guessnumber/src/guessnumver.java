import java.util.Random;
import java.util.Scanner;

public class guessnumver {
  public static void main(String[] args) {
    Random random = new Random();
    int magicnum = random.nextInt(100-1)+1;
    System.out.println("Guess the number from 1 -100");
    Scanner scanner = new Scanner(System.in);
    int guess = scanner.nextInt();
    if (guess == magicnum){
      System.out.println("You guessed right");
    }else if (guess > magicnum){
      System.out.println("It is too high. The real number is " + magicnum);
    }else{
      System.out.println("It is too low.The real number is " + magicnum);
    }

  }
}
