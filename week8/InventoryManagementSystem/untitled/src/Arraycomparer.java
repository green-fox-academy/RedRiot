import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraycomparer {
  public static void main(String[] args) {
    List<Integer> firstList = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
    List<Integer> secondList = new ArrayList<>(Arrays.asList(3, 4, 5, 7));

    System.out.println(Arracomp(firstList, secondList));
  }

  private static List Arracomp(List<Integer> firstList, List<Integer> secondList) {
    List<Integer> finalList = new ArrayList<>();

    for (int number : firstList) {
      if (!secondList.contains(number)) {
        finalList.add(number);
      }
    }
    return finalList;
  }
}
