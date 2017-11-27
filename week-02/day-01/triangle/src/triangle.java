import java.util.Scanner;

public class triangle {
  public static void main(String[] args) {
    System.out.println("Write a number");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    for (int i=0; i<num+1; i++)
    {

      for ( int j=0; j<i; j++)
      {
        System.out.print("*");
      }
      System.out.println("0");
    }


  }
}
