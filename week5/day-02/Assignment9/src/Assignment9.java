import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment9 {
  public static void main(String[] args) {
    char[] list = {'b','c','e','i','i','n','e'};
    String charStream = new String(list).chars()
            .mapToObj(c -> Character.toString((char)c))
            .collect(Collectors.joining());


    System.out.println(charStream);
  }
}
