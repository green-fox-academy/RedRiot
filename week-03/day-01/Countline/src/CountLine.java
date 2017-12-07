import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLine {
  public static void main(String[] args) {
    LineCounter();
  }

  private static void LineCounter() {
    try {
      Path filePath = Paths.get("nemtext.txt");
      List<String> content = Files.readAllLines(filePath);
      int number = content.size();
      System.out.println(number);

    } catch (Exception e) {
      System.out.println("0");
    }

  }
}
