import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {

  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    List<String> begginingOfAAndEndingWithI = numbers.stream()
            .filter(n -> n.startsWith("A") && n.endsWith("I"))
            .collect(Collectors.toList());
    System.out.println(begginingOfAAndEndingWithI);


  }
}
