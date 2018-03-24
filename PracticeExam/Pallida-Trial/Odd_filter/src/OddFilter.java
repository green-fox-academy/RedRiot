import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

  public class OddFilter {

    public static void main(String[] args) {
      // Create a function that takes a list as a parameter,
      // and returns a new list with every odd element from the orignal list
      System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
      // should print [1, 3, 5]
    }

    private static List oddFilter(List<Integer> integers) {
      List<Integer> content = new ArrayList<>();
      //paratlan szamok
     /* for (int i = 0; i <integers.size() ; i++) {
        if (integers.get(i) % 2 != 0) {
          content.add(integers.get(i));
        }
        }
      return content;*/


     //paratlan elemek
      for (int i = 0; i <integers.size() ; i+=2) {

          content.add(integers.get(i));
        }

      return content;
    }
  }



