import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter {
  public static void main(String... args){
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    // Add "a" to every string in the far list.
    for (int i = 0 ; i < far.size(); i ++ ) {

      String asd = far.get(i);
      asd = asd + "a";
      far.set(i, asd);
    }

    System.out.println(far);
  }
}
