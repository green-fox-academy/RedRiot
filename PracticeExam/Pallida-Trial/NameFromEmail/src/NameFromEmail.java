import java.util.ArrayList;
import java.util.List;

public class NameFromEmail {
  public static void main(String[] args) {
    // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
    //and returns a string that represents the user name in the following format: lastName firstName
    //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
    //accents does not matter
    System.out.println(nameFromEmail("quoc.tung@outlook.com"));

  }

  private static String nameFromEmail(String s) {
    List<String> content = new ArrayList<>();
    String[] Example=s.split("[@.]");
    for (int j = 0; j <= Example.length - 1; j++) {
      content.add(Example[j]);
    }
    String name1 = content.get(1);
    String name2 = content.get(0);
    return name1.substring(0, 1).toUpperCase() + name1.substring(1) + " " + name2.substring(0, 1).toUpperCase() + name2.substring(1);
  }
}
