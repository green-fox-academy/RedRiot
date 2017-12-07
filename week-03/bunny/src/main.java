import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    Scanner input = new Scanner(System.in);
    System.out.println("Write how many bunny are you seeing");
    int bunny = input.nextInt();
    System.out.println(counter(bunny));
  }

  private static int counter(int ear) {
    if (ear == 0) {
      return 0;
    } else {

      return  2+counter(ear-1);
    }
  }
}
