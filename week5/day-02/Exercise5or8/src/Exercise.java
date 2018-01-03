import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please give a string: ");
//Uppercase
    /*String writtenWord = in.next()*/
           /* .chars()
            .filter((c) -> Character.isUpperCase(c))
            .collect(StringBuilder::new,
                    StringBuilder::appendCodePoint,
                    StringBuilder::append)
            .toString();
    System.out.println("The uppercase characters are " + writtenWord);

*/
    String worWritten = in.next().chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char)c))
            .collect(Collectors.joining());
    System.out.println(worWritten);
  }
}
