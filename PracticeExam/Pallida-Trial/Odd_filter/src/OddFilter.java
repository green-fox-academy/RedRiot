import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

  public class OddFilter {
    public static void main(String[] args) {

      System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
    }

    private static List oddFilter(List<Integer> integers) {
      List<Integer> content = new ArrayList<>();

      for (int i = 0; i < integers.size(); i++) {
        if (integers.get(i) % 2 != 0) {
          content.add(integers.get(i));
        }
      }
      return content;
    }
  }



