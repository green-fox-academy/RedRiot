import java.util.Scanner;

public class main {
  public static void main(String[] args) {

    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    System.out.println("Write the amount of bunnies");
    Scanner input = new Scanner(System.in);
    int numb = input.nextInt();
    System.out.println(bunnyCounter(numb));

  }

  private static int bunnyCounter(int bunny) {
    if (bunny == 0) {
      return 0;
    }
    if (bunny % 2 == 1) {
      return 2 + bunnyCounter(bunny - 1);
    } else {

      return 3 + bunnyCounter(bunny - 1);
    }
  }
}
