import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuoteSwap{
    public static void main(String... args){
      ArrayList<String> list = new ArrayList<String>(Arrays.asList("What" ,"I", "do", "create," ,"I", "cannot", "not", "understand."));
      Collections.swap(list,2,5);
      for(int i = 0; i < list.size(); i ++ ){
        System.out.print(list.get(i)+" " );

      }

      // Accidentally I messed up this quote from Richard Feynman.
      // Two words are out of place
      // Your task is to fix it by swapping the right words with code
      //"What I cannot create, I do not understand"

      // Also, print the sentence to the output with spaces in between.
    }
}
