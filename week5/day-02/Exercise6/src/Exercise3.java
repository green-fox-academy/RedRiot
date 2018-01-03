import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise3 {
  public static void main(String[] args) {
    System.out.println("Write a string:");
    Scanner input = new Scanner(System.in);

    String word = input.next();

    List<String> charList = word.chars()
            .mapToObj(character -> Character.toString((char)character))
            .map(character -> character.toLowerCase())
            .collect(Collectors.toList());

    Map<Object, Long> charFrequency = charList.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    charFrequency.entrySet().stream()
            .forEach(entry -> System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue()));
  }
}
