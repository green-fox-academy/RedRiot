import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
      int factor = realNum();
    System.out.println(factor);

  }
  public static int Scanner() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to find the factorial of it");
    //Enter the times you want to run
    int number = input.nextInt();
    return number;
  }

  public static int realNum() {

      //Gives Prompt

    //Declares new int
    int number =Scanner();
    int factor = 1;
    //Runs loop and multiplies factor each time runned
    for (int i=1; i<=number; i++) {
      factor = factor*i;
    }
    return factor;



  }
}
