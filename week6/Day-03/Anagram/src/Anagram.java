import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
  public static boolean isAnagram(String firstInput, String secondInput) {
    if (firstInput == null || secondInput == null) {
      return false;
    }
    char[] firstWord = firstInput.toLowerCase().toCharArray();
    char[] secondWord = secondInput.toLowerCase().toCharArray();
    Arrays.sort(firstWord);
    Arrays.sort(secondWord);

    if (Arrays.equals(firstWord,secondWord)) {
      return true;
    }
    return false;
  }

}
