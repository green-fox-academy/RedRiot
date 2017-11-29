import java.util.Arrays;

public class SwapElement {
  public static void main(String[] args) {
    // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
    String[] abc = {"first", "second", "third"};
    String memory = "";
    for (int i = 0; i <abc.length; i++) {
      if (i == 0) {
        memory = abc[i];
      } else if (i == 2) {
        abc[0] = abc[i];
      }
    }
    abc[abc.length-1] = memory;
    System.out.println( Arrays.toString(abc));
  }

}


