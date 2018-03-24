import java.util.*;

public class UniqueChars {

  public static void main(String[] args) {
    System.out.println(uniqueCharacter("anagram"));
  }

  public static List<Character> uniqueCharacter(String input) {
    List<Character> content = new ArrayList<>();


    for (int i = 0; i <input.length() ; i++) {
      char  characterofinputstring = input.charAt(i);
      int count = 0;
      for (int j = 0; j < input.length(); j++) {
        if (characterofinputstring == input.charAt(j)) {
          count ++;
        }
      }

      if (count == 1) {
        content.add(input.charAt(i));
      }
    }
    return content;
  }
}
