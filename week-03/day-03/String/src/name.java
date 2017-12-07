import java.util.Scanner;

public class name {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    String word = "xou xou";
    String x = "x";
    String y = "y";
    System.out.println(transformer(word, x, y));

  }

  private static String transformer(String yourWord, String change, String stringa) {
    if (!yourWord.contains(change)) {

      return yourWord;

    } else {
      return transformer(yourWord.replace(change, stringa), change, stringa);

    }


  }
}
